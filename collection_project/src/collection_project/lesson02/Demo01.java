package collection_project.lesson02;

import java.util.ArrayList;
import java.util.Collection;

public class Demo01 {
	
	public static void main(String[] args) {
		
		/*
		 * 基本功能方法
		 * boolean add(E e)
		 * boolean remove(Object o)
		 * void clear()
		 * boolean contains(Object o)
		 * boolean isEmpty()
		 * int size()
		 * */
		// 集合中可以存放不同数据类型的对象
		// 通过多态创建一个集合
		Collection c = new ArrayList();
		// 添加数据
		boolean flgadd = c.add("java");
		System.out.println("flgadd:"+flgadd);
		c.add("PHP");
		c.add("Python");
		c.add(1);
		System.out.println(c);
		
		// 移除数据
		c.remove("PHP");
		c.remove("Python");
		System.out.println(c);
		
		// 清空集合
//		c.clear();
//		System.out.println(c);
		
		// 是否包含元素
		boolean contains = c.contains("java");
		System.out.println("contains:" + contains);
		
		System.out.println("c.isEmpty():"+c.isEmpty());
	}

}
