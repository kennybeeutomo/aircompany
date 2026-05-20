package Planes;

public class Speed {
	private final int value;

	public Speed(int value) {
		if (value < 0)
			throw new IllegalArgumentException("Kecepatan tidak boleh negatif");
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
