//java program to calculate average of students and display grades
//22-08-2023
//StudentAverage.java
import java.io.*;
import java.util.*;
public class StudentAverage{
public static void main(String[]args){
System.out.println("Enter marks of 3 subjects");
Scanner sc = new Scanner(System.in);
int m1=sc.nextInt();
int m2=sc.nextInt();
int m3=sc.nextInt();
int total=m1+m2+m3;
float avg=(float)total/3;
if(avg>=75){
System.out.println("Student passed in Distention");
}
else if(avg>=60&&avg<75){
System.out.println("Student passed in First Class");
}
else if(avg>=50&&avg<60){
System.out.println("Student passed in Secound Class");
}
else if(avg>=40&&avg<50){
System.out.println("Student passed in Third Class");
}
else{
System.out.println("Student failed");
}
}
}