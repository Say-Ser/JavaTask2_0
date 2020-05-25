package Task5_7_8;

public enum CalculatorOperation {
    Addition, Subtraction, Multiplication, Division, Unknown, EXIT;

    public static CalculatorOperation parse(String s) {
        if (s == null || "".equals(s)) return Unknown;
        else if ("+".equals(s)) return Addition;
        else if ("-".equals(s)) return Subtraction;
        else if ("*".equals(s)) return Multiplication;
        else if ("/".equals(s)) return Division;
        else if ("e".equals(s)) return EXIT;
        else return Unknown;
    }
}
