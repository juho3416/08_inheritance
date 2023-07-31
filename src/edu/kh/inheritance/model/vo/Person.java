package edu.kh.inheritance.model.vo;

public class Person extends Object{
	// class명에 Object에 대한 상속구문이 없다면
	// 컴파일러가 자동으로 extends Object 구문을 추가
	
	// 1. 필드
	private String name; //이름
	private int age; //나이
	private String nationality; //국적
	
	// 2. 생성자
	public Person() {} //기본생성자
	public Person(String name, int age, String nationality) {
		//매개변수생성자 //오버로딩 : 매개변수의 1.개수, 2.순서, 3.타입 이 다를 경우 가능
		
		this.name = name;
		this.age = age;
		this.nationality = nationality;
	
	}
	
	
	// 3. 메서드
	// getter/setter
	public String getName() { //반환하는 타입이 String
		return name;
	}
	public void setName(String name) { //void:리턴하는 값이 없어서 void
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	

	
	//상속 관련 새 메서드
	public void breath() {
		System.out.println("사람은 코나 입으로 숨을 쉰다");
	}
	
	
	//오버라이딩 관련
	public void move() {
		System.out.println("사람은 움직일 수 있다.");
		
	}
	
	
	//오버라이딩의 toString()관련
	
	@Override
	public String toString() {
		return name + " / " + age + " / " + nationality;
	}

}
