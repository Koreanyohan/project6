package object;

/*
 *
 * */

public class Ex1 {

	public static void main(String[] args) {
		Student student = new Student ("둘리", 10000);
		Bus bus = new Bus(100); // 100 번 버스 탑승
		student.takeBus(bus);	//참조변수 bus를 takeBus의 매개변수로 전달
		student.showInfo();
		bus.showInfo();

	}

}


//버스클래스
class Bus {
	int busNumber ; // 버스번호
	int passengerCount; //  승객수
	int money ;// 요금
		
	public Bus ( int busNumber) {
		this.busNumber = busNumber;
	}
	//버스에 승객을 태우는 메소드
	public void take (int money) { // 버스 요금
		this.money = this.money + money ; // 버스 수입 증가 ( 참조변수 money에 매개변수 money 더한값을 참조변수 money에 저장)
		passengerCount++;  // 승객수 1명 증가
	}
	public void showInfo() {
		System.out.println("버스 " + busNumber + "번의 승객은"
						+ passengerCount + "명이고, 수입은" + money + "입니다.");  		// 이 매서드에 매개변수 money없음. 따라서 여기서  money는 멤버변수 money 가리킴.
	}
}

//지하철 클래스
class Subway {
	String lineNumber ; // 지하철 노선번호
	int passengerCount ; // 승객수
	int money ; // 수입
	//노선 번호
	public Subway ( String lineNumber) {
		this.lineNumber = lineNumber;
	}
	// 지하철에 승객을 태우는 메소드
	public void take (int money) {
		this.money = this.money + money; // 지하철 수입 증가
		passengerCount++;					//승객수 1명 증가
	}
	public void showInfo() {
		System.out.println("지하철" + lineNumber + "의 승객은"
				+ passengerCount + " 명이고, 수입은 " + money + "입니다.");
		}
}

//학생 클래스
class Student {
	String studentName ; // 학생이름
	int money ; // 소지금
	
	public Student (String studentName, int money) {
		this.studentName = studentName ;
		this.money = money;
	}
	
	//버스에 타서 요금 1000원을 지불하는 메서드
	public void takeBus (Bus bus) {
		bus.take(1000); // 1000원 지불
		this.money = this.money - 1000; // 가진돈 1000원을 잃음
	}
	//지하철에 타서 요금 1500원을 지불하는 메서드
	public void takeSubway (Subway subway) {
		subway.take(1500); // 1500원 지불
		this.money = this.money - 1500; // 가진돈 1500원을 잃음
	}
	public void showInfo () {
				System.out.println(studentName + "에게 남은 돈은" + money + "입니다.");	
	}
	
}





