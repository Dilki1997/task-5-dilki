package functionalprogrammingexpriments;

import java.util.function.Supplier;



public class FunctionalProgrammingExperiment08 
{
	class NameSupplier implements Supplier<String>{
	    String[] names = { "Dilki Ranathunga", "Adam Gilchrist", "Shane Watson", "Keith Miller", "Allan Border", "Matthew Hayden","Greg Chappell" };
	    int nextIndex = 0;
	    public String get() {
	      if(nextIndex< names.length) {
	        return names[nextIndex++];
	      }
	      return null;
	    }  
	  }
	  
	  public void run() {
	    NameSupplier ns = new NameSupplier();

	    System.out.println(ns.get());
	    System.out.println(ns.get());
	    System.out.println(ns.get());
	    System.out.println(ns.get());
	    System.out.println(ns.get());
	    System.out.println(ns.get());
	    System.out.println(ns.get());
	    System.out.println(ns.get());
	  }

	  public static void main(String[] args) {
	    new FunctionalProgrammingExperiment08().run();
	  }
}
