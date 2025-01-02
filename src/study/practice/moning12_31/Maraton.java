//package study.practice.moning12_31;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//
//public class Maraton {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		String[] participant1 = {
//				"leo","kiki","eden"
//		};
//		String[] completion1 = {
//				"eden", "kik"
//		};
//		
//		
//		String[] participant2 = {
//				"marina","josipa","nikola","vinko","filipa"
//		};
//		String[] completion2 = {
//				"marina","josipa","nikola","filipa"
//		};
//		
//		
//		String[] participant3 = {
//				"mislav","stanko","ana","mislav"
//		};
//		String[] completion3 = {
//				"mislav","stanko","ana"
//		};
//		
//		
//		
//		
//		String result1 = solution(participant1,completion1);
//		String result2 = solution(participant2,completion2);
//		String result3 = solution(participant3,completion3);
//		
////		
//		System.out.println(result1);
//		System.out.println(result2);
//		System.out.println(result3);
//		
////		if(!result1.equals("leo")) {
////			//정답이 아님
////		}
//		
//	}
//	
//	public static String solution(String[] participant, String[] completion) {
//		
//		
//		1.번
//		//참가자 목록에서 완주자 목록에 있는 이름을 하나씩 지우기
//		List<String> partList = new ArrayList<String>(List.of(participant));
//		List<String> compList = new ArrayList<String>(List.of(completion));
////		System.out.println(partList);
////		System.out.println(compList);
////		partList.remove(0)
//	
//		for(String s : compList) {
//			partList.remove(s);
//		}
////		System.out.println(partList);
//		
//		return partList.get(0);
		
		
		//HashSet 활용
		// 2.완주자 목록 추가. -> 참가자에서 한개씩 지우기
		
//		Set<String> compSet = new HashSet<String>();
//		for(String s : completion) {
//			compSet.add(s); //완주자 목록
//		}
//		
//		//참가자 값을 compSet에서 혹인해서 있는지 확인
//		//있으면 삭제 없으면 완주 못했다.
//		for(String s : participant) {
//			if(compSet.contains(s)) { // 있으면 삭제
//				
//				compSet.remove(s);
//				
//			}else { //없으면 완주 못했다
//				return s; //조건 안에 있는 return 실행이 안될 수도 있다고 판단 됨
//			}
//		}
		
		//이름 갯수

		
//		Map<String, Integer> pMap = new HashMap<String, Integer>();
//		
////		for(String s : participant) {
////			if(pMap.containsKey(s)) { //이미 그 이름이 있다.
////				pMap.put(s, pMap.get(s) + 1);
////				
////			}else { // 그 이름이 없다.
////				pMap.put(s,1);
////			}
//			
//		}
//		
//	}
//	
//	
//}


