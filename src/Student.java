package com.schoolmanagementt.entity;

public class Student {
 private int id;
 private String name;
 private int age;
 private int standard;
 
 
public Student() {
}
public Student(int id, String name, int age, int standard) {
	this.id = id;
	this.name = name;
	this.age = age;
	this.standard = standard;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getStandard() {
	return standard;
}
public void setStandard(int standard) {
	this.standard = standard;
}
 
}
