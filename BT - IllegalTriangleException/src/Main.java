import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Triangle triangleExample = new Triangle();
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập a: ");
        int a = input.nextInt();

        System.out.println("Nhập b: ");
        int b = input.nextInt();

        System.out.println("Nhập c: ");
        int c = input.nextInt();


        try {
            triangleExample.check(a,b,c);
        }catch(IllegalTriangleException e){
            e.printStackTrace();
        }
    }


}
