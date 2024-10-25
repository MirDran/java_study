package study.practice;

public class A_10_25_moning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		int[][] nArr = new int [5][5];
//		
//		for(int i=0; i<=4;i++) {
//			
//			for(int j=0;j<=4;j++) {
//				
//				if(i == j) {
//					nArr[i][j]= 1;
//				}else if(i>j){
//					nArr[i][j]= 3;
//				}else if(i<j){
//					nArr[i][j]= 2;
//				}
//				System.out.print(nArr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
		//ver. sense 
		
		//저장
		 int [][] arr= new int[5][5];
		 
			 for(int i=0; i<5;i++) {
				 //i:0~4
				 for(int j=0; j<5; j++) {
					 //j:0~4
					 if(i > j) {
						 arr[i][j] = 3;
					 }else if(i<j) {
						 arr[i][j] = 2;
				 }else {
					 arr[i][j] = 1;
				 }
			 }
		}
		//출력
		 for(int i=0; i<5;i++) {
			 //i:0~4
			 for(int j=0; j<5; j++) {
				 //j:0~4
				 System.out.print(arr[i][j]+" ");
				 }
				 System.out.println();
			 }
		 }//main end
	}

