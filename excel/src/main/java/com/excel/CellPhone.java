package com.excel;

public class CellPhone {
	int employeeId;
	String employeeName;
	String purchaseDate;
	String model;

	public CellPhone(int employeeId, String employeeName, String purchaseDate, String model) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.purchaseDate = purchaseDate;
		this.model = model;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
