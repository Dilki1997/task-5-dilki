package functionalprogrammingexpriments;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;



public class FunctionalProgrammingExperiment06 {
	public static void main(String[] args) {
		Function<Integer, Double> reciprocal = new Function<Integer, Double>() {
			public Double apply(Integer n) {
				return 1.0 / n;
			}
		};
		System.out.println(reciprocal.apply(10));

		IntStream denominators = IntStream.range(1, 10);
		denominators.map((IntUnaryOperator) reciprocal).forEach(x -> System.out.println(x));
	}
}
