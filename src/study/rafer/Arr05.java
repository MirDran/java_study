package study.rafer;

public class Arr05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		
		//향상된 for문
		
		int[] arr= {10, 20, 30, 40, 50};
		
		for(int i=0; i<5; i++) {//index : i: 0 1 2 3 4
			System.out.print("arr["+i+"]"+arr[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		
		for(int value : arr) {
			
			//전체 갯수만큼 처음부터 끝까지 반복
			//값만 주어지고, 인덱스는 모른다.
			
			System.out.print(value+" ");
		}
		
		System.out.println();
		System.out.println();
		
		int[] scores = {90, 95, 100, 80, 75};
		int sum = 0;
		
		for(int i=0; i<scores.length;i++) {
			sum = sum + scores[i];
		}
			System.out.print("총합 : "+sum);
		
			System.out.println();
			System.out.println();
			
			sum = 0;
			for(int score : scores) {
				sum = sum + score;
			}
			
			System.out.print("총합 : "+sum);
			
			System.out.println();
			System.out.println();
			
		//점수 실수하여 모든 점수 -5점의 경우
			for(int i=0; i<scores.length;i++) {
				scores[i]= scores[i]-5;
			
			System.out.print(scores[i]+ " ");
			}
			
			System.out.println();
			for(int score : scores) {
				score = score -5;
			}
			
			System.out.println();
			System.out.println();
			for(int score : scores) {
				System.out.print(score+ " ");
			}
			
		
	}//main end

}// class end
