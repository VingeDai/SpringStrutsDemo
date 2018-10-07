package com.test.action;

import com.test.dao.MessageDao;
//交由StrutsSpringObjectFactory创建
//将Spring容器中id名与setxxx一致的Bean对象注入
public class HelloAction1 {
	private String msg;
	private MessageDao dao;

	// StrutsSpringObject将Spring容器中id名与setxxx一致的Bean对象注入
	public void setJdbcMessageDao(MessageDao dao) {
		this.dao = dao;
	}

	public String execute() {
		msg = dao.getMessage();
		return "success";
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}
