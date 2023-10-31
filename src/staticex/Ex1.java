package staticex;

/*
 * static 변수 사용하기
 * */


public class Ex1 {

	public static void main(String[] args) {
		Student student1 = new Student (); 
	// ㄴ Student 참조변수 선언 -> count 증가 -> studentID 증가 -> static 변수라값 저장됨 1로
		student1.studentName = "둘리"; 
		System.out.println(student1.studentName + " 학번 : " + student1.studentID);
	
		
		Student student2 = new Student ();
		student2.studentName = "또치";
		System.out.println(student2.studentName + " 학번 : " + student2.studentID);
		
		System.out.println(Student.count);  
	//  ㄴ static 변수라   class이름.변수이름하면 호출가능. 참조변수.변수이름은 인스턴스변수 호출하는 방법
	}
}

class Student { // 클래스앞에 접근제한자 생략 -> default 생략
	static int count = 0; // 공통속성 (static 변수) - 인스턴스 변수는 객체마다 고유의 값을 가지고있어,
							//= 0 이런식으로 굳이 초기화 안해도 됨. 선언만 하면 초기화.
	int studentID ;
	String studentName ;
	
	public Student () {
		count++; 			// 학생이 생성될 때마다 증가   =  Student 객체가 만들어질때마다
		studentID = count ; //증가된 값을 학번에 부여
	}
	
}