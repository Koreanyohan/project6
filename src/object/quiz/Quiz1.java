package object.quiz;

/*
 * 학생이 택시에 타는 과정을 구현하세요.
 * 
 * 둘리 학생이 택시를 타고 학교에 갑니다.
 * 택시 요금은 10000원을 지불했습니다.
 * 단, 소지금이 만원보다 적으면 택시를 탈 수 없습니다.
 * */

public class Quiz1 {

	public static void main(String[] args) {
		// 학생 ->택시 타고 학교감. 요금 10000원 지불.
		Student student = new Student("둘리", 50000); // 5만원 가진 둘리라느 ㄴ학생
		Taxi taxi = new Taxi("70합 1234");
		student.takeTaxi(taxi); // 탑승한 택시 번호
		

	}
}

//학생 클래스 구현하기
class Student {
	public String studentName ; // 학생이름
	public int money ; // 가진돈
	
	public Student (String studentName, int money) {
		this.studentName = studentName ;
		this.money = money;
	}
	
	// 택시에 타는 메소드
	public void takeTaxi(Taxi taxi) {
		if (money < 10000) {
			System.out.println("소지금이 적어 택시를 탈 수 없습니다.");
			return;
		}
		taxi.take(10000); // 10000원 지불
		this.money = this.money - 10000; // 가진돈 10000원을 잃음
	}
}

	
// 택시 클래스
class Taxi {
	public String taxiNumber; // 택시번호
	public int money; // 수입

	// 택시번호를 초기화하는 생성자
	public Taxi(String taxiNumber) {
		this.taxiNumber = taxiNumber;
	}

	// 택시에 승객을 태우는 메소드
	public void take(int money) {
		this.money = this.money + money;
	}

	public void showInfo() {
		System.out.println("택시번호 " + taxiNumber + "의 수입은 " + money + "입니다.");
	}
	
	
}
	


