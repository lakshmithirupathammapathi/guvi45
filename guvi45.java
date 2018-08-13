import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int flag=0;
	String s="123";
	for(int i=0;i<s.length();i++)
	{
		if(Character.isDigit(s.charAt(i)))
		{
			flag++;
			}
	}
			System.out.println("the numaric values are"+flag);
			return;
		}
	}
	
