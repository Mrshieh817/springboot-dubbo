package com.xcf.Imp;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xcf.Interface.IuserService;
import com.xcf.model.User;

/**
* @author 作者:大飞
* @version 创建时间：2019年2月27日 下午12:19:07
* 类说明
*/
@Component
public class UserImp {
	@Reference(version = "1.0.0")
	 IuserService iuserService;
	
	public Object test() {
		User user= iuserService.getuserinfo("hello world,这是测试!!!!");
		return user;

	}
}
