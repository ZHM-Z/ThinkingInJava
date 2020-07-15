package thinkinginjava.chapter7.proxy.cglibProxy;

import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;

/**
 * 测试类
 */
public class App {
	public static void main(String[] args) {
		// 目标对象
		UserDao target = new UserDao();

		// 代理对象
		UserDao proxy = (UserDao) new ProxyFactory(target).getProxyInstance();

		// 执行代理对象的方法
		proxy.save();

		proxy.update();
	}

	@Test
	public void test2() {
		Enhancer en = new Enhancer();
		en.setSuperclass(UserDao.class);
		en.setCallback(new ProxyFactory2());
		UserDao create = (UserDao) en.create();
		create.save();
		create.update();

	}

}