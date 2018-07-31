package cn.cathayinfo.action;
import cn.cathayinfo.biz.IGoodsBiz;
import cn.cathayinfo.entity.Goods;

/**
 * 商品Action 
 * @author Administrator
 *
 */
public class GoodsAction extends BaseAction<Goods> {

	private IGoodsBiz goodsBiz;

	public void setGoodsBiz(IGoodsBiz goodsBiz) {
		this.goodsBiz = goodsBiz;
		super.setBaseBiz(this.goodsBiz);
	}

}
