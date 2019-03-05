package com.xcf.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xcf.Imp.UserImp;
import com.xcf.Interface.IuserService;
import com.xcf.model.User;

/**
 * @author 作者:大飞
 * @version 创建时间：2018年7月4日 下午3:11:10 类说明
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
	@Autowired
	private UserImp iuserService;

	@RequestMapping("/test")
	@ResponseBody
	public Object test() {
		 Object user= iuserService.test();
		return user;

	}
}
