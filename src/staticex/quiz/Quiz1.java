package staticex.quiz;

/*
 * 카드를 발급하는 프로그램을 구현하세요.
 * 
 * 카드(Card)를 정의하는 클래스를 만드세요.
 * 속성(카드번호)
 * 카드번호는 100번부터 시작하고 발급할때마다 1씩 증가합니다. -> 모든 함수가 공유하는 값 1개 = static변수 써라
 * 카드 3장을 생성한 후 카드정보를 출력하세요.
 * */

public class Quiz1 {

	public static void main(String[] args) {
		Card card = new Card();
		Card.showinfo(); // showinfo가 스태틱 매서드 이므로, 호출시 소속된클래스.매서드명 으로 호출 가능.
							// ㄴ card(참조변수).showinfo()로 안해도 된다.
		Card card2 = new Card();
		Card.showinfo();

		Card card3 = new Card();
		Card.showinfo();
	}
}

class Card {
	static int cardNum = 99;

	Card() {
		cardNum++;
	}

	static void showinfo() {
		System.out.println("카드 번호는 " + cardNum);
	}

}


//해설지 풀이

/*class Card {
	static int serialNum = 100;
	int cardNo ; //카드 번호 

	Card() {
		this.cardNo = serialNum;
		cardNum++;
	}

	static void showinfo() {
		System.out.println("카드 번호는 " + cardNo);
	}

}

*/













