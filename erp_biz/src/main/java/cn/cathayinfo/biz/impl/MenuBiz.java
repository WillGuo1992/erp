package cn.cathayinfo.biz.impl;
import cn.cathayinfo.biz.IMenuBiz;
import cn.cathayinfo.dao.IMenuDao;
import cn.cathayinfo.entity.Menu;
/**
 * 菜单业务逻辑类
 * @author Administrator
 *
 */
public class MenuBiz extends BaseBiz<Menu> implements IMenuBiz {

	private IMenuDao menuDao;
	
	public void setMenuDao(IMenuDao menuDao) {
		this.menuDao = menuDao;
		super.setBaseDao(this.menuDao);
	}
	
}
