package cn.cathayinfo.action;
import cn.cathayinfo.biz.IStoreBiz;
import cn.cathayinfo.entity.Emp;
import cn.cathayinfo.entity.Store;

/**
 * 仓库Action 
 * @author Administrator
 *
 */
public class StoreAction extends BaseAction<Store> {

	private IStoreBiz storeBiz;

	public void setStoreBiz(IStoreBiz storeBiz) {
		this.storeBiz = storeBiz;
		super.setBaseBiz(this.storeBiz);
	}
	
	/**
	 * 只显示当前登陆用户下的仓库
	 */
	public void myList(){
		if(null == getT1()){
			//构建查询条件
			setT1(new Store());
		}
		Emp loginUser = getLoginUser();
		//查找当前登陆用户下的仓库
		getT1().setEmpuuid(loginUser.getUuid());
		super.list();
	}

}
