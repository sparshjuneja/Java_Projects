import java.rmi.*;

public class RmiClient {
	public static void main(String[] args) {
		new RmiClient().go();
	}
	public void go() {
		try {
			MyRmi service = (MyRmi) Naming.lookup("rmi://127.0.0.1/Remote_Hello");
	    String s = service.sayHello();
		System.out.println(s);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
}