package com.stackroute.pres3;
import java.io.*; 
public class TargetByte 
{
	    public static void main(String[] args) throws IOException
	    {
	        FileInputStream src = null;
	        FileOutputStream dest = null;
	        String b1="Copy content from here.";
	        byte[] b=b1.getBytes();
	        try
	        {
	            dest = new FileOutputStream ("/home/saranya/eclipse-workspace/Pres3/targ.txt");
	            dest.write(b);            
	        }
	        catch(Exception e)
	        {
	        	System.out.println(e);
	        }
	        finally
	        {           
	            if (dest != null)            
	                dest.close();            
	        }
	    }

}
