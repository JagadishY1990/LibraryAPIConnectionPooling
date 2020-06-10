package com.genpact.api;

public final class ImmutableClass {
	
	final int panNum;
	final Test test;
	
	private ImmutableClass(int panNum, Test test) {
		this.panNum = panNum;
		this.test = test;
	}
	
	
	
	public void getPanNum() {
		System.out.print(test);
	}
	
	
	

}
