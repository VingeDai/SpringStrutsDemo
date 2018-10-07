package com.test.test;

import com.test.action.HelloAction;

public class TestClass {

	public static void main(String[] args) throws Exception {
		String s = "com.test.action.HelloAction";
		Class c = Class.forName(s);
		HelloAction helloAction = (HelloAction) c.newInstance();
		helloAction.execute();
	}
}
