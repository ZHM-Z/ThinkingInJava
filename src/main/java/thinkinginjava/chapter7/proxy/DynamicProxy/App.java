package thinkinginjava.chapter7.proxy.DynamicProxy;

public class App {
	public static void main(String[] args) {
		IUserDao target = new UserDao();
		IUserDao proxyInstance = (IUserDao) new UserDaoProxy(target).getProxyInstance();
		proxyInstance.save();
	}
}
