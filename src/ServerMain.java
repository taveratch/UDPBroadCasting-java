
public class ServerMain {

	public static void main(String[] args) {
		Thread discoveryThread = new Thread(DiscoveryThread.getInstance());  
		discoveryThread.start();  
	}

}
