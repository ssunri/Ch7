import java.util.*;


public class exercise5_2{

	private Scanner scanner = new Scanner(System.in);
	private HashMap<String, Student> information = new HashMap<String, Student>();
	
	private void read() {
		System.out.println("학생 이름,학과,학번,학점평균 입력하세요.");
		for (int i=0; i<4; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String name = st.nextToken().trim();
			String department = st.nextToken().trim();
			String num = st.nextToken().trim();
			double avg = Double.parseDouble(st.nextToken().trim());
			
			Student student = new Student(name, department, num, avg);
			information.put(name, student); //해시맵에 저장
		}			
	}
	
	private void printAll() {
		Set<String> key = information.keySet();
		Iterator<String> it = key.iterator();
		while (it.hasNext()) {
			String name = it.next(); // 이름 알아냄
			Student student = information.get(name); // 이름을 키로하여 해시맵으로 Student 객체 얻어냄
			System.out.println("---------------------------");
			System.out.println("이름:" + student.getName());
			System.out.println("학과:" + student.getDepartment());
			System.out.println("학번:" + student.getNum());
			System.out.println("학점평균:" + student.getAvg());
			System.out.println("---------------------------");
		}		
	}

	private void search() {
		while(true) {
			System.out.print("학생 이름 >> ");
			String name = scanner.nextLine(); // 학생 이름 입력
			if(name.equals("그만"))
				return; // 종료
			
			Student student = information.get(name); // 해시맵에서 이름을 키로 검색
			if(student == null) { // 이름이 해시맵에 없다면
				System.out.println(name + " 학생 없습니다.");
			}
			else { // 해시맵에서 검색된  Student 객체
				System.out.print(student.getName() + ", ");
				System.out.print(student.getDepartment() + ", ");
				System.out.print(student.getNum() + ", ");
				System.out.println(student.getAvg());
			}
		}
	}
	public void run() {
		read();
		printAll();
		search();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exercise5_2 stu = new exercise5_2();
		stu.run();
	}

}
