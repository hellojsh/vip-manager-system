package cn.vip.utils;

import org.springframework.web.multipart.MultipartFile;
import org.apache.commons.io.FilenameUtils;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * 文件上传工具类
 * @author hellojsh
 * @create 2019-06-12 10:37
 */
public class FileUploadUtil {

    /**
     * 文件上传，上传的文件都必须符合要求才能上传成功
     * @param desc File数组，与后面的 可变参数 files 对应
     * @param fileSize 文件大小（字节：b）
     * @param extension 文件扩展名集合 eg: jpg  png
     * @param files 需要上传的文件
     * @return 0：传入的文件有为空的； 1：上传成功； 2：大小超过限制； 3：扩展名不符合要求
     */
    public static int uploadFile(File[] desc, int fileSize, List<String> extension, MultipartFile... files) throws IOException {

        for (MultipartFile file : files) {
            // 判断所有的上传文件是否有为空的
            if (file.isEmpty()) return 0;
            // 判断文件大小时候有不符合要求的
            if (file.getSize() > fileSize) return 2;
            // 判断扩展名是否有不符合要求
            // 得到原始文件后缀名
            String ex = FilenameUtils.getExtension(file.getOriginalFilename());
            if (!extension.contains(ex)) return 3;
            for (int i = 0; i < desc.length; i++) {
                file.transferTo(desc[i]);
            }
        }
        return 1;
    }
}
