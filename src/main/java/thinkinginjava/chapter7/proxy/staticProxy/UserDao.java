package thinkinginjava.chapter7.proxy.staticProxy;

public class UserDao implements IUserDao {

	@Override
	public void save() {
		System.out.println("save...");
	}

}
