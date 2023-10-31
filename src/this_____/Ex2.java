package this_____;
/*
 * this사용하기
 * */

public class Ex2 {

	public static void main(String[] args) {
		Person person = new Person () ;
		person.setName("둘리");
		System.out.println(person);   // 참조변수 person의 주소값
		person.printThis();				// 인스턴스 가리키는 this의 주소값 

	}

}

class Person {
	String name;
	
	public void setName(String name) {
		this.name = name ; // 멤버변수 = 지역변수
	}
	
	public void printThis() {
		System.out.println(this);
	}
	
}