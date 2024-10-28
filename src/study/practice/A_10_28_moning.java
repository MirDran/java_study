package study.practice;

public class A_10_28_moning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2차원 배열과 인덱스 조정하기.
		//2차원 배열을 활용하여 다음 결과가 나오도록 코드를 작성하시오.
	/*	1.
		1 2 3 4 
		5 6 7 8
		9 10 11 12
		13 14 15 16 */
		
		int[][] n1Arr = new int [4][4];
		int num = 1;
		
//		for(int i=0; i<n1Arr.length; i++) {
//			for(int j=0; j<n1Arr.length; j++) {
//				//4*4
//				//i: 0-3
//				//j: 0-3
//				n1Arr[i][j] = num;
//				num++;
//			}
//		}
		
//		for(int i=0; i<4; i++) {
//			for(int j=0; j<4; j++) {
//				System.out.printf("%3d",n1Arr[i][j]);
//			}
//			System.out.println();
//		}

	/*	2.
		1 5 9 13	 00 01 02 03
		2 6 10 14 	10 11 12 13
		3 7 11 15
		4 8 12 16 */
		
		/*
		for(int j=0; j<n1Arr.length; j++) {
			for(int i=0; i<n1Arr.length; i++) {
				//4*4
				//i: 0-3
				//j: 0-3
				n1Arr[i][j] = num;
				num++;
			}
		}
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.printf("%3d",n1Arr[i][j]);
			}
			System.out.println();
		}
		*/
		
		

	/*	3.
		16 15 14 13
		12 11 10 9
		8 7 6 5
		4 3 2 1 */

	/*	
		num = 16;
		for(int i=0; i< 4; i++) {
			for(int j=0; j<4; j++) {
				//4*4
				//i: 0-3
				//j: 0-3
				n1Arr[i][j] = num;
				num--;
			}
		}
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.printf("%3d",n1Arr[i][j]);
			}
			System.out.println();
		}
		
		*/
		
	/*	4.
		16 12 8 4
		15 11 7 3
		14 10 6 2
		13 9 5 1 */
		
		num = 16;
		for(int i=0; i< 4; i++) {
			for(int j=0; j<4; j++) {
				//4*4
				//i: 0-3
				//j: 0-3
				n1Arr[j][i] = num;
				num--;
			}
		}
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				System.out.printf("%3d",n1Arr[i][j]);
			}
			System.out.println();
		}
		
	}

}
