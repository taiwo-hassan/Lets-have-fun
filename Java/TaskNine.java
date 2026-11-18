import java.util.Scanner;
public class TaskNine {
public static void main(String[]args){
Scanner input = new Scanner(System.in);

int sum=0;
int count=1;
while (count<=10) {
System.out.println("enter any  10 valid score between 0-100");
int number=input.nextInt();
if (number>=0) {
sum+=number; }
else 
System.out.println("invalid");
count++;
}
System.out.printf("Sum = %d%n",sum);



}
}
