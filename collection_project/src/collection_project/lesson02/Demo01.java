package collection_project.lesson02;

import java.util.ArrayList;
import java.util.Collection;

public class Demo01 {
	
	public static void main(String[] args) {
		
		/*
		 * �������ܷ���
		 * boolean add(E e)
		 * boolean remove(Object o)
		 * void clear()
		 * boolean contains(Object o)
		 * boolean isEmpty()
		 * int size()
		 * */
		// �����п��Դ�Ų�ͬ�������͵Ķ���
		// ͨ����̬����һ������
		Collection c = new ArrayList();
		// �������
		boolean flgadd = c.add("java");
		System.out.println("flgadd:"+flgadd);
		c.add("PHP");
		c.add("Python");
		c.add(1);
		System.out.println(c);
		
		// �Ƴ�����
		c.remove("PHP");
		c.remove("Python");
		System.out.println(c);
		
		// ��ռ���
//		c.clear();
//		System.out.println(c);
		
		// �Ƿ����Ԫ��
		boolean contains = c.contains("java");
		System.out.println("contains:" + contains);
		
		System.out.println("c.isEmpty():"+c.isEmpty());
	}

}
