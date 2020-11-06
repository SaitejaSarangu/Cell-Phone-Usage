package com.excel;

public class Details {
	int employeeId;
	int year;
	int month;
	int minutesUsed;
	int dataUsed;

	public Details(int employeeId, int year, int month, int minutesUsed, int dataUsed) {
		super();
		this.employeeId = employeeId;
		this.year = year;
		this.month = month;
		this.minutesUsed = minutesUsed;
		this.dataUsed = dataUsed;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getMinutesUsed() {
		return minutesUsed;
	}

	public void setMinutesUsed(int minutesUsed) {
		this.minutesUsed = minutesUsed;
	}

	public int getDataUsed() {
		return dataUsed;
	}

	public void setDataUsed(int dataUsed) {
		this.dataUsed = dataUsed;
	}

}
