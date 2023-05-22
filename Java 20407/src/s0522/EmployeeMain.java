package s0522;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.setName("리바이 아커만");
		e1.setNo(2);
		e1.setAge(35);
		System.out.println(e1.toString());
		
		Employee e2=new Employee("에렌 예거",1,20);
		System.out.println(e2.toString());
	}

}
