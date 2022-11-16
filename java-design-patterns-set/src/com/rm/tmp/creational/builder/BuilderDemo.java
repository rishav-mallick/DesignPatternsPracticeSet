package com.rm.tmp.creational.builder;

public class BuilderDemo {

	public static void main(String[] args) {
		Computer computer = new ComputerBuilder("250 GB", "16 GB").setGraphicsCardEnabled(true).build();
		System.out.println(computer.toString());
	}

}
