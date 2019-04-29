package com.woniu.a;
class Fu{
	private int a = 5;
	public void xx() {
		System.out.println(this);
		System.out.println(this.a);	
	}
}

class Zi extends Fu{
	private int a = 55;
	public void z1() {
		xx();
		System.out.println(this.a+"~~~~~");
	}
}

public class A {
	public static void main(String[] args) {
		Zi zi = new Zi();
		zi.z1();
	}
}
