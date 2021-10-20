package com.wpp.test01;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * 
 * @author wpp
 * 
 * Java�д����߳�����ʵ��Callable�ӿ���дcall����
 *
 */
public class MyCallable implements Callable {

	public static void main(String[] args) {
		FutureTask futureTask1 = new FutureTask(new MyCallable());
		new Thread(futureTask1, "���߳�-A").start();
		FutureTask futureTask2 = new FutureTask(new MyCallable());
		new Thread(futureTask2, "���߳�-B").start();
		// futureTask������ָ��ʱ���ڻ�ȡ�߳�ִ�еķ���ֵ����ʱ��������
		// futureTask���������첽������
		// futureTask.get(1000, TimeUnit.SECONDS);
		System.out.println(String.format("�̣߳���%s��,���п�ʼ", Thread.currentThread().getName()));
	}

	@Override
	public Object call() throws Exception {
		int sum = 0;
		int num = 50;
		for (int i = 0; i < num; i++) {
			try {
				System.out.println(String.format("�̣߳���%s��, ��ӡ��%s", Thread.currentThread().getName(),i));
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			sum += i;
		}
		System.out.println(String.format("�̣߳���%s��,���н���", Thread.currentThread().getName()));
		System.out.println("ִ�н����" + sum);
		return sum;
	}
	
	
	

}
