import java.util.*;

public class exercise4 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(); //���� ���� �ٷ�� ���� ����
		Scanner scanner = new Scanner(System.in);
		
		Iterator<Integer> it = v.iterator(); //Iterator ��ü ���
		
		while(true) {
			System.out.print("������ �Է� (0�Է½� ����)>>");
			int amount = scanner.nextInt(); 
			
			if(amount == 0) //"�׸�" �Է¹����� ����
				break;
			else
				v.add(amount); //amount�� ����
			
			for(int i=0; i<v.size(); i++) {
				System.out.print(v.get(i) + " ");
			}
			//Iterator�� �̿��Ͽ� ��� ���� ���ϱ�
			int sum =0;
			it = v.iterator(); //it �ٽ� ����
			while(it.hasNext()) {
				int n = it.next();
				sum += n;
			}
			System.out.println("");
			System.out.println("���� ��� " + sum/v.size());
		}
		scanner.close();	
	}

}
