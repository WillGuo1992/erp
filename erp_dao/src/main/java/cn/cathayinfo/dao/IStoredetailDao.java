package cn.cathayinfo.dao;

import java.util.List;

import cn.cathayinfo.entity.Storealert;
import cn.cathayinfo.entity.Storedetail;
/**
 * 仓库库存数据访问接口
 * @author Administrator
 *
 */
public interface IStoredetailDao extends IBaseDao<Storedetail>{

	/**
	 * 获取库存预警列表
	 * @return
	 */
	List<Storealert> getStorealertList();
}
