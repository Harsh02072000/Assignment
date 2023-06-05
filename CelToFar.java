import java. util.Scanner;
class CelToFar{
public static void main(String[] args){
float f,c;
System.out.println("Enter Temperature in Celcius(°C) :");
Scanner s = new Scanner(System.in);
c = s. nextFloat();
f = (c*9/5)+32;
System.out.println("Temperature in Fahrenhiet(°F) : " + f );
}
}