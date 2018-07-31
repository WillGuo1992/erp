package cn.cathayinfo.action;
import cn.cathayinfo.biz.ISupplierBiz;
import cn.cathayinfo.entity.Supplier;

/**
 * 供应商Action 
 * @author Administrator
 *
 */
public class SupplierAction extends BaseAction<Supplier> {

	private ISupplierBiz supplierBiz;

	public void setSupplierBiz(ISupplierBiz supplierBiz) {
		this.supplierBiz = supplierBiz;
		super.setBaseBiz(this.supplierBiz);
	}
	
	private String q;//自动补全，由easyui的combogrid自动发过来的
	public String getQ() {
		return q;
	}
	public void setQ(String q) {
		this.q = q;
	}
	
	public void list(){
		//判断查询条件是否为空
		if(null == getT1()){
			//构建查询条件
			setT1(new Supplier());
		}
		getT1().setName(q);
		super.list();
	}

}
