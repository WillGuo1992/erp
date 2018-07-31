package cn.cathayinfo.biz.impl;
import cn.cathayinfo.biz.IRoleBiz;
import cn.cathayinfo.dao.IRoleDao;
import cn.cathayinfo.entity.Role;
/**
 * 角色业务逻辑类
 * @author Administrator
 *
 */
public class RoleBiz extends BaseBiz<Role> implements IRoleBiz {

	private IRoleDao roleDao;
	
	public void setRoleDao(IRoleDao roleDao) {
		this.roleDao = roleDao;
		super.setBaseDao(this.roleDao);
	}
	
}
