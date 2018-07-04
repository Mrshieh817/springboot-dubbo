package com.xcf.IMP;

import com.alibaba.dubbo.config.annotation.Service;
import com.xcf.Interface.IuserService;
import com.xcf.model.User;

/**
 * @author 作者:大飞
 * @version 创建时间：2018年7月4日 上午10:48:51 类说明
 */

@Service(version="1.0.0")
public class UserService implements IuserService {
	@Override
	public User getuserinfo(String username) {
		User mo = new User();
		mo.setID("100010");
		mo.setName(username);
		return mo;
	}
}
