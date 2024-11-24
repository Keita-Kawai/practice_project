package practice;

import java.util.Random;

public class PracticeSwitch {

	public static void main(String[] args) {

		int[] num = new int[10];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		num[4] = 5;
		
		Random r = new Random();
		
		for (int i = 1; i <= 10; i++) {
			
			int rank = num[r.nextInt(4)];
			
			switch (rank) {
			case 1:
				System.out.println(rank + ": " + "勇者");
				break;
			case 2:
				System.out.println(rank + ": " + "バトルマスター");
				break;
			case 3:
				System.out.println(rank + ": " + "パラディン");
				break;
			case 4:
				System.out.println(rank + ": " + "海賊");
				break;
			case 5:
				System.out.println(rank + ": " + "魔法剣士");
				break;
			}
			
		}
	}

}
