package cn.cathayinfo.biz;
import java.util.List;

import cn.cathayinfo.entity.Storealert;
import cn.cathayinfo.entity.Storedetail;

import javax.mail.MessagingException;

/**
 * 仓库库存业务逻辑层接口
 * @author Administrator
 *
 */
public interface IStoredetailBiz extends IBaseBiz<Storedetail>{

	/**
	 * 获取库存预警列表
	 * @return
	 */
	List<Storealert> getStorealertList();
	
	/**
	 * 发送库存预警邮件
	 */
	void sendStorealertMail() throws MessagingException;
}

