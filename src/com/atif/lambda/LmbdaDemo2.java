package com.atif.lambda;

@FunctionalInterface
interface Intrf {
	public void MethodOne();
}
public class LmbdaDemo2 {

	public static void main(String[] args) {
		
		Intrf i = ()-> System.out.println("Method one execution...");
		i.MethodOne();
	}

}
