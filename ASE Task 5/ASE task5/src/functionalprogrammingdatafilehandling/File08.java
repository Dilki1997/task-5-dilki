package functionalprogrammingdatafilehandling;

import java.io.*;
import java.util.*;
import java.util.stream.*;



public class File08 {

	public static void main(String[] args) throws Exception {
		BufferedReader r = new BufferedReader(new FileReader("data/Email 101.txt"));

		List<String> l = r.lines().collect(Collectors.toList());

		for (String line : l) {
			System.out.println(line);
		}

		r.close();
	}

}
