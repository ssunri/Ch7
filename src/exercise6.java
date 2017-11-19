import java.util.*;

//도시 이름, 위도, 경도 정보를 가진 Location클래스 작성
class Location{ 
	String country; //도시 이름
	int longitude; //경도
	int latitude; //위도
	public Location(String country,int longitude,int latitude) {
		this.country = country; //멤버country = 매개변수country
		this.longitude = longitude;
		this.latitude = latitude;
	}
}

public class exercise6 {

	public static void main(String[] args) {
		HashMap<String,Location> map = new HashMap<String,Location>(); //HashMap 컬렉션 생성
		Scanner scanner = new Scanner(System.in); //스캐너 객체 생성
		System.out.println("도시, 경도, 위도를 입력하세요.");
		
		for(int i=0; i<4; i++) {
			System.out.print(">>");
			String[] str = scanner.nextLine().split(", "); //문자열을 분리하여 배열에 넣기
			int d1 = Integer.parseInt(str[1]);
			int d2 = Integer.parseInt(str[2]);
			map.put(str[0],new Location(str[0],d1,d2));	
		}
		System.out.println("------------------------");
		for(String key : map.keySet()) {
			Location loc = map.get(key);
			System.out.println(loc.country + "\t" + loc.longitude + "\t" + loc.latitude);
		}
		System.out.println("------------------------");
		while(true) {
			System.out.print("도시 이름 >> ");
			String st = scanner.nextLine();
			if(st.equals("그만")) {
				break;
			}
			if(map.containsKey(st)) {
				Location loc = map.get(st);
				System.out.println(loc.country + "\t" +  loc.longitude + "\t" + loc.latitude);
			}
			else {
				System.out.println(st + "는 없습니다.");
			}
		}
	}
}
