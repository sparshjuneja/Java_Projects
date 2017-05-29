import java.rmi.*;

public interface MyRmi extends Remote {
	
	public String sayHello() throws RemoteException;
}