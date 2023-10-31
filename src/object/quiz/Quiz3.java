package object.quiz;

/*
 * 손님이 카페에서 커피를 사는 과정 구현하세요.
 * 
 * 10000원 가진 둘리는 별다방 카페에서 4000원을 내고 아메리카노를 샀습니다.
 * 20000원 가진 또치는 별다방 카페에서 4500원을 내고 라떼를 샀습니다.
 * 
 * 단, 소지금이 가격보다 적으면 커피를 살 수 없습니다.
 * */

//손님과 카페를 객체로 봄 & 메뉴들 메소드로 표현. 2명의 객체 + 별다방 객체 1 -> 3개
// 풀이는 여러가지가 될 수 있다.

public class Quiz3 {

	public static void main(String[] args) {
		1. 손님객체 정의
		2. 아이템 사는 행위
		3. 카페 객체 정의
		4. 카페의 금액 증가.
		
		
		Customer person1 = new Customer ("또치, 10000");
		person1.takeAmericano("별다방카페"); 
		
		
	
	
	}

}

class Cafe {
	String name ;
	int money ; 
	
	Cafe (String name){
		this.name = name ;
	}
	
	void take (int money) {
		this.money = this.money + money
	
	}
}

// 손님 클래스
class Customer {
	String name ;
	int budget ;
		
	void takeAmericano (Cafe cafe) {
		if (budget < 4000) {
			System.out.println("예산이 충분하지 않습니다.");
			return;
			}
		this.budget = this.budget - 4000;
		cafe.take(4000);
	}
	
	
	void takeCafe (Cafe cafe) {
		if (budget < 4500) {
			System.out.println("예산이 충분하지 않습니다.");
			return;
			}
		this.budget = this.budget - 4500;
		cafe.take(4500);
	}

}


	Customer (String name, int budget) {
		this.name = name;
		this.budget = budget;
	}
		
	void showinfo() {
		System.out.println("손님의 예산은 "+ budget + "입니다."); 
}
}

