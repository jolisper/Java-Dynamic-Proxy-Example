package com.jolisper.dynamicproxy.test;

import java.lang.reflect.Proxy;

import org.junit.Assert;
import org.junit.Test;

import com.jolisper.dynamicproxy.main.InvocationHandlerImpl;
import com.jolisper.dynamicproxy.main.ProxiedObject;
import com.jolisper.dynamicproxy.main.ProxiedObjectImpl;

public class ProxyTest {
	
	@Test
	public void test() {
		ProxiedObject proxiedObject = createProxiedObject();
		
		Integer one = proxiedObject.one();
		
		Assert.assertEquals(one , new Integer(2));
	}
	
	private ProxiedObject createProxiedObject() {
		
		ProxiedObject proxiedObject = new ProxiedObjectImpl();
		
		ProxiedObject proxy = (ProxiedObject) Proxy.newProxyInstance(
				this.getClass().getClassLoader(), 
				new Class[] { com.jolisper.dynamicproxy.main.ProxiedObject.class }, 
				new InvocationHandlerImpl(proxiedObject));
		
		return proxy;
	}

}
