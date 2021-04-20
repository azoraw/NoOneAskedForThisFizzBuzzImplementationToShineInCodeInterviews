package fizz.buzz;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Transformation> transformations = new ArrayList<>();
        transformations.add(new Transformation(3, "fizz"));
        transformations.add(new Transformation(5, "buzz"));

        FizzBuzz fizzBuzz = new FizzBuzz(transformations, 100);
        fizzBuzz.run();

    }
}
