import java.util.Scanner;
public class ReverseArray{
public static void main(String[] args){
int i,j,n;
Scanner s = new Scanner(System.in);
System.out.println("Enter the Size Of An ARRAY : ");
n = s.nextInt();
System.out.println("Enter Elements Of An ARRAY : ");
int [] a = new int[n];

for(i=0;i<a.length;i++)
{
a[i] = s.nextInt();
}
System.out.println("ARRAY ELEMENTS are : ");
for(i=0;i<a.length;i++)
System.out.println( a[i] + " ");
System.out.println("REVERSE OF ARRAY ELEMENTS are : ");
for(i=a.length-1;i>=0;i--)
System.out.println( a[i] + " ");
}
}

