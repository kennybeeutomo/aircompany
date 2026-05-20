package Planes;

public class Distance {
    private final int value;

    public Distance(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Jarak penerbangan tidak boleh negatif.");
        }
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}