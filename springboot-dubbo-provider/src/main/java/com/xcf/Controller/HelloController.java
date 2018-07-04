package com.xcf.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 作者:大飞
 * @version 创建时间：2018年7月4日 上午10:15:17 类说明
 */

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

	@RequestMapping("/test")
	public String teString() {
		return "hello world!";
	}
}
