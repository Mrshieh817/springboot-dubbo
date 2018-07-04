package com.xcf.model;

import java.io.Serializable;

/**
* @author 作者:大飞
* @version 创建时间：2018年7月4日 上午10:41:18
* 类说明
*/

@SuppressWarnings("serial")
public class User implements Serializable{
  private String ID;
  private String Name;
public String getID() {
	return ID;
}
public void setID(String iD) {
	ID = iD;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
}
