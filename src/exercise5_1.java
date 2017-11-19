import java.util.*;

public class exercise5_1 {

	private Scanner scanner = new Scanner(System.in); //스캐너 객체 생성
	private ArrayList<Student> information = new ArrayList<Student>(); //HashMap 컬렉션 생성
	private void read() {
		System.out.println("학생 이름,학과,학번,학점평균 입력하세요.");
		for (int i=0; i<4; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ","); //구분자로 ','이용
			String name = st.nextToken().trim();
			String department = st.nextToken().trim();
			String num = st.nextToken().trim();
			double avg = Double.parseDouble(st.nextToken().trim());
			
			Student student = new Student(name, department, num, avg);
			information.add(student); //ArrayList에 저장
		}			
	}
	//전체 출력하는 함수 작성
	private void printAll() { 
	Iterator<Student> it = information.iterator();
	while (it.hasNext()) {
		Student student = it.next();
		System.out.println("----------------------------");
		System.out.println("이름:" + student.getName());
		System.out.println("학과:" + student.getDepartment());
		System.out.println("학번:" + student.getNum());
		System.out.println("학점평균:" + student.getAvg());
		System.out.println("----------------------------");
	}		
}
	private void search() {
		while(true) {
			System.out.print("학생 이름 >> ");
			String name = scanner.nextLine(); // 학생 이름 입력
			if(name.equals("그만"))
				return; // 종료
			for(int i=0; i<information.size(); i++) { // information에 있는 모든 학생 검색
				Student student = information.get(i); // i번째 학생 객체
				if(student.getName().equals(name)) { //  이름이 같은 Student 찾음
					System.out.print(student.getName() + ", ");
					System.out.print(student.getDepartment() + ", ");
					System.out.print(student.getNum() + ", ");
					System.out.println(student.getAvg());
					break;
				}
			}
		}
	}
	public void run() {
		read();
		printAll();
		search();
	}
	public static void main(String[] args) {
		exercise5_1 stu = new exercise5_1();
		stu.run();
	}
}
