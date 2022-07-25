package functionalprogrammingexpriments;

import java.util.*;
import java.util.function.Predicate;


public class FunctionalProgrammingExperiment10 {
	class Filter implements Predicate<String> {
		public boolean test(String name) {
			return name.contains("i");
		}
	}

	public void run() {
		String[] n1 = { "Dilki Ranathunga", "Adam Gilchrist", "Shane Watson", "Keith Miller", "Allan Border", "Matthew Hayden","Greg Chappell" };

		List<String> n2 = Arrays.asList(n1);

		n2.stream().filter(new Filter()).forEach(name -> System.out.println(name));

	}

	public static void main(String[] args) {
		new FunctionalProgrammingExperiment10().run();
	}
}
