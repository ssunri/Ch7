import java.util.*;

public class exercise2 {

	public static void main(String[] args) {
		
		ArrayList<Character> a = new ArrayList<Character>(); //���ڿ��� ���� ������ ArrayList����
		
		System.out.print("6���� ������ �� ĭ���� �и� �Է�(A/B/C/D/F)>>");
		Scanner scanner = new Scanner(System.in); //��ĳ�� ��ü ����
		double sum =0;
		
		for(int i=0; i<6; i++) {
			String s = scanner.next(); //Ű����κ��� ������ �Է¹���
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
