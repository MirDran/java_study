package study.inherit.inherit04.v3;

import java.util.ArrayList;
import java.util.List;

public class Main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cleaner c1 = new Cleaner();
		Cleaner c2 = new DustCleaner();
		Cleaner c3 = new WindowCleaner();
		Cleaner c4 = new FloorCleaner();
		
		List<Cleaner> list = new ArrayList<Cleaner>();
		list.add(new DustCleaner());
		list.add(new DustCleaner());
		list.add(new DustCleaner());
		list.add(new WindowCleaner());
		list.add(new WindowCleaner());
		list.add(new WindowCleaner());
		list.add(new FloorCleaner());
		list.add(new FloorCleaner());
		list.add(new FloorCleaner());
		
		
		for(Cleaner c : list) {
			c.doClean();
			
			DustCleaner d = (DustCleaner)c;
//			d.arrangeItem();
			
			
		}
		
		
//		if( c insteanceof Discleaner){
//		c1.doClean();
//		DustCleaner dc = new DustCleaner();
//		dc.doClean();

		
		
// v1 에서 가져옴
//		DustCleaner[] dustArr = new DustCleaner[3];
//		dustArr[0] = new DustCleaner();
//		dustArr[1] = new DustCleaner();
//		dustArr[2] = new DustCleaner();
//				
//		List<WindowCleaner> windowList = new ArrayList<WindowCleaner>();
//		windowList.add(new WindowCleaner());
//		windowList.add(new WindowCleaner());
//		windowList.add(new WindowCleaner());
//		
//		List<FloorCleaner> floorList = new ArrayList<FloorCleaner>();
//		floorList.add(new FloorCleaner());
//		floorList.add(new FloorCleaner());
//		floorList.add(new FloorCleaner());
		
//		for(int i=0; i<dustArr.length; i++) {
//			dustArr[i].removeDust();
//		}
//		
//		for(int i=0; i<windowList.size(); i++) {
//			windowList.get(i).washWindow();
//		}
//		
//		for(FloorCleaner fc : floorList) {
//			fc.cleanFloor();
//		}
		
	}

}
