package com.xcf.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xcf.Interface.IuserService;
import com.xcf.model.User;

/**
 * @author 作者:大飞
 * @version 创建时间：2018年7月4日 下午3:11:10 类说明
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
	@Reference(version = "1.0.0")
	private IuserService iuserService;

	@RequestMapping("/test")
	@ResponseBody
	public Object test() {
		User user= iuserService.getuserinfo("hello world!!!!");
		return user;

	}
}
