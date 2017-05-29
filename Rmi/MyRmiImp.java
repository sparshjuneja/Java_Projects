import java.rmi.*;
import java.rmi.server.*;

public class MyRmiImp extends UnicastRemoteObject implements MyRmi {
	public String sayHello() {
		return "Server says, 'Hey' ";
	}
	
	public MyRmiImp() throws RemoteException {}
	
	public static void main(String args[]) {
		try {
			MyRmi service = new MyRmiImp();
			Naming.rebind("Remote_Hello", service);
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}