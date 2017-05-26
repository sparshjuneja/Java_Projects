import java.io.*;
import java.net.*;

public class AdviceClient {
	
	public void go() {
		try{
			Socket  soc = new Socket("127.0.0.1", 4343);
			InputStreamReader stream = new InputStreamReader(soc.getInputStream());
			BufferedReader reader = new BufferedReader(stream);
			
			String advice = reader.readLine();
			System.out.println("Today " + advice);
			reader.close();
			
			
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	public static void main(String[] args) {
		AdviceClient client = new AdviceClient();
		client.go();
	}

}

