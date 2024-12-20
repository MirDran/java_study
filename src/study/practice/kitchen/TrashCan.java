package study.practice.kitchen;

public class TrashCan {
	
	int liter;
	String Color;
	
	int percent;// 100% 90 95 80 85 etc..
	
	
	
	boolean isCoverOpened; // 쓰레기통 뚜껑 열렸나? 닫혔나?
	
	
	public void openCover() {
		isCoverOpened = true;
	}
	
	public void closeCover() {
		isCoverOpened = false;
	}
	
	public void cleanTrashCan() {
		percent = 0;
	}
	
	
	public void insertTrash(int percent) { // percent 에 입력한 값에 따른 퍼센티지
		this.percent += percent;
	}
	
	public void insertTrashLiter(int liter) { // liter 입력한 값에 따른 리터
		percent = percent + (liter/this.liter * 100);
		
		// 10 + (3L/10L) * 100
		// 10% + 30% = 40% 
	}
	
}
