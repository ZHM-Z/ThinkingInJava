package thinkinginjava.chapter7.proxy.staticProxy;

public class APP {
	
	public static void main(String[] args) {
		UserDao userDao = new UserDao();
		UserDaoProxy proxy = new UserDaoProxy(userDao);
		proxy.save();
	}

}
