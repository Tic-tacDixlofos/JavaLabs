import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
Calculator calc=new Calculator();
calc.decrease(3, 3);
calc.divide(3, 4);
calc.sum(3, 4);
calc.multiply(3,4);
    }}
interface University {
    public int sum(int a, int b);
    public void decrease(int a, int b);
    public void multiply(int a, int b);
    public int divide(int a, int b);

}
class Calculator implements University {
    int a;
    int b;

    @Override
    public int sum(int a, int b) {
        a=4;
        b=5;
        return a+b;


    }

    @Override
    public void decrease(int a, int b) {
        b=5;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a: ");
         int num= scan.nextInt();
        num=a;
         scan.close();

     /*   Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter b: ");
        int num2= scan.nextInt();
        num2=b;
        scan.close();*/
        int num3=a+b;

        System.out.println("a+b="+num3);




    }

    @Override
    public void multiply(int a, int b) {
a=4;
        b=10;
        int rez=a+b;
    }

    @Override
    public int divide(int a, int b) {
a=10;
b=5;
return a/b;


    }
}
