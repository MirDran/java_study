package study.practice.practice12_23;

import java.util.List;

public class Center0000 {

	public static void main(String[] args) {
		
		Roomdd r1 = new TeachingRoom("강의실",03);

	}

	int Floor;
	int Room;
	int Employee;

}

	 class Employee extends Center0000 {
		public String name;
		public int userNum;
	}

	 class Employees extends Employee {
		

	}

	 class Roomdd extends Center0000 {
		public String name;
		public int roomNum;

		public Roomdd(String name, int roomNum) {
			this.name = name;
			this.roomNum = roomNum;
		}

	}

	 class Rooms extends Roomdd {

		public Rooms(String name, int roomNum) {
			super(name, roomNum);
		}
	}

	 class TeachingRoom extends Rooms {

		public TeachingRoom(String name, int roomNum) {
			super(name, roomNum);
		}

	}

	 class FoyerRoom extends Rooms {

		public FoyerRoom(String name, int roomNum) {
			super(name, roomNum);
		}

	}

	 class OfficeRoomdd extends Rooms {

		public OfficeRoomdd(String name, int roomNum) {
			super(name, roomNum);
		}

	}

