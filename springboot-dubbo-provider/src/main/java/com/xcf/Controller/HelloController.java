package com.xcf.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xcf.Interface.IuserService;
import com.xcf.model.User;

/**
 * @author 作者:大飞
 * @version 创建时间：2018年7月4日 上午10:15:17 类说明
 */

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

	@Autowired
	private IuserService iuserService;
	@RequestMapping("/test")
	public User teString() {		
		return this.iuserService.getuserinfo("我是你爸爸");
	}
}
