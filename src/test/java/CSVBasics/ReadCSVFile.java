package CSVBasics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSVFile {

	public static void main(String[] args) throws IOException {
		
		File f = new File(".\\src\\test\\java\\CSVBasics\\MyCSVFile.csv");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String x;
		while((x=br.readLine())!=null)
		{
			System.out.println("x="+x);
			String sarr[] = x.split(",");
			System.out.println(sarr[0] + "-" +sarr[1] + "-" +sarr[2] +"-" +sarr[3]);
			
		}
		
		
	}

}
