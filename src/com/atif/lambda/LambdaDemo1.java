package com.atif.lambda;

interface Interf {

	public void methodOne();
	public void methodTwo();
}

class Demo implements Interf {

	@Override
	public void methodOne() {
		System.out.println("method one execution");
	}

	@Override
	public void methodTwo() {
		System.out.println("Method Two executed");

	}
}

public class LambdaDemo1 {
	public static void main(String[] args) {
		Interf i = new Demo();
		i.methodOne();
		i.methodTwo();
		
		
		
	}
}