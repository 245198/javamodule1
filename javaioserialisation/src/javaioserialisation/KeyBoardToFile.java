package javaioserialisation;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class KeyBoardToFile {

	public static void main(String[] args) throws IOException {
		System.out.println("Entered main");

		String data = null;
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		FileWriter writer = new FileWriter("Nammadafile");
		System.out.println("enter some text ");
		data = reader.readLine();
		System.out.println("you have enetred..." + data);
		while (!data.equals("quit")) 
		{
			writer.write(data);
			data = reader.readLine();
			System.out.println("you have enetred..." + data);
		}
		writer.flush();
		writer.close();
		reader.close();
		System.out.println("main exited...");

	}
}
