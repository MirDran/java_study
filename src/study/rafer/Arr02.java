package study.rafer;

public class Arr02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] 1차원
		//int[][] 2차원 배열
		//int[][][] 3차원 배열
		//int[][][][] 4차원 배열
		int[][] nArr1 = new int [3][5]; //2차원 앞에 행 뒤에 열
		
		/*	0	1	2	3	4
		0	ㅁ	ㅁ	ㅁ	ㅁ	ㅁ
		1	ㅁ	ㅁ	ㅁ	ㅁ	ㅁ
		2	ㅁ	ㅁ	ㅁ	ㅁ	ㅁ			 
		*/
		int[][] nArr2 = new int [2][3];
		// 값이 없어 기본 값인 0
		/* 0  1 2
		 0 ㅁ ㅁ ㅁ
		 1 ㅁ ㅁ ㅁ
		 */
		
		//nArr1.lenght [3][5] 의 경우 3 앞자리
		
		
		int[][] nArr3 = { {1,2,3},{4,5,6} };
		
		System.out.println(nArr3[1][1]);
		
		/* 0  1 2
		 0 1 2 3
		 1 4 5 6
		 */
		//	[2][3]		행의 길이 2
		for (int i=0; i <nArr3.length; i++) {
			// i: 0 1
			//	i= 0 1 2 일때 0의 길이 (3) 1의길이 (3) []
			for(int j=0; j<nArr3[i].length; j++) {
				// j : 0 1 2
				System.out.print(nArr3[i][j] + " ");
				// i: 000 111
				// j: 123 012
				//nArr3[0][0] nArr3[0][1] nArr3[0][2]
				//nArr3[1][0] nArr3[1][1] nArr3[1][2]
			}
			System.out.println();
		}
		
		int[][] nArr4 = new int[5][3];
		
		
		
	}

}
