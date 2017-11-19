import java.util.*;

public class exercise2 {

	public static void main(String[] args) {
		
		ArrayList<Character> a = new ArrayList<Character>(); //문자열만 삽입 가능한 ArrayList생성
		
		System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
		Scanner scanner = new Scanner(System.in); //스캐너 객체 생성
		double sum =0;
		
		for(int i=0; i<6; i++) {
			String s = scanner.next(); //키보드로부터 학점을 입력받음
			a.add(s.charAt(0)); 
		}
		
		for(int i=0; i<a.size(); i++) {
			char ch = a.get(i);
			switch(ch) {
			case 'A' : 
				sum += 4.0; break;
			case 'B' :
				sum += 3.0; break;
			case 'C' :
				sum += 2.0; break;
			case 'D':
				sum += 1.0; break;
			case 'F':
				sum += 0; break;
			}
		}
		
		System.out.println((double)sum/6);
		scanner.close();
		
	}

}
