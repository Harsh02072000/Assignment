import java. util. Scanner;
public class FibonacciArray{
public static void main(String[] args){
Scanner s = new Scanner(System.in);
int n,i;
System.out.println("Enter no of Elements : ");
n = s.nextInt();
int [] a = new int[n];
a[0] = 0;
a[1] = 1; 
for(i=0;i<a.length-2;i++)
 a[i+2] = a[i] + a[i+1];
for(i=0;i<a.length;i++)
    System.out.print(a[i] +" " );
}
}