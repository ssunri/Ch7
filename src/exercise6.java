import java.util.*;

//���� �̸�, ����, �浵 ������ ���� LocationŬ���� �ۼ�
class Location{ 
	String country; //���� �̸�
	int longitude; //�浵
	int latitude; //����
	public Location(String country,int longitude,int latitude) {
		this.country = country; //���country = �Ű�����country
		this.longitude = longitude;
		this.latitude = latitude;
	}
}

public class exercise6 {

	public static void main(String[] args) {
		HashMap<String,Location> map = new HashMap<String,Location>(); //HashMap �÷��� ����
		Scanner scanner = new Scanner(System.in); //��ĳ�� ��ü ����
		System.out.println("����, �浵, ������ �Է��ϼ���.");
		
		for(int i=0; i<4; i++) {
			System.out.print(">>");
			String[] str = scanner.nextLine().split(", "); //���ڿ��� �и��Ͽ� �迭�� �ֱ�
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
			System.out.print("���� �̸� >> ");
			String st = scanner.nextLine();
			if(st.equals("�׸�")) {
				break;
			}
			if(map.containsKey(st)) {
				Location loc = map.get(st);
				System.out.println(loc.country + "\t" +  loc.longitude + "\t" + loc.latitude);
			}
			else {
				System.out.println(st + "�� �����ϴ�.");
			}
		}
	}
}
