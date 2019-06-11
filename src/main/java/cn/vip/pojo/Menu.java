package cn.vip.pojo;

import java.util.List;

/**
 * 菜单实体工具类
 *
 * @author Taeyeon
 * @createTime 2019-06-10-16:38
 */
public class Menu {

    private AuFunction mainMenu;  //主菜单
    private List<AuFunction> subMenus; //子菜单

    public List<AuFunction> getSubMenus() {
        return subMenus;
    }

    public void setSubMenus(List<AuFunction> subMenus) {
        this.subMenus = subMenus;
    }

    public AuFunction getMainMenu() {
        return mainMenu;
    }

    public void setMainMenu(AuFunction mainMenu) {
        this.mainMenu = mainMenu;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "mainMenu=" + mainMenu +
                ", subMenus=" + subMenus +
                '}';
    }
}
