import java.util.Scanner;
public class TaskTen {
public static void main(String[]args){
Scanner input = new Scanner(System.in);
int counter=0;
int sum=0;
int count=1;
while (count<=10) {
System.out.println("enter any  10 valid score between 0-100");
int number=input.nextInt();
if (number>=0) {
sum+=number; 
counter++;}
else 
System.out.println("invalid");
count++;
}
double average = (double) sum/counter;
System.out.printf("average= %f%n",average);



}
}
