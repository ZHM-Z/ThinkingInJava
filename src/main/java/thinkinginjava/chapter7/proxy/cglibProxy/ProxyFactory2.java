package thinkinginjava.chapter7.proxy.cglibProxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class ProxyFactory2 implements MethodInterceptor {

	@Override
	public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
		Object invokeSuper = methodProxy.invokeSuper(object, args);
		return invokeSuper;
	}

}
