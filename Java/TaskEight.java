import java.util.Scanner;
public class TaskEight {
public static void main(String[]args){
Scanner input = new Scanner(System.in);

int sum=0;
int count=1;
while (count<=10) {
System.out.println("enter any  10 valid score between 0-100");
int number=input.nextInt();
if (0<=number&&number<= 100) {
sum+=number;count++; }
else 
System.out.println("invalid,try again ");

}
System.out.printf("Sum = %d%n",sum);



}
}
