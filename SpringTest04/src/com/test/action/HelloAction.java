package com.test.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.test.dao.MessageDao;

@Service
@Scope("prototype")
public class HelloAction {
	private String msg;
	@Resource
	private MessageDao dao;

	public String execute() {
		msg = dao.getMessage();
		System.out.println("执行Action...");
		return "success";
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
