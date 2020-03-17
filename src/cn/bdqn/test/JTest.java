package cn.bdqn.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.bdqn.entity.User;
import cn.bdqn.service.UserService;

public class JTest {

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService us = (UserService) context.getBean("userService");
		List<User> userList = us.findUserList();
		for (User user : userList) {
			System.out.println("username:"+user.getUserName());
		}
	}

}
