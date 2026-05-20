package Planes;

public class Weight {
    private final int value;

    public Weight(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Kapasitas beban tidak boleh negatif.");
        }
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}