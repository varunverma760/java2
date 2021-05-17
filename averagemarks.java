package fundamentals;

import java.util.Scanner;

public class Average_marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m1, m2, m3;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the value of student 1");
		m1=s.nextInt();
		System.out.println("Enter the value of student 2");
		m2=s.nextInt();
		System.out.println("Enter the value of the student 3");
		m3=s.nextInt();
		int avg=(m1+m2+m3)/3;
		System.out.println(avg);

	}

}
