import java.util.Scanner;

public class inputoutput {

public static void main(String[] args) {
int a = 2;
Scanner scan = new Scanner(System.in);
System.out.println("Enter the user input");
float num=scan.nextFloat();
System.out.println("Output = "+num);
System.out.print("Enter the String ");
scan.nextLine();
String str = scan.nextLine();
System.out.println("Output - "+str);
System.out.print("Enter the character - ");
char ch = scan.next().charAt(0);
System.out.println("Character = "+ch);
// System.out.println("Output "+args[0]);
// System.out.println("Output "+args[1]);

}}

/* Int - nextInt()
float - nextFloat()
double-nextDouble()
byte - nextByte()
short-nextShort()
long - nextLong()
boolean - nextBoolean()
String - nextLine()
Character- next().charAt(position)
BigInteger - nextBigInteger()
BigDecimal - nextBigDecimal()
 */