package com.rm.tmp.creational.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {
	public static void main(String[] args) {
		EagerInitializationSingleton instanceone = EagerInitializationSingleton.getInstance();
		EagerInitializationSingleton instancetwo = null;
		try {
			Constructor[] constructors = EagerInitializationSingleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				constructor.setAccessible(true);
				instancetwo = (EagerInitializationSingleton) constructor.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(instanceone.hashCode());
		System.out.println(instancetwo.hashCode());

	}
}
