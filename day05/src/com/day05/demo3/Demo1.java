package com.day05.demo3;

public class Demo1 {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.name = "��÷";
		p1.age = 56;
		p1.speak();
		
		Person p2 = new Person();
		p2.name = "����";
		p2.age = 50;
		p2.speak();
		
		Person p3 = p1;
		p3.name = "����";
		p3.age = 67;
		
		p1.speak();
		p3.speak();

	}

}

class Person{
//	����
	String name;
	int age;
//	��Ϊ
	public void speak() {
		System.out.println("���ǣ�" + name + ",����" + age + "��");
	}
}