package ex05.pyrmont.test;

import java.io.File;
import java.io.IOException;

public class FileTest {
	static String url = "D://a.txt";
	
	public static void main(String[] args) throws IOException {
		File file = new File(url);
		System.out.println(file.separator);
		System.out.println(file.getCanonicalPath());
	}
}
