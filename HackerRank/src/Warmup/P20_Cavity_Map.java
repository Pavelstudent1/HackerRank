package Warmup;

import java.util.Scanner;

public class P20_Cavity_Map {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter N - size of square map:");
		int N = in.nextInt();

		int[][] map = new int [N][N];
		System.out.println("Enter N strings - cavity map:");
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = in.nextInt();
			}
		}
		
		cavity(map);
		
		print(map);
		
		in.close();
	}

	private static void cavity(int[][] map) {
		
		for (int i = 1; i < map[i].length - 1; i++) {
			for (int j = 1; j < map[i].length - 1; j++) {
				if (map[i][j] > map[i][j - 1] &
					map[i][j] > map[i - 1][j] &
					map[i][j] > map[i][j + 1] &
					map[i][j] > map[i + 1][j]){
					
						map[i][j] = -1;
				}
			}
		}
		
		
	}

	private static void print(int[][] map) {
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] == -1){
					System.out.print("X ");
				}
				else System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}

}
