

import java.io.*;

public class ReadSum  { 
   public static void main(String[] args) 
   {
	int sum=0; 
	int [] num = new int [100];
	int i = 0;

	try{
	
		File x = new File("3nums.txt");
		FileReader inputX = new FileReader(x);
		BufferedReader in = new BufferedReader(inputX);

		String s =in.readLine();

		while(s!=null)
		{
		    num[i++] = Integer.parseInt(s); 
		    s = in.readLine();
		}

		for(int j=0; j<=i; j++)
		{
			sum = sum + num[j];
			
		}
		System.out.println( num[0] + "+" + num[1] + "+" + num[2] + "=" + sum);

   	}

	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}
