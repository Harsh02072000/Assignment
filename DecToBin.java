import java.lang.Math;
import java.util.Scanner;
class DecToBin {
    public static void main(String[] args) {
        int num,rem,res = 0,onum,i = 0;
        System.out.println("Enter decimal Number:");
        Scanner s = new Scanner(System.in);
         num = s.nextInt();
         onum = num;
           while(num!=0 )
            {
                rem = num % 2;
                res += (Math.pow(10,i)*rem);
                num = num / 2;
                i++;
                System.out.println(i);
            }
         System.out.println(" Binary Number of "+ onum + " : "+ res);
       }
}