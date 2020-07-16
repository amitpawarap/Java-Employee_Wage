public class EmployeeWage
{

public static void main(String args[]){
System.out.println("*********Welcome To Employee Wage System**********");
		//constant
		final int fullTime=1;
		//computation
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if ( empCheck == fullTime )
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
}

}
