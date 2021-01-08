package chapter02;

public class ex10 {
	static final int VMAX = 21;
	
	static class PhyscData {
		String name;
		int height;
		double vision;
		
		PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	static double avgHeight(PhyscData[] data) {
		double sum = 0;
		
		for (int i = 0; i < data.length; i++)
			sum += data[i].height;
		
		return sum / data.length;
	}
	
	static void distVision(PhyscData[] data, int[] dist) {
		int i = 0;
		dist[i] = 0;
		
		for (i = 0; i < data.length; i++) {
			if (data[i].vision >= 0.0 && data[i].vision <= VMAX / 10.0)
				dist[(int)(data[i].vision * 10)]++;
		}
	}
	
	public static void main(String[] args) {
		PhyscData[] data = {
				new PhyscData("박현규", 162, 0.7),
				new PhyscData("함진아", 173, 0.7),
				new PhyscData("최윤미", 175, 2.0),
				new PhyscData("홍연의", 171, 1.5),
				new PhyscData("이수진", 168, 0.7),
				new PhyscData("김영준", 174, 1.2),
				new PhyscData("박용규", 169, 0.7),
		};
		
		int[] visionDist = new int[VMAX];
		
		System.out.println("* 신체검사 리스트 *");
		System.out.println("이름    키   시력");
		System.out.println("--------------");
		
		for (int i = 0; i < data.length; i++)
			System.out.println(data[i].name + "  " + data[i].height + "  " + data[i].vision);
		
		System.out.println();
		System.out.printf("평균 키 : %5.1fcm\n", avgHeight(data));
		System.out.println();
		
		distVision(data, visionDist);
		System.out.println("시력분포");
		for (int i = 0; i < visionDist.length; i++) {
			System.out.print((i  / 10.0) + "~ : ");
			for (int j = 0; j < visionDist[i]; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}