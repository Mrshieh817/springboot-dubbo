package com.xcf.IMP;
import javax.ws.rs.PathParam;
import com.alibaba.dubbo.config.annotation.Service;
import com.xcf.Interface.IuserService;
import com.xcf.model.User;


/**
 * @author 作者:大飞
 * @version 创建时间：2018年7月4日 上午10:48:51 
 * group 用于区分，一个接口多个实现，消费者可以通过group调用相应的接口实现
 */

@Service(version="1.0.0",group="xcf1")
public class UserService implements IuserService {
	@Override
	public User getuserinfo(@PathParam("username") String username) {
		User mo = new User();
		mo.setID("100010");
		mo.setName("大飞是我222222爸爸"+username);
		return mo;
	}
	
	
	@Override
	public String ni() {

		return "dubbo rest   test  success！22222222";
	}
}
