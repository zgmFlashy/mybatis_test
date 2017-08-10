package mybatis.cascade.test.mapper;

import mybatis.cascade.test.po.User;

public interface UserMapper {

	/**
	 * 通过id获取用户
	 * @param fdId
	 * @return
	 */
	public User getUserById(String fdId);
	
}
