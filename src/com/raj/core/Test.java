package com.raj.core;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {
	public static void main(String[] args) {
		System.out.println("Hello Java 17");
		String str = """
				     <html><head></head>
				      <body><h1>Hello We are working with Java 17</body>
				     </html>
				     """;
		int numerical_underscore = 1_0_0_00;
		int x = 10000;
		if(x == numerical_underscore) {
			System.out.println(str + " Has : "+numerical_underscore);
		}
		
		SystemRaj.outRaj.printLineRaj("Shyam"+x);
		//READ aLL data from a file
		/*
		 * try { System.out.println("File content:\n" +
		 * Files.readString(Paths.get("D:\\Resume\\LTX_CODE\\RajendraSingh_2025.txt")));
		 * 
		 * } catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
	}
}
