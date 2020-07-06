package com.chenhao.spring;

/**
 * @author: ChenHao
 * @Description:
 * @Date: Created in 10:35 2019/6/19
 * @Modified by:
 */
public class MyTestBean {
	private String name = "ChenHao";

	public MyTestBean(String name) {
		this.name = name;
	}

	public MyTestBean() {
	}

	@Override
	public String toString() {
		return "MyTestBean{" +
				"name='" + name + '\'' +
				'}';
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args){
		System.out.println("---");
	}
}