package cn.cathayinfo.biz.impl;
import cn.cathayinfo.biz.ISupplierBiz;
import cn.cathayinfo.dao.ISupplierDao;
import cn.cathayinfo.entity.Supplier;
/**
 * 供应商业务逻辑类
 * @author Administrator
 *
 */
public class SupplierBiz extends BaseBiz<Supplier> implements ISupplierBiz {

	private ISupplierDao supplierDao;
	
	public void setSupplierDao(ISupplierDao supplierDao) {
		this.supplierDao = supplierDao;
		super.setBaseDao(this.supplierDao);
	}
	
}
