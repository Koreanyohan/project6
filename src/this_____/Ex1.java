package this_____;

/*
 * this 사용하기
 * */

public class Ex1 {

	public static void main(String[] args) {
		BirthDay bDay = new BirthDay () ;
		bDay.setYear(2000) ; // 태어난 연도 변경
		System.out.println(bDay);  // 참조 변수 bDay의 주소
		bDay.printThis();			// 참조 변수 bDay가 가리키는 객체의 함수호출.  this는 인스턴스 자기 자신 가리킴.
		
		

	}

}

class BirthDay {
	int year;
	
	public void setYear (int year) {
		this.year = year;  // 멤버변수 year과 같은 year임을 표시. 우항은 매개변수가 들어올 지역변수 year.
	}
	
	public void printThis () {
		System.out.println(this);
	}
	
	
}