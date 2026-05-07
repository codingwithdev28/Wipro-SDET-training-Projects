package Test_package;

public class variable_use {

	//instance variable(global)
		int roll,age;
		String name, dept;
		double salary;
		//static variable
		static String college_name="NIET";
		//local variable
		void department(int id, String dptname) {
			System.out.println("College name "+college_name);
			System.out.println("Student name "+name);
			System.out.println("Department id  "+id);
			System.out.println("Department name "+dptname);

			
		}
		void team(int tno, String tname) {
			System.out.println("\nCollege name "+college_name);
			System.out.println("Student name "+name);
			System.out.println("Team no  "+tno);
			System.out.println("Team name "+tname);

			
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			variable_use v=new variable_use();
			v.name="Rahul";
			v.department(101, "ECE");
			v.name="Jai";
			v.team(05,"'Team Drona'");

		}

}
