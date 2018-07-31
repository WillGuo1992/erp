package cn.cathayinfo.biz.impl;
import cn.cathayinfo.biz.IGoodstypeBiz;
import cn.cathayinfo.dao.IGoodstypeDao;
import cn.cathayinfo.entity.Goodstype;
/**
 * 商品分类业务逻辑类
 * @author Administrator
 *
 */
public class GoodstypeBiz extends BaseBiz<Goodstype> implements IGoodstypeBiz {

	private IGoodstypeDao goodstypeDao;
	
	public void setGoodstypeDao(IGoodstypeDao goodstypeDao) {
		this.goodstypeDao = goodstypeDao;
		super.setBaseDao(this.goodstypeDao);
	}
	
}
