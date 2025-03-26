import java.util.Scanner;
public class Methods{
    public static void main(String[] args){
        Scanner scanner= new Scanner (System.in);

    //here scanner is object of Scanner class which helps to read the 
    //input of the user
    System.out.println("enter the two number you want to add:");
    int num1 = scanner.nextInt();
    int num2 = scanner.nextInt();

    //nextInt() is important for reading the next variables in the functions
    int sum= addNumbers(num1,num2);
    //This line of code is calling a method named addNumbers and
    // storing the result in a variable named sum.
    System.out.println("sum:"+ sum);
    scanner.close();
     // this int sum helps to add the number which is function
    }

    public static int addNumbers(int a, int b){
        return a+b;
    }
}


