package cn.cathayinfo.action;
import cn.cathayinfo.biz.IInventoryBiz;
import cn.cathayinfo.entity.Inventory;

/**
 * 盘盈盘亏Action 
 * @author Administrator
 *
 */
public class InventoryAction extends BaseAction<Inventory> {

	private IInventoryBiz inventoryBiz;

	public void setInventoryBiz(IInventoryBiz inventoryBiz) {
		this.inventoryBiz = inventoryBiz;
		super.setBaseBiz(this.inventoryBiz);
	}

}
