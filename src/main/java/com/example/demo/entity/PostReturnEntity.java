package com.example.demo.entity;

public class PostReturnEntity {

	private boolean is_Success;

	private String user_id;

	private String email;

	private String rollNumber;

	private Integer[] numbers;

	private String[] alphabets;

	private String highest_alphabets;

	public PostReturnEntity() {
	}

	public PostReturnEntity(boolean is_Success, String user_id, String email, String rollNumber, Integer[] numbers,
			String[] alphabets, String highest_alphabets) {
		this.is_Success = is_Success;
		this.user_id = user_id;
		this.email = email;
		this.rollNumber = rollNumber;
		this.numbers = numbers;
		this.alphabets = alphabets;
		this.highest_alphabets = highest_alphabets;
	}

	public boolean isIs_Success() {
		return is_Success;
	}

	public void setIs_Success(boolean is_Success) {
		this.is_Success = is_Success;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public Integer[] getNumbers() {
		return numbers;
	}

	public void setNumbers(Integer[] numbers) {
		this.numbers = numbers;
	}

	public String[] getAlphabets() {
		return alphabets;
	}

	public void setAlphabets(String[] alphabets) {
		this.alphabets = alphabets;
	}

	public String getHighest_alphabets() {
		return highest_alphabets;
	}

	public void setHighest_alphabets(String highest_alphabets) {
		this.highest_alphabets = highest_alphabets;
	}



}
