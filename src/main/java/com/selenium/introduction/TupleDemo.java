package com.selenium.introduction;

public class TupleDemo {
	record Employee(int id, String name, String department, String email) {}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee=new Employee(101, "Ravi","Testing", "abc@gmail.com");
		System.out.println(employee.id());
		System.out.println(employee.name());
		System.out.println(employee.department());
		System.out.println(employee.email());
	
	}

}
