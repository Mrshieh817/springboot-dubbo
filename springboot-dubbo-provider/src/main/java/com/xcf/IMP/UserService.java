package com.xcf.IMP;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.xcf.Interface.IuserService;
import com.xcf.model.User;


/**
 * @author 作者:大飞
 * @version 创建时间：2018年7月4日 上午10:48:51 类说明
 */

@Path("hello")
public class UserService implements IuserService {
	@Override
	@Path("test/{username}")
	@GET
	@Consumes({ MediaType.APPLICATION_JSON})
	@Produces({ MediaType.APPLICATION_JSON })
	public User getuserinfo(@PathParam("username") String username) {
		User mo = new User();
		mo.setID("100010");
		mo.setName(username);
		return mo;
	}
	
	
	@Override
	@Path("ni")
	@GET
	@Consumes({ MediaType.APPLICATION_JSON })
	@Produces({ MediaType.APPLICATION_JSON })
	public String ni() {

		return "dubbo rest   test  success！";
	}
}
