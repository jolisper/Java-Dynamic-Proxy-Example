package com.jolisper.dynamicproxy.main;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class InvocationHandlerImpl implements InvocationHandler {

	private Object object;
	
	public static Object instance(Object object) {
		return new InvocationHandlerImpl(object);
	}
	
	public InvocationHandlerImpl(Object object) {
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {

		Integer result = (Integer) method.invoke(object, args);
		
		return result + 1;
	}

}
