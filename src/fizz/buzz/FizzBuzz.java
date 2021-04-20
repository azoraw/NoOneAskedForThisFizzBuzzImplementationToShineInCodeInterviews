package fizz.buzz;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FizzBuzz {

    private final int numberOfIteration;
    private final List<Transformation> transformationsConfig;

    public FizzBuzz(List<Transformation> transformationsConfig, int numberOfIteration) {
        this.numberOfIteration = numberOfIteration;
        this.transformationsConfig = transformationsConfig.stream()
                .sorted(Comparator.comparingInt(Transformation::getDivisible))
                .collect(Collectors.toList());
    }

    public void run() {
        StringBuilder output = new StringBuilder();
        for (int i = 1; i <= numberOfIteration; i++) {
            for (Transformation transformation : transformationsConfig) {
                if (i % transformation.getDivisible() == 0) {
                    output.append(transformation.getTransformedTo());
                }
            }
            if (output.length() == 0) {
                output = new StringBuilder(i + "");
            }
            System.out.println(output);
            output.setLength(0);
        }
    }

}
