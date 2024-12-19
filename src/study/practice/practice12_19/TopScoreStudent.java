package study.practice.practice12_19;

public class TopScoreStudent {
	public static void main(String[] args) {
// 배열 생성
		String[] names = 
			{ "Elena","Suzie","John","Emily","Neda","Kate","Alex","Daniel","Hamilton" };
		int[] scores = { 65,74,23,75,68,96,88,98,54 };

// 1등 인덱스 검색
		int i = topIndex(scores);

// 결과 출력
		System.out.printf("1등: %s(%d점)\n", names[i], scores[i]);
	}

// 정수형 배열을 입력받아 가장 큰 값의 인덱스를 반환
	
	
	public static int topIndex(int[] arr) {
		
//		int maxIndex = 0;
//		boolean isMax = true;
//		
//		for(int i=0; i<arr.length; i++) {
//			
//			maxIndex= i;
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[i]<arr[j]) {
//					isMax = false;
//					break;
//				}
//			}
//		}
//		return 0;
		
		int maxIndex = 0;
		
		for(int i=0; i<arr.length;i++) {
			if(arr[maxIndex] < arr[i]) {
				maxIndex = i;
			}
		}
		
		return maxIndex;
		
		
		//내가 한거
//		int max = 0;
//		int maxNum = 0;
//		for(int i=0; i<arr.length;i++) {
//			if(arr[i]>max) {
//				max = arr[i];
//				maxNum = i;
//			}
//		}
//		return maxNum ;
	}
}
