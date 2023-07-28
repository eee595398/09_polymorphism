package edu.kh.poly.ex2.model.vo;

public class Person extends Animal {
	// Animal의 추상 메서드를 오버라이딩 하지 않으면 오류 발생 
	
	private String name;
	
	public Person() {}
	
	
	
	
	public Person(String name) {
		super();
		this.name = name;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("숫가락등 도구를 이용해 먹는다");
		
	}

	@Override
	public void breath() {
		// TODO Auto-generated method stub
		System.out.println("코와 입으로 숨신다");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("두발로 걷는다");
		
	}
	
	
	//toString() 오버라이딩
	@Override
	public String toString() {
		return "Person : "+ super.toString()+ " /" + name; 
	}
	
	
}
