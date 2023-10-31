package staticex;

public class Ex3 {

	public static void main(String[] args) {
		
		System.out.println(10*10*Calculator.pi);
		// pi가 static변수로 선언되서 호출할때 클래스명.pi로 호출함. 
		
		System.out.println(Calculator.plus(10,5));
		System.out.println(Calculator.minus(10,5));
		

	}

}

class Calculator {
	static double pi = 3.14159; 
// 원의 둘레를 구하는 파이값. 객체마다 고유한 값이라 static 변수로 정의.  
	
	static int plus (int x, int y ) {
		return x + y ;
	}
	
	
	static int minus (int x, int y ) {
		return x - y ;
	}
}
