package fizz.buzz;

class Transformation {

    private final int divisible;
    private final String transformedTo;

    Transformation(int divisible, String transformedTo) {
        this.divisible = divisible;
        this.transformedTo = transformedTo;
    }

    public int getDivisible() {
        return divisible;
    }

    public String getTransformedTo() {
        return transformedTo;
    }
}
