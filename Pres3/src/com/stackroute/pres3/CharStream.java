package com.stackroute.pres3;
import java.io.*;
public class CharStream 
{
	    public static void main(String[] args) throws IOException
	    {
	        FileReader src = null;
	        try
	        {
	            src = new FileReader("/home/saranya/eclipse-workspace/Pres3/tst.txt");
	            int tmp;
	            while ((tmp = src.read()) != -1)
	                 System.out.print((char)tmp);
	        }
	        catch(Exception e)
	        {
	        	System.out.println(e);
	        }
	        finally
	        {           
	            if (src != null)            
	                src.close();         
	        }
	    }

}
