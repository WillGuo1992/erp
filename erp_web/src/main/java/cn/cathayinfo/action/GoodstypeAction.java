package cn.cathayinfo.action;
import cn.cathayinfo.biz.IGoodstypeBiz;
import cn.cathayinfo.entity.Goodstype;

/**
 * 商品分类Action 
 * @author Administrator
 *
 */
public class GoodstypeAction extends BaseAction<Goodstype> {

	private IGoodstypeBiz goodstypeBiz;

	public void setGoodstypeBiz(IGoodstypeBiz goodstypeBiz) {
		this.goodstypeBiz = goodstypeBiz;
		super.setBaseBiz(this.goodstypeBiz);
	}

}
