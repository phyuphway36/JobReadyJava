package Exception;

import java.io.FileNotFoundException;

public class FileServer {
	
	boolean connectServer(boolean internetOK,String ssl) 
			throws InterruptedException,IllegalArgumentException{
		if(!internetOK)
			throw new InterruptedException("Check Your Internet Connection");
		
		if(!ssl.equals("a45878"))
			throw new IllegalArgumentException("SSL invalid");
		
		return true;
	}

	boolean downloadFile(String filename) throws FileNotFoundException{
		if(filename==null || filename.isEmpty() || filename.isBlank())
		throw new FileNotFoundException("Your requested File Not Found");
		return true;
		
	}
}
