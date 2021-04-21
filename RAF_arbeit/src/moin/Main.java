package moin;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
	
	public static void main(String[] args) {
		grunbdlagenRAF();
		schreibenzufalltahlen();
		int n = 5;
		double nwert = lesezufallszahlen(n);
		System.out.println(nwert);
		
	}

	private static double lesezufallszahlen(int n) {
		// TODO Auto-generated method stub
		double erg = -1;
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile("C:\\Daten\\Zufall2.data", "r");
			raf.seek(n * 8);
			erg = raf.readDouble();
		}catch(IOException ioex){
		ioex.printStackTrace(); // gibt auf der conmsole den fehler baum aus
		
		}finally {
			if(raf != null) {
				try {
					raf.close();
				}
				catch(IOException ex){
					ex.printStackTrace();
				}
			}
		}
		return erg;
	}

	private static void schreibenzufalltahlen() {
		// TODO Auto-generated method stub
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile("C:\\Daten\\Zufall2.data", "rw");
			for(int i = 0; i< 10; i++) {
				raf.writeDouble(Math.random());
			}
		}catch(IOException ioex){
		ioex.printStackTrace(); // gibt auf der conmsole den fehler baum aus
		
		}finally {
			if(raf != null) {
				try {
					raf.close();
				}
				catch(IOException ex){
					ex.printStackTrace();
				}
			}
		}
	}

	private static void grunbdlagenRAF() {
		// TODO Auto-generated method stub
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile("C:\\Daten\\Datei2.data", "rw");
			//raf.writeChars("DU dummer hurensohn");
			raf.writeUTF("fuck off");
			
			raf.seek(0);
			
			System.out.println(raf.readUTF());
			
		}
		catch(IOException ioex){
			ioex.printStackTrace(); // gibt auf der conmsole den fehler baum aus
			
		}
		finally {
			if(raf != null) {
				try {
					raf.close();
				}
				catch(IOException ex){
					ex.printStackTrace();
				}
			}
		}
	}
	
}
