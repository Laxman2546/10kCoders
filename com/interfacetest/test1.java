package com.interfacetest;

interface A{
	public void hello();
}
interface B extends A{
	public void hello();
}
class Greet implements A,B{
	@Override
	public void hello() {
		System.out.println("hello how are u?");
	}
}

public class test1 {
	public static void main(String[] args) {
		A a = new Greet();
		a.hello();
	}	
}
