package Exception;

import java.io.FileNotFoundException;

public class CheckedExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final FileServer fileServer = new FileServer();
		boolean connectOK = false;
		
		try {
			connectOK = fileServer .connectServer(true, "a45878");
		} catch (IllegalArgumentException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(connectOK) {
			System.out.println("Connected to File Server");
			boolean downloadOk = false;
			
			try {
				downloadOk = fileServer.downloadFile("");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String result = downloadOk? "Downloaded..." :"Download Fail";
			System.out.println(result);
		}
		else {
			System.out.println("Cant connect to server.Please try again");
		}
	}

}
