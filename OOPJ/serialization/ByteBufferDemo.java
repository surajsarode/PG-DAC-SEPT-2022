import java.io.*;
import java. nio.*;
import java.nio.channels.*;

class ByteBufferDemo
{
	public static void main(String args[])
	{
		FileInputStream fis = new FileImageInputStream("input.txt");
		FileChannel fin = fis.getChannel();
		ByteBuffer bb = ByteBuffer.allocate((int)fcin.size());
		fcin.read(bb);
		
		//reading through the byte buffer and printing it to the console.
		bb.rewind();
		
		for(int i =0; i < (int)fcin.size(); i++)
		{
			System.out.println((char)bb.get(i));
		}
		
		fcin.close();
		fis.close();
		
		System.out.println("File read successfully");
		
	}
}