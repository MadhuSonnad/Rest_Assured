package Sterilization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class User1 {
public static void main(String[] args) throws IOException {
	NFS_Game user=new NFS_Game("Madhu", 6, 55, 3);
	ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("./backup.ser"));
	out.writeObject(user);
}
}
