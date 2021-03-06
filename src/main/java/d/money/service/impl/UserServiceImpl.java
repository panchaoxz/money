package d.money.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import d.money.mapper.base.UserMapper;
import d.money.pojo.base.User;
import d.money.pojo.base.UserExample;
import d.money.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;

	private static final Logger logger = LoggerFactory
			.getLogger(AdminServiceImpl.class);

	public int countByExample(UserExample example) {
		logger.debug("selectByExample....start...userselectByExample");
		return userMapper.countByExample(example);
	}

	public User selectByPrimaryKey(int userId) {
		return userMapper.selectByPrimaryKey(userId);
	}

	public int updateByExampleSelective(User user, UserExample example) {
		return userMapper.updateByExampleSelective(user, example);
	}

	@Override
	public List<User> selectByExample(UserExample example) {
		logger.debug("selectByExample....start...userselectByExample");
		return userMapper.selectByExample(example);
	}

	@Override
	public int insert(User record) {
		logger.debug("selectByExample....start...userInsert");
		return userMapper.insert(record);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		logger.debug("deleteByPrimaryKey....start...user");
		return userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		logger.debug("deleteByPrimaryKey....start...user");
		return userMapper.updateByPrimaryKeySelective(record);
	}
}