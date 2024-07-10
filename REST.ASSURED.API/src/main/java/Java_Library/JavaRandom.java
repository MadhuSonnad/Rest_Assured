package Java_Library;

import java.util.Random;

public class JavaRandom 
{
	public int randomNum()
	{
		Random ranNum = new Random();
		int ran = ranNum.nextInt(1000);
		return ran;
}
}
