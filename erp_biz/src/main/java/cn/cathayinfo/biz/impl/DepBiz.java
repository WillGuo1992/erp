package cn.cathayinfo.biz.impl;
import cn.cathayinfo.biz.IDepBiz;
import cn.cathayinfo.dao.IDepDao;
import cn.cathayinfo.entity.Dep;
/**
 * 部门业务逻辑类
 * @author Administrator
 *
 */
public class DepBiz extends BaseBiz<Dep> implements IDepBiz {

	private IDepDao depDao;
	
	public void setDepDao(IDepDao depDao) {
		this.depDao = depDao;
		super.setBaseDao(this.depDao);
	}
	
}
