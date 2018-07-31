package cn.cathayinfo.biz.impl;
import cn.cathayinfo.biz.IInventoryBiz;
import cn.cathayinfo.dao.IInventoryDao;
import cn.cathayinfo.entity.Inventory;
/**
 * 盘盈盘亏业务逻辑类
 * @author Administrator
 *
 */
public class InventoryBiz extends BaseBiz<Inventory> implements IInventoryBiz {

	private IInventoryDao inventoryDao;
	
	public void setInventoryDao(IInventoryDao inventoryDao) {
		this.inventoryDao = inventoryDao;
		super.setBaseDao(this.inventoryDao);
	}
	
}
