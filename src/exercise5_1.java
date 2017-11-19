import java.util.*;

public class exercise5_1 {

	private Scanner scanner = new Scanner(System.in); //��ĳ�� ��ü ����
	private ArrayList<Student> information = new ArrayList<Student>(); //HashMap �÷��� ����
	private void read() {
		System.out.println("�л� �̸�,�а�,�й�,������� �Է��ϼ���.");
		for (int i=0; i<4; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ","); //�����ڷ� ','�̿�
			String name = st.nextToken().trim();
			String department = st.nextToken().trim();
			String num = st.nextToken().trim();
			double avg = Double.parseDouble(st.nextToken().trim());
			
			Student student = new Student(name, department, num, avg);
			information.add(student); //ArrayList�� ����
		}			
	}
	//��ü ����ϴ� �Լ� �ۼ�
	private void printAll() { 
	Iterator<Student> it = information.iterator();
	while (it.hasNext()) {
		Student student = it.next();
		System.out.println("----------------------------");
		System.out.println("�̸�:" + student.getName());
		System.out.println("�а�:" + student.getDepartment());
		System.out.println("�й�:" + student.getNum());
		System.out.println("�������:" + student.getAvg());
		System.out.println("----------------------------");
	}		
}
	private void search() {
		while(true) {
			System.out.print("�л� �̸� >> ");
			String name = scanner.nextLine(); // �л� �̸� �Է�
			if(name.equals("�׸�"))
				return; // ����
			for(int i=0; i<information.size(); i++) { // information�� �ִ� ��� �л� �˻�
				Student student = information.get(i); // i��° �л� ��ü
				if(student.getName().equals(name)) { //  �̸��� ���� Student ã��
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
