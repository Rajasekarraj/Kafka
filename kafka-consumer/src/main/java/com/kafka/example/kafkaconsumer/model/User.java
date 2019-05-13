package com.kafka.example.kafkaconsumer.model;

public class User {
	private String name;
	private String dpt;
	private Long salary;
	public User() {
		
	}
	public User(String name, String dpt, Long salary) {
		super();
		this.name = name;
		this.dpt = dpt;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", dpt=" + dpt + ", salary=" + salary + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDpt() {
		return dpt;
	}
	public void setDpt(String dpt) {
		this.dpt = dpt;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
}
