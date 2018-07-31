package cn.cathayinfo.action;
import cn.cathayinfo.biz.IMenuBiz;
import cn.cathayinfo.entity.Menu;
import com.alibaba.fastjson.JSON;


/**
 * 菜单Action 
 * @author Administrator
 *
 */
public class MenuAction extends BaseAction<Menu> {

	private IMenuBiz menuBiz;

	public void setMenuBiz(IMenuBiz menuBiz) {
		this.menuBiz = menuBiz;
		super.setBaseBiz(this.menuBiz);
	}
	
	/**
	 * 获取菜单数据
	 */
	public void getMenuTree(){
		//通过获取主菜单，自关联就会带其下所有的菜单
		Menu menu = menuBiz.get("0");
		write(JSON.toJSONString(menu));
	}

}
