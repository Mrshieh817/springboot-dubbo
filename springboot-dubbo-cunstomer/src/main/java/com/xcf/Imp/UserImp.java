package com.xcf.Imp;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xcf.Interface.IuserService;
import com.xcf.model.User;

/**
* @author 作者:大飞
* @version 创建时间：2019年2月27日 下午12:19:07
* group 用于区分，一个接口多个实现，消费者可以通过group调用相应的接口实现
*/
@Component
public class UserImp {
	@Reference(version = "1.0.0",group="xcf1")
	 IuserService iuserService;
	
	public Object test() {
		User user= iuserService.getuserinfo("hello world,这是测试!!!!");
		return user;

	}
}
