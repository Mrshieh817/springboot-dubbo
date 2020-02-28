package com.xcf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
* @author 作者:大飞
* @version 创建时间：2019年3月5日 下午2:09:11
* 类说明
*/

@SpringBootApplication
@ComponentScan(value = "com.xcf")
//@ImportResource(value = {"classpath:providers.xml"})  // subbo服务配置，可以用此方式加载xml，也可以在properties加载
public class Provider1Application extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(Provider1Application.class, args);
	}
}