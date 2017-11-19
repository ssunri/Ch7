public class Student {
	private String name;
	private String department;
	private String Num;
	private double Avg;
	
	public Student(String name, String department, String Num, double Avg) {
		this.name = name;
		this.department = department;
		this.Num = Num;
		this.Avg = Avg;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	public void setNum(String Num) {
		this.Num = Num;
	}
	public String getNum() {
		return Num;
	}
	public void setAvg(double Avg) {
		this.Avg = Avg;
	}
	public double getAvg() {
		return Avg;
	}
}