package cn.cathayinfo.biz.impl;
import cn.cathayinfo.biz.IStoreBiz;
import cn.cathayinfo.dao.IStoreDao;
import cn.cathayinfo.entity.Store;
/**
 * 仓库业务逻辑类
 * @author Administrator
 *
 */
public class StoreBiz extends BaseBiz<Store> implements IStoreBiz {

	private IStoreDao storeDao;
	
	public void setStoreDao(IStoreDao storeDao) {
		this.storeDao = storeDao;
		super.setBaseDao(this.storeDao);
	}
	
}
