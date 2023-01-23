package app;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter whit folder path ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Folders");
		for(File x : folders) {
			System.out.println(x);
		}
		
		System.out.println();
		
		File[] files = path.listFiles(File:: isFile);
		System.out.println("Files");
		for(File y: files) {
			System.out.println(y);
		}
		
		boolean success = new File(strPath+"//pastaTeste").mkdir();
		
		System.out.println("Dir "+success);
		
		
		sc.close();
	}

}
