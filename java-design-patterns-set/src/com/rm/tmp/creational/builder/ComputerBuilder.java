package com.rm.tmp.creational.builder;

public class ComputerBuilder {
	// required params
	private String HDD;
	private String RAM;

	// optional params
	private boolean isGraphicsCardEnabled;
	private boolean isBlueToothEnabled;

	public ComputerBuilder(String hDD, String rAM) {
		HDD = hDD;
		RAM = rAM;
	}

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

	public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
		this.isGraphicsCardEnabled = isGraphicsCardEnabled;
		return this;
	}

	public ComputerBuilder setBlueToothEnabled(boolean isBlueToothEnabled) {
		this.isBlueToothEnabled = isBlueToothEnabled;
		return this;
	}
	
	public Computer build() {
		return new Computer(this);
	}

}
