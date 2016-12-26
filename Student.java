package session3;

public class Student {
int rollno;
int marksobtained;
int totalmarks;
int passmarks;

String name;
static String college = "DPS";
Student(int r,int m,int t,int p, String n){
	rollno= r;
	marksobtained=m;
	totalmarks=t;
	passmarks=p;
	name=n;
}
void display()
{
	System.out.println(rollno+" "+marksobtained+" "+totalmarks+" "+passmarks+" "+name+" "+college);
	
}
public static void main(String[] args){
	Student s1=new Student(111,200,500,150,"Aishwarya");
	Student s2=new Student(112,250,500,150,"Ankit");
	Student s3=new Student(113,260,500,150,"Abhishek");
	s1.display();
	s2.display();
	s3.display();
}


}



