package cn.cathayinfo.dao.impl;
import cn.cathayinfo.dao.IMenuDao;
import cn.cathayinfo.entity.Menu;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
/**
 * 菜单数据访问类
 * @author Administrator
 *
 */
public class MenuDao extends BaseDao<Menu> implements IMenuDao {

	/**
	 * 构建查询条件
	 */
	public DetachedCriteria getDetachedCriteria(Menu menu1, Menu menu2, Object param){
		DetachedCriteria dc=DetachedCriteria.forClass(Menu.class);
		return dc;
	}

}
