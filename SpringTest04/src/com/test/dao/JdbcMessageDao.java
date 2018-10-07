package com.test.dao;

import org.springframework.stereotype.Repository;

@Repository
public class JdbcMessageDao implements MessageDao {

	public String getMessage() {
		// 访问数据库，获取出信息
		System.out.println("访问数据库，获取出信息");
		return "新年快乐";
	}

}
