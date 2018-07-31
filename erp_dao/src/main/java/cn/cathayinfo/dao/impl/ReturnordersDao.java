package cn.cathayinfo.dao.impl;
import cn.cathayinfo.dao.IReturnordersDao;
import cn.cathayinfo.entity.Returnorders;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
/**
 * 退货订单数据访问类
 * @author Administrator
 *
 */
public class ReturnordersDao extends BaseDao<Returnorders> implements IReturnordersDao {

	/**
	 * 构建查询条件
	 * @return
	 */
	public DetachedCriteria getDetachedCriteria(Returnorders returnorders1,Returnorders returnorders2,Object param){
		DetachedCriteria dc=DetachedCriteria.forClass(Returnorders.class);
		if(returnorders1!=null){
			if(null != returnorders1.getType() && returnorders1.getType().trim().length()>0){
				dc.add(Restrictions.like("type", returnorders1.getType(), MatchMode.ANYWHERE));
			}
			if(null != returnorders1.getState() && returnorders1.getState().trim().length()>0){
				dc.add(Restrictions.like("state", returnorders1.getState(), MatchMode.ANYWHERE));
			}

		}
		return dc;
	}

}
