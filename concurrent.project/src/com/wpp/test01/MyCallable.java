package com.wpp.test01;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * 
 * @author wpp
 * 
 * Java中创建线程三：实现Callable接口重写call方法
 *
 */
public class MyCallable implements Callable {

	public static void main(String[] args) {
		FutureTask futureTask1 = new FutureTask(new MyCallable());
		new Thread(futureTask1, "子线程-A").start();
		FutureTask futureTask2 = new FutureTask(new MyCallable());
		new Thread(futureTask2, "子线程-B").start();
		// futureTask可以在指定时间内获取线程执行的返回值，超时则丢弃任务
		// futureTask可以用作异步任务处理
		// futureTask.get(1000, TimeUnit.SECONDS);
		System.out.println(String.format("线程：【%s】,运行开始", Thread.currentThread().getName()));
	}

	@Override
	public Object call() throws Exception {
		int sum = 0;
		int num = 50;
		for (int i = 0; i < num; i++) {
			try {
				System.out.println(String.format("线程：【%s】, 打印：%s", Thread.currentThread().getName(),i));
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			sum += i;
		}
		System.out.println(String.format("线程：【%s】,运行结束", Thread.currentThread().getName()));
		System.out.println("执行结果：" + sum);
		return sum;
	}
	
	
	

}
