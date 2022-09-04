
public class Question03 {
	public static void main(String[] args) {
		String modelos[] = {"BMW 320i", "BMW M5", "BMW M3", "BMW X6", "BMW X4"};
		double consumo[] = {13.3, 9.1, 10.2, 8.3, 10.5};
		System.out.printf("Modelos e Consumos BMW\n");
		for (int i = 0; i < 5; i++) {
			System.out.printf("Modelo: %s - Consumo %.1f\n", modelos[i], consumo[i]);
		}
	}
}
