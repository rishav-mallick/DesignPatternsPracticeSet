package com.rm.tmp.creational.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

	private static final long serialVersionUID = -92016750835499131L;

	private SerializedSingleton() {
	}

	private static class SingletonHelper {
		private static final SerializedSingleton instance = new SerializedSingleton();
	}

	public static SerializedSingleton getInstance() {
		return SingletonHelper.instance;
	}

}
