package com.chenhao.ignoreDependency;

import java.util.List;
import java.util.Set;

public class IngoreInterfaceImpl implements IgnoreInterface {
	private List<String> list;

	private Set<String> set;

	@Override
	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public void setSet(Set<String> set) {
		this.set = set;
	}

	public List<String> getList() {
		return list;
	}

	public Set<String> getSet() {
		return set;
	}
}
