import java.io.*;
import java.net.*;
import java.util.Random;

public class AdviceServer {
	String[] adviceList = {"H-O-T-A-P-E", "Get out of your comfort zone", "Dont waste time",
	"Keep your thoughts in check", "Always respect your parents"};
	
	public void go() {
		try {
			ServerSocket ssoc = new ServerSocket(4343);
		
		    while(true) {
			    Socket sock = ssoc.accept();
			    PrintWriter writer = new PrintWriter(sock.getOutputStream());
			    String advice = getAdvice();
			    writer.println(advice);
			    writer.close();
			    System.out.println(advice);
		    }
		} catch(IOException ex) {
			ex.printStackTrace();
		} 
    }

    private String getAdvice() {
	    Random r = new Random();
	    int random = r.nextInt(adviceList.length);
	    return adviceList[random];
    }

    public static void main(String[] args) {
		AdviceServer ser = new AdviceServer();
		ser.go();
    }
}	