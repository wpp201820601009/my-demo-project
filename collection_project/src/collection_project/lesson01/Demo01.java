package collection_project.lesson01;

public class Demo01 {
	
	public static void main(String[] args) {
		/*
		 * 需求：
		 * 	我有5个学生，请把这5个学生的信息存储到数组中，
		 * 	并遍历数组，获取得到每一个学生信息
		 * */
		
		// 1.创建学生
		Student s1 = new Student("刘德华",50);
		Student s2 = new Student("成龙",65);
		Student s3 = new Student("周星驰",62);
		Student s4 = new Student("王宝强",49);
		Student s5 = new Student("李连杰",51);
		
		// 2.创建数组并添加学生
		//基本数据类型的数组创建 存储的是基本数据类型的值
//		int[] arr = new int[5];
		Student[] students = new Student[5];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		students[3] = s4;
		students[4] = s5;
		
		// 3.遍历数组
		for(int i = 0; i < students.length; i++) {
			Student s = students[i];
			// 4.获取学生信息
			System.out.println(s);
		}
		
	}

}
