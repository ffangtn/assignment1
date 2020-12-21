package assignment1;
import java.util.Scanner;
public class assignment1 {

	public static void main(String[] args) {
		Scanner in= new Scanner (System.in);
		
		System.out.println("Customer Personal Background");
		System.out.print("Enter your name : ");
		String name=in.next();
		System.out.println("Name: "+ name);
		
		System.out.print("Enter your IC no : ");
		String icno=in.next();
		System.out.println("IC NO : "+ icno);
		
		System.out.print("Enter your age : ");
		int age =in.nextInt();
		System.out.println("Age: "+ age);
		
		System.out.print("Gender : ");
		String gender=in.next();
		System.out.println("Gender: "+ gender);
		
		System.out.print("Enter your citizenship: ");
		String citizenship= in.next();
		System.out.println("Citizenship:  "+ citizenship);
		
		System.out.print("Enter your marital status : ");
		String maritalstatus=in.next();
		System.out.println("Marital Status: "+ maritalstatus);
		
		System.out.print("Enter your Hp: ");
		String hp= in.next();
		System.out.println("Hp:  "+ hp);
		
		System.out.println();
		
		System.out.println("Details of Course Provided");
		System.out.println("Course 1 : Programming 1");
		System.out.println("Course Code : STA1113");
		System.out.println("Credit Hours : 3 ");
		System.out.println("Class Time : 10.00am-11.30am ");
		System.out.println("Days for Class : Monday and Thursday ");
		System.out.println();
		
		System.out.println("Course 2 : Mathematics For IT");
		System.out.println("Course Code : STQM1203");
		System.out.println("Credit Hours : 3 ");
		System.out.println("Class Time : 2.30pm-4.00pm ");
		System.out.println("Days for Class : Sunday and Tuesday ");
		System.out.println();
		
		System.out.println("Course 3 : Statistics For IT");
		System.out.println("Course Code : STQS1023");
		System.out.println("Credit Hours : 3 ");
		System.out.println("Class Time : 8.00am-9.30am ");
		System.out.println("Days for Class : Wednesday and Thursday ");
		System.out.println();
		
		String courses1 = " Course 1: Programming 1 " + System.lineSeparator()
				+ "Course Code : STA1113" + System.lineSeparator()
				+ "Credit Hours : 3 " + System.lineSeparator()
				+ "Class Time : 10.00am-11.30am" + System.lineSeparator()
				+ "Days for Class : Monday and Thursday";
		System.out.println();	
		
		String courses2 ="Course 2: Mathematics For IT " + System.lineSeparator()
				+"Course Code : STQM1203" + System.lineSeparator()
				+ "Credit Hours : 3 " + System.lineSeparator()
				+ "Class Time : 2.30pm-4.00pm" + System.lineSeparator()
				+ "Days for Class : Sunday and Tuesday";					
		System.out.println();	
		
		String courses3 ="Course 3: Statistics For IT " + System.lineSeparator()
				+ "Course Code : STQS1023"+ System.lineSeparator()
				+ "Credit Hours : 3 " + System.lineSeparator()
				+ "Class Time : 8.00am-9.30am" + System.lineSeparator()
				+ "Days for Class : Wednesday and Thursday"; 
		System.out.println();
		
		int coursestaken;
		System.out.println("Press 1 for courses1 ; Press 2 for courses2 ; Press 3 for courses3 ; Press 0 if dont have courses anymore");
		System.out.print("1. What Courses Do You Want To Take : ");
		coursestaken =in.nextInt();
		if (coursestaken ==1) {
			System.out.println(courses1);	
		}else if(coursestaken ==2) {
			System.out.println(courses2);
		}else if(coursestaken ==3) {
			System.out.println(courses3);
		}
		System.out.println();
		System.out.print("2. What Courses Do You Want To Take : ");
		coursestaken =in.nextInt();
		if (coursestaken ==1) {
			System.out.println(courses1);	
		}else if(coursestaken ==2) {
			System.out.println(courses2);
		}else if(coursestaken ==3) {
			System.out.println(courses3);
		}
		System.out.println();
		System.out.print("3. What Courses Do You Want To Take : ");
	    coursestaken =in.nextInt();
		if (coursestaken ==1) {
			System.out.println(courses1);	
		}else if(coursestaken ==2) {
			System.out.println(courses2);
		}else if(coursestaken ==3) {
			System.out.println(courses3);
		}
		
		System.out.print("Enter Total Courses Do You Want To Take : ");
		int courses = in.nextInt();
		System.out.println("Total Number of Courses Enrolled : " + courses);
		int coursescredit = (courses*3);
		System.out.println("Total Courses Credit Hours : " + coursescredit);
		System.out.println();
		
		

	}

}
