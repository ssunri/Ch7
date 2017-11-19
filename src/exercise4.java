import java.util.*;

public class exercise4 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(); //정수 값만 다루는 벡터 생성
		Scanner scanner = new Scanner(System.in);
		
		Iterator<Integer> it = v.iterator(); //Iterator 객체 얻기
		
		while(true) {
			System.out.print("강수량 입력 (0입력시 종료)>>");
			int amount = scanner.nextInt(); 
			
			if(amount == 0) //"그만" 입력받으면 종료
				break;
			else
				v.add(amount); //amount값 삽입
			
			for(int i=0; i<v.size(); i++) {
				System.out.print(v.get(i) + " ");
			}
			//Iterator를 이용하여 모든 정수 더하기
			int sum =0;
			it = v.iterator(); //it 다시 설정
			while(it.hasNext()) {
				int n = it.next();
				sum += n;
			}
			System.out.println("");
			System.out.println("현재 평균 " + sum/v.size());
		}
		scanner.close();	
	}

}
