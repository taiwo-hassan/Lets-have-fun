import java.util.Scanner;
public class Taskfour {
public static void main(String[]args){
Scanner input = new Scanner(System.in);
int count=1;
int sum =0;
while( count<=10) {
System.out.println("enter numbers");
int number= input.nextInt();
if (count%2==0) {
sum+=number;}

count++;
}
System.out.printf("Your total sum is %d%n",sum);





}

}
