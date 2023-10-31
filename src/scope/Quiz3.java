package scope;

/*
 * 모든 변수의 유효범위를 작성하세요.
 * */


public class Quiz3 {
	
	public static void main(String[]args) {
	Person person = new Person() ; // 멤버변수(인스턴스) person는 메인함수가 끝나기 전까지 사용가능.
	int i = 10; // 멤버변수(인스턴스)     i 는 메인함수가 끝나기 전까지 사용가능
			
	if (i>1) {
		String str = "안녕하세요"; // 지역변수        str은 if문 블록이 끝나기 전까지 사용가능
	}
	//지역변수 str소멸
	
	for (int k = 0 ; k <10 ; k++) {// 지역변수     k는 for문 블록이 끝나기 전까지 사용가능
		System.out.println();
	}
	//지역변수 k 소멸
	
	// 지역변수의 유효 범위는 변수가 선언된 블록 스코프에 따라 달라진다.
	// 지역변수는 선언된 메서드 밖에서는 사용 못한다. 에러뜸.

	//!! 메인 함수 끝날때까지 살아 남은 변수 : person, i
	}
	
}

class Person{}