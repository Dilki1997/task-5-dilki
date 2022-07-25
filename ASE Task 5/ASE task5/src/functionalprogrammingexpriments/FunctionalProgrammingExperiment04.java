package functionalprogrammingexpriments;

import java.util.*;
import java.util.function.Consumer;



public class FunctionalProgrammingExperiment04 {
	class StringPrintConsumer implements Consumer<String> {
		public void accept(String str) {
			System.out.println(str);
		}
	}

	public void run() {
		String[] n1 = { "Dilki Ranathunga", "Adam Gilchrist", "Shane Watson", "Keith Miller", "Allan Border", "Matthew Hayden","Greg Chappell" };

		List<String> n2 = Arrays.asList(n1);

		n2.forEach(new StringPrintConsumer());
	}

	public static void main(String[] args) {
		new FunctionalProgrammingExperiment04().run();
	}
}
