package collection_project.lesson01;

public class Demo01 {
	
	public static void main(String[] args) {
		/*
		 * ����
		 * 	����5��ѧ���������5��ѧ������Ϣ�洢�������У�
		 * 	���������飬��ȡ�õ�ÿһ��ѧ����Ϣ
		 * */
		
		// 1.����ѧ��
		Student s1 = new Student("���»�",50);
		Student s2 = new Student("����",65);
		Student s3 = new Student("���ǳ�",62);
		Student s4 = new Student("����ǿ",49);
		Student s5 = new Student("������",51);
		
		// 2.�������鲢���ѧ��
		//�����������͵����鴴�� �洢���ǻ����������͵�ֵ
//		int[] arr = new int[5];
		Student[] students = new Student[5];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		students[3] = s4;
		students[4] = s5;
		
		// 3.��������
		for(int i = 0; i < students.length; i++) {
			Student s = students[i];
			// 4.��ȡѧ����Ϣ
			System.out.println(s);
		}
		
	}

}
