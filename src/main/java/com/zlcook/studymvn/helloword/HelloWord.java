package com.zlcook.studymvn.helloword;

public class HelloWord
{
	public String say(){
		return "hello maven";
	}
	public static void main(String[] args){
		System.out.print(new HelloWord().say());
	}
}