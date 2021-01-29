package com.jlcindia.spring;

public class Hello {
	private A aobj;
	private B bobj;
	
	public Hello(B bobj) {
		System.out.println("Hello--> 1-arg cons");
		this.bobj = bobj;
	}

	public void setAobj(A aobj) {
		System.out.println("Hello-->setAobj()");
		this.aobj = aobj;
	}
	
	public void show() {
		System.out.println("Hello-->show()");
		aobj.showA();
		bobj.showB();
	}
	
}
