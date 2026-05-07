package Test_package;

public class varcheck {
	//instance variable(global)
	int id,age;
	String name, dept;
	double salary;
	//static variable
	static String company_name="Wipro";
	//local variable
	void department(int dptid, String dptname) {
		System.out.println("Company name "+company_name);
		System.out.println("employee name "+name);
		System.out.println("Department id  "+dptid);
		System.out.println("department name "+dptname);

		
	}
	void team(int tid, String tname) {
		System.out.println("\nCompany name "+company_name);
		System.out.println("employee name "+name);
		System.out.println("team id  "+tid);
		System.out.println("team name "+tname);

		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		varcheck v=new varcheck();
		v.name="Rahul";
		v.department(101, "Project manager");
		v.name="Jai";
		v.team(103,"HR");

	}

}
