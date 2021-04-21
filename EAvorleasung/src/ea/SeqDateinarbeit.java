package ea;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class SeqDateinarbeit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		schreiben();
		lesen();
	}

	private static void lesen() {
		// TODO Auto-generated method stub
		InputStream in = null;
		try {
			in = Files.newInputStream(Paths.get("C:\\Daten\\Zufall2.data"),StandardOpenOption.READ);
			int b = in.read();
			while(b!= -1) {
				System.out.print((char)b);
				b= in.read();
			}
			
		}catch(IOException ex){
			ex.printStackTrace();
		}
		finally {
			if(in != null) {
				try {
					in.close();
				}catch(IOException ex){
					ex.printStackTrace();
				}
			}
		}
		
	}

	private static void schreiben() {
		// TODO Auto-generated method stub
		
		OutputStream out = null;
		try {
			out = new FileOutputStream("C:\\\\Daten\\\\Zufall2.data");
			String Text = "ich fick deine Mutter du hs €";
			for(char zeichen : Text.toCharArray()) {
				out.write(zeichen);
			}
		}catch(IOException ex){
			ex.printStackTrace();
		}
		finally {
			if(out != null) {
				try {
					out.close();
				}catch(IOException ex){
					ex.printStackTrace();
				}
			}
		}
		
	}

}
