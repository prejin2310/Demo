package src.demo;
import java.util.*;

class Student{
	private String name;
	private String std;
	private int mark1;
	private int mark2;
	
	public Student(String name, String std,int m1, int m2) {
		this.name = name; 
		this.std = std; 
		this.mark1 = m1; 
		this.mark2 = m2; 
	}

	public String getName() { //getter for Name
		return name;
	}

	public void setName(String name) { //setter for Name
		this.name = name;
	}

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	}

	public int getMark1() {
		return mark1;
	}

	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}

	public int getMark2() {
		return mark2;
	}

	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}
		
}

public class ObjDemo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student[] arr = new Student[2];
		
		for(int i=0;i<2;i++) {
			System.out.print("Enter the name: ");
			String name = sc.nextLine();
			
			System.out.print("Enter the std: ");
			String std = sc.nextLine();
			
			System.out.print("Enter the mark 1: ");
			int m1 = sc.nextInt();
			
			System.out.print("Enter the mark 2: ");
			int m2 = sc.nextInt(); sc.nextLine(); //int -> string compiler skip so we manually add nextline to avoid it.
			
			//create a obj and store it in array.
			arr[i] = new Student(name,std,m1,m2);
			
		}
		
		for(int i=0;i<2;i++) {
			System.out.println(arr[i].getMark1() + arr[i].getMark2() );
		}
			
		
	}
}
