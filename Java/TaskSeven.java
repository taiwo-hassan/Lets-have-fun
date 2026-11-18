import java.util.Scanner;
public class TaskSeven {
public static void main(String[]args){
Scanner input = new Scanner(System.in);
int count=1;
int sum =0;
int counter=0;
while( count<=10) {
System.out.println("enter numbers");
int number= input.nextInt();
if (number%2==0) {
sum+=number;
counter++;}

count++;
}
double average=(double)sum/counter;
System.out.printf("Your total sum is %d%n average= %f%n",sum,average);





}

}
