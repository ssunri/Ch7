import java.util.*;

public class exercise3 {

	public static void main(String[] args) {
		//나라 이름과 인구를 저장할 HashMap 컬렉션 생성
		HashMap<String,Integer> nations = new HashMap<String,Integer>(); 
		Scanner scanner = new Scanner(System.in); //스캐너 객체 생성
		
		System.out.println("나라 이름과 인구를 10개 입력하세요.(예:Korea 5000)");
		while(true) { // "그만"이 입력될 때까지 반복
			System.out.print("나라 이름, 인구 >> ");		
			String nation = scanner.next();
			if(nation.equals("그만"))
				break; // 입력 끝
			int population = scanner.nextInt();
			nations.put(nation, population); // 해시맵 나라이름과 인구 저장
		}
		
		while(true) {
			System.out.print("인구 검색 >> ");
			String nation = scanner.next();
			if(nation.equals("그만")) //"그만" 입력받으면 종료
				break;
			Integer n = nations.get(nation);
			if(n == null)
				System.out.println(nation + " 나라는 없습니다.");
			else 
				System.out.println(nation + "의 인구는 " + n); 
		}
		
		scanner.close();
	}

}
