package functionalprogrammingexpriments;

import java.util.Arrays;
import java.util.List;



public class FunctionalProgrammingExperiment02 
{
	public void run() {
	    String[] n1 = { "Dilki Ranathunga", "Adam Gilchrist", "Shane Watson", "Keith Miller", "Allan Border", "Matthew Hayden","Greg Chappell" };

	    List<String> n2 = Arrays.asList(n1);

	    n2.stream().filter(name -> name.contains("i"))
	        .forEach(name -> System.out.println(name));

	  }

	  public static void main(String[] args) {
	    new FunctionalProgrammingExperiment02().run();
	  }
}
