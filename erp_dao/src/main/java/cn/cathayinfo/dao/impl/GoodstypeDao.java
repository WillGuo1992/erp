package cn.cathayinfo.dao.impl;
import cn.cathayinfo.dao.IGoodstypeDao;
import cn.cathayinfo.entity.Goodstype;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
/**
 * 商品分类数据访问类
 * @author Administrator
 *
 */
public class GoodstypeDao extends BaseDao<Goodstype> implements IGoodstypeDao {

	/**
	 * 构建查询条件
	 */
	public DetachedCriteria getDetachedCriteria(Goodstype goodstype1,Goodstype goodstype2,Object param){
		DetachedCriteria dc=DetachedCriteria.forClass(Goodstype.class);
		if(goodstype1!=null){
			if(null != goodstype1.getName() && goodstype1.getName().trim().length()>0){
				dc.add(Restrictions.like("name", goodstype1.getName(), MatchMode.ANYWHERE));
			}

		}
		return dc;
	}

}
