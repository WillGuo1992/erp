package cn.cathayinfo.test.dao;

import cn.cathayinfo.dao.IDepDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DepDaoTest {

	@Test
	public void testDep(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath*:applicationContext_*.xml");
		IDepDao depDao = (IDepDao)ac.getBean("depDao");
		//ac.getBean("sessionFactory");
		
	}
}
