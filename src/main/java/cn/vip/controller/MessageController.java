package cn.vip.controller;

import cn.vip.pojo.LeaveMessage;
import cn.vip.pojo.Reply;
import cn.vip.service.LeaveMessageService;
import cn.vip.service.ReplyService;
import cn.vip.utils.JacksonUtil;
import cn.vip.utils.PageSupport;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

//@RequestMapping(value = "/message")
@Controller
public class MessageController {

    @Resource
    private LeaveMessageService leaveMessageService;
    @Resource
    private ReplyService replyService;

    @RequestMapping(value = "/message/messagelist.html")
    public String messagelist(Model model, @RequestParam(value = "currentpage", required = false) Integer currentPageNo) {
        //获取当前页码
        Integer _currentPageNo = currentPageNo != null ? currentPageNo : 1;
        PageSupport page = getMessageByPage(_currentPageNo, 5);
        model.addAttribute("page", page);

        return "/message/messagelist";
    }

    @RequestMapping(value = "/backend/delmessage.html", method = RequestMethod.POST)
    @ResponseBody
    public String delMessage(@RequestParam("delId") Long id) {
        if (id!=null){
            boolean delMessage = leaveMessageService.delMessage(id);
            if (delMessage) {
                return "success";
            }else {
                return "failed";
            }
        }else {
            return "nodata";
        }
    }

    @RequestMapping(value = "/message/getmessage.html", method = RequestMethod.POST)
    @ResponseBody
    public String getMessage(@RequestParam("id") Long id) {
        if (id != null) {
            LeaveMessage message = leaveMessageService.getMessageById(id);
            List<Reply> replyList = replyService.getReplyList(id);
            message.setReplyList(replyList);
            if (message != null) {
                try {
                    String json = JacksonUtil.bean2Json(message);
                    System.out.println(json);
                    return json;
                } catch (IOException e) {
                    e.printStackTrace();
                    return "failed";
                }
            } else {
                return "failed";
            }

        } else {
            return "nodata";
        }
    }

    protected PageSupport getMessageByPage(Integer currentPageNo, Integer pageSize) {
        PageSupport page = new PageSupport();

        //获取留言表总记录数
        int count = leaveMessageService.findCount();
        page.setTotalCount(count);

        //设置当前页
        if (page.getTotalCount() > 0) {
            if (currentPageNo != null)
                page.setPage(currentPageNo);
            if (page.getPage() <= 0)
                page.setPage(1);
            if (page.getPage() > page.getPageCount())
                page.setPage(page.getPageCount());
        }

        //查询当前留言信息
        List<LeaveMessage> messageList = leaveMessageService.findAllMessage(page.getPage(), pageSize);
        page.setItems(messageList);
        return page;
    }


}
