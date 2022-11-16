package com.rm.tmp.creational.prototype;

public class PrototypeExample {

	public static void main(String[] args) {
		EmployeeRecord empRecord = new EmployeeRecord(1, "John", "Lead", 24000, "Sydney");
		empRecord.showRecord();
		EmployeeRecord empRecord1 = (EmployeeRecord) empRecord.getClone();
		empRecord1.showRecord();
		EmployeeRecord empRecord2 = (EmployeeRecord) empRecord.getClone();
		empRecord2.showRecord();
	}

}
