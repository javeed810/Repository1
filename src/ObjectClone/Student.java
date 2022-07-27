package ObjectClone;

public class Student implements Cloneable{
	public long rollNo;
	public String name;

		Student(long rollNo, String name){
			this.rollNo=rollNo;
			this.name=name;
		}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public static void main(String[] args) {
		Student s1=new Student(101,"Haneef");
		try {
			Student s2=(Student)s1.clone();
			System.out.println(s1.rollNo);
			System.out.println(s1.name);
			System.out.println(s2.rollNo);
			System.out.println(s2.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
