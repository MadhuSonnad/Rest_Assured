package Sterilization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class User_NextDay {

	public static void main(String[] args) throws FileNotFoundException, IOException, Throwable 
	{
	
		ObjectInputStream out=new ObjectInputStream(new FileInputStream("./backup.ser"));
		NFS_Game user = (NFS_Game )out.readObject();
		
		System.out.println(user.level);
		System.out.println(user.score);
		System.out.println(user.life);
		System.out.println(user.name);

	}

}
