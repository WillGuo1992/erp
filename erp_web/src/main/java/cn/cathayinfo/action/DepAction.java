package cn.cathayinfo.action;
import cn.cathayinfo.biz.IDepBiz;
import cn.cathayinfo.entity.Dep;

/**
 * 部门Action 
 * @author Administrator
 *
 */
public class DepAction extends BaseAction<Dep> {

	private IDepBiz depBiz;

	public void setDepBiz(IDepBiz depBiz) {
		this.depBiz = depBiz;
		super.setBaseBiz(this.depBiz);
	}

}
