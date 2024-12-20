package study.inherit03.copy;

import java.util.ArrayList;

public class MikeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BluetoothMike m1 = new BluetoothMike();
		
		m1.volumeUp(); // 재정의된 BluetoothMike에서 불러옴 (자식이라 재정의 된 것임)
		m1.voluemUp("sdfa");
		
		WirelessMike m2 = new WirelessMike();
		m2.volumeUp(); //기존 ㅁMike에서 불러옴
		
		Mike m3 = new Mike();
		m3.volumeUp(); // 마이크 본인 꺼
		
		System.out.println(m1.toString()); //재정의한 메소드 
		System.out.println(m2.toString()); // object에서 상속 받은 메소드
		
		
		
		WirelessMike m4 = m2;
		Mike m5 = m1;
		Mike m6 = m2;
		
		Mike m7 = new BluetoothMike();
		Mike m8 = new WirelessMike();
		
		int[] arri = {1,2,3,4,5,6};
		Mike[] arr = {new Mike(),new BluetoothMike(), new WirelessMike()};
		
		ArrayList<Mike> list = new ArrayList<Mike>();
		list.add(new Mike());
		list.add(new BluetoothMike());
		list.add(new WirelessMike());
		
	}

}
