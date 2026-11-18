import java.util.Scanner;
public class TaskTwo {
public static void main(String[]args){
Scanner input = new Scanner(System.in);
int count=1;
int sum =0;
double average=0;
while( count<=10) {
System.out.println("enter numbers");
int number= input.nextInt();
sum+=number;
count++;
average=(double)sum/count;

}
System.out.printf("Your total average=%f%n",average);





}

}
