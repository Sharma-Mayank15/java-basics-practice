import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
    //1d array
int array[] = {10,20,30};

//2d array
int twoD[] [] = {{20,30}, {40,50}};
//3d array I
int threeD[] [] [] = {{{20}, {20,30}}};
System.out.println(array[0]);
System.out.println(twoD[0][1]);
System.out.println(threeD);

//dynamic array
Scanner scan = new Scanner(System.in);
System.out.print ("Enter the size of array ");
int size = scan.nextInt();
int arr[] = new int[size];
arr[0] = 10;
System.out.print("Enter the value to store in array ");
arr[1] = scan.nextInt();
System.out.println(arr[0]+", "+arr[1]);
    }

}
