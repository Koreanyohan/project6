package staticex;

public class Ex2 {

	public static void main(String[] args) {

		Student2 student1 = new Student2 ();
		student1.studentName = "둘리";
		System.out.println(Student2.getCount());   
	// getCount static 메서드라서, 'class이름.메서드 이름' 으로 호출 가능.

		Student2 student2 = new Student2 ();
		student2.studentName = "도우너";
		System.out.println(Student2.getCount());
	}
}

class Student2 {
	private static int count = 0;
	int studentID;
	String studentName;

	public Student2() {
		count++;
		studentID = count;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount (int count) {
		Student2.count = count;  
		//ㄴ static 변수 메소드안에 있으면 메서드도 static으로 선언
		studentName = "둘리";
		//ㄴ static 메서드 안에서 인스턴스변수 사용하면 에러 

	}
}
