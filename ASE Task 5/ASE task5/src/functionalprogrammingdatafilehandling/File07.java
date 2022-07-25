package functionalprogrammingdatafilehandling;

import java.io.*;
import java.util.*;



public class File07 {

	public static void main(String[] args) throws Exception {
		BufferedReader r = new BufferedReader(new FileReader("data/Email 101.txt"));

		Optional<String> result = r.lines().reduce((left, right) -> left.concat(" ".concat(right)));

		if (result.isPresent())
			System.out.println("result is " + result.get());
		else
			System.out.println("result not present");
		r.close();
	}

}
