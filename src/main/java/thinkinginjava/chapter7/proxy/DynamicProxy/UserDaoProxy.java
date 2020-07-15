package thinkinginjava.chapter7.proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class UserDaoProxy {
	
	private Object target;

	public UserDaoProxy(Object target) {
		super();
		this.target = target;
	}
	
	public Object getProxyInstance() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("事务开始...");
				Object invoke = method.invoke(target, args);
				System.out.println("事务结束...");
				return invoke;
			}
		});
	}

}
