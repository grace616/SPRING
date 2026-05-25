package com.learn.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class User {
	
	private int userId;
	private String name;
	private String mail;
	private List<String> skills;
	private Set<String> uniqueSkills;
	private Map<String,String> hobbies;
	
	
	
	public Map<String, String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(Map<String, String> hobbies) {
		this.hobbies = hobbies;
	}
	public User(int userId, String name, String mail, List<String> skills, Set<String> uniqueSkills) {
		super();
		this.userId = userId;
		this.name = name;
		this.mail = mail;
		this.skills = skills;
		this.uniqueSkills = uniqueSkills;
	}
	public Set<String> getUniqueSkills() {
		return uniqueSkills;
	}
	public void setUniqueSkills(Set<String> uniqueSkills) {
		this.uniqueSkills = uniqueSkills;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", mail=" + mail + ", skills=" + skills + ", uniqueSkills="
				+ uniqueSkills + ", hobbies=" + hobbies + "]";
	}
	public User(int userId, String name, String mail) {
		super();
		this.userId = userId;
		this.name = name;
		this.mail = mail;
	}
	public User() {
		super();
	}
	
	

}
