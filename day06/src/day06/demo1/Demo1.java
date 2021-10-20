package day06.demo1;

public class Demo1 {
	
	/*
	 * main方法：程序的入口
	 * @param args
	 * */

	public static void main(String[] args) {
//		测试args 的功能
//		for(int i = 0; i < args.length; i++) {
//			System.out.println(args[i]);
//		}
		
		int sum = MyMathTools.sum(100, 123);
		System.out.println(sum);

	}

}
