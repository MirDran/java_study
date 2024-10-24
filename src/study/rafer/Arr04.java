package study.rafer;

public class Arr04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//배열 참조타입(String) vs 기본타입 =  int
		
//		int a = 10;
//		int b = a;
//		System.out.println(a+" " + b);
//		
//		b = 20;
//		System.out.println(a+" "+b);
//		
		//복사 안 됨
		/*
		int[] arr1 = {10, 20, 30};
		int[] arr2 = arr1;
		

		System.out.println();
		System.out.println();
		
		for(int i=0;i<3;i++) {
			System.out.println(arr1[i]+ " ");
		}
		System.out.println();
		
		for(int i=0;i<3;i++) {
			System.out.println(arr2[i]+ " ");
		}
		
		System.out.println();
		
		arr2[0] = 999;
		
		for(int i=0;i<3;i++) {
			System.out.println(arr1[i]+ " ");
		}
		System.out.println();
		
		for(int i=0;i<3;i++) {
			System.out.println(arr2[i]+ " ");
		}*/
		
		
		int[] arr1 = {10, 20, 30};
		int[] arr2 = new int[3];
		
		//복사 대상
		System.arraycopy(arr1,0,arr2,0,3);
		
		//for 문으로 하나 하나 복사하기
//		for(int i=0; i<3; i++) {
//			arr2[i] = arr1[i];
			// 0        0
			// 1        1
			// int   =  int값
//		}
			System.out.println();
			
			for(int i=0; i<3; i++) {
				System.out.println(arr1[i]);
			}
			System.out.println();
			for(int i=0; i<3; i++) {
				System.out.println(arr2[i]);
			}

			
			
		
	}

}
	
