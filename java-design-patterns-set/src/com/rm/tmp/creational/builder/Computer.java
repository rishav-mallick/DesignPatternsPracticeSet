package com.rm.tmp.creational.builder;

public class Computer {
	// required params
	private String HDD;
	private String RAM;

	// optional params
	private boolean isGraphicsCardEnabled;
	private boolean isBlueToothEnabled;

	public String getHDD() {
		return HDD;
	}

	public String getRAM() {
		return RAM;
	}

	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	public boolean isBlueToothEnabled() {
		return isBlueToothEnabled;
	}

	public Computer(ComputerBuilder builder) {
		this.HDD = builder.getHDD();
		this.RAM = builder.getRAM();
		this.isBlueToothEnabled = builder.isBlueToothEnabled();
		this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled();
	}

	@Override
	public String toString() {
		return "Computer [HDD=" + HDD + ", RAM=" + RAM + ", isGraphicsCardEnabled=" + isGraphicsCardEnabled
				+ ", isBlueToothEnabled=" + isBlueToothEnabled + "]";
	}
}
