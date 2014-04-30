package com.jolisper.dynamicproxy.main;

public class ProxiedObjectImpl implements ProxiedObject {
	
	/* (non-Javadoc)
	 * @see com.jolisper.dynamicproxy.main.ProxiedObjectInterface#hi()
	 */
	@Override
	public Integer one() {
		return 1;
	}

}
