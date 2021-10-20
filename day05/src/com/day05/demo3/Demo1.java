package com.day05.demo3;

public class Demo1 {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.name = "马冬梅";
		p1.age = 56;
		p1.speak();
		
		Person p2 = new Person();
		p2.name = "马云";
		p2.age = 50;
		p2.speak();
		
		Person p3 = p1;
		p3.name = "马化腾";
		p3.age = 67;
		
		p1.speak();
		p3.speak();

	}

}

class Person{
//	属性
	String name;
	int age;
//	行为
	public void speak() {
		System.out.println("我是：" + name + ",今年" + age + "岁");
	}
}