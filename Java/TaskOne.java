import java.util.Scanner;
public class TaskOne {
public static void main(String[]args){
Scanner input = new Scanner(System.in);
int count=1;
int sum =0;
while( count<=10) {
System.out.println("enter numbers");
int number= input.nextInt();
sum+=number;
count++;
}
System.out.printf("Your total sum is %d%n",sum);





}

}
