package scope;
/*
 * 모든 변수의 유효범위를 작성하세요.
 * */


class person {
	
		//인스턴스 변수
		String personName ; // 인스턴스 생성시 사용가능
		int personAge;
		//클래스 변수
		static char gender = 'F'; // 인스턴스를 생성하지 않아도 사용가능. 메모리에 항시 저장
		//위의 변수들 전부 멤버변수[전역변수?]
	
	public void setPersonName (String name) {
		this.personName = name;// this.personName : 멤버변수 / name : 지역변수 (메소드 안에서만 상용가능)
	}
	
	public void setPersonAge (int age) {
		this.personAge = age; // this.personAge : 멤버변수 / name : 지역변수 (메소드 안에서만 사용 가능) 
	}

}


