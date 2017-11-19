import java.util.*;


public class exercise5_2{

	private Scanner scanner = new Scanner(System.in);
	private HashMap<String, Student> information = new HashMap<String, Student>();
	
	private void read() {
		System.out.println("�л� �̸�,�а�,�й�,������� �Է��ϼ���.");
		for (int i=0; i<4; i++) {
			System.out.print(">> ");
			String text = scanner.nextLine();
			StringTokenizer st = new StringTokenizer(text, ",");
			String name = st.nextToken().trim();
			String department = st.nextToken().trim();
			String num = st.nextToken().trim();
			double avg = Double.parseDouble(st.nextToken().trim());
			
			Student student = new Student(name, department, num, avg);
			information.put(name, student); //�ؽøʿ� ����
		}			
	}
	
	private void printAll() {
		Set<String> key = information.keySet();
		Iterator<String> it = key.iterator();
		while (it.hasNext()) {
			String name = it.next(); // �̸� �˾Ƴ�
			Student student = information.get(name); // �̸��� Ű���Ͽ� �ؽø����� Student ��ü ��
			System.out.println("---------------------------");
			System.out.println("�̸�:" + student.getName());
			System.out.println("�а�:" + student.getDepartment());
			System.out.println("�й�:" + student.getNum());
			System.out.println("�������:" + student.getAvg());
			System.out.println("---------------------------");
		}		
	}

	private void search() {
		while(true) {
			System.out.print("�л� �̸� >> ");
			String name = scanner.nextLine(); // �л� �̸� �Է�
			if(name.equals("�׸�"))
				return; // ����
			
			Student student = information.get(name); // �ؽøʿ��� �̸��� Ű�� �˻�
			if(student == null) { // �̸��� �ؽøʿ� ���ٸ�
				System.out.println(name + " �л� �����ϴ�.");
			}
			else { // �ؽøʿ��� �˻���  Student ��ü
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
