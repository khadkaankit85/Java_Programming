// Multiple.java
public class Multiple {

    public static float SquareRoot(float base, float exponent) {
        return (float) Math.pow(base, 1 / exponent);
    }

    public static float CubeRoot(float base, float exponent1, float exponent2) {
        return (float) Math.pow(base, 1 / (exponent1 * exponent2));
    }
}
