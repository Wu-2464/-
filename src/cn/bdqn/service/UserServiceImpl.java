package cn.bdqn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.bdqn.dao.UserMapper;
import cn.bdqn.entity.User;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;

	public List<User> findUserList() {
		
		return userMapper.getUserList();
	}

	
}
