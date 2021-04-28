package nsh.codility;

public class Palladium2020A implements Palladium2020Interface {

	public int solution(int[] H) {
		int N = H.length;
		int Max = 0;
		for (int i = 0; i < N; i++)
			Max = Math.max(Max, H[i]);

		int rectMax = 0;

		int hwm = 0;
		for (int i = 0; i < N; i++) {
			int h = H[i];
			if (h == Max)
				break;
			hwm = Math.max(h, hwm);
			rectMax = Math.max(rectMax, (Max - hwm) * (i + 1));
		}

		hwm = 0;
		for (int i = N - 1; i >= 0; i--) {
			int h = H[i];
			if (h == Max)
				break;
			hwm = Math.max(h, hwm);
			rectMax = Math.max(rectMax, (Max - hwm) * (N - i));
		}

		return N * Max - rectMax;
	}
}
