package functionalprogrammingexpriments;

import java.util.Arrays;
import java.util.List;



public class FunctionalProgrammingExperiment01 
{
	public void run() {
	    String[] n1 = { "Dilki Ranathunga", "Adam Gilchrist", "Shane Watson", "Keith Miller", "Allan Border", "Matthew Hayden","Greg Chappell" };

	    List<String> n2 = Arrays.asList(n1);  

	    System.out.println("stream names\n---------");
	    n2.stream().forEach(name -> System.out.println(name));

	    System.out.println("\nParallel stream names\n---------");
	    n2.parallelStream().forEach(name -> System.out.println(name));
	  }

	  public static void main(String[] args) {
	    new FunctionalProgrammingExperiment01().run();
	  }
}
