import java.util.Scanner;

public class Triangle {

    Scanner scanner = new Scanner(System.in);

    public void check(int a, int b, int c) throws IllegalTriangleException{
        if (a<=0 || b<=0 || c<=0){
            throw new IllegalTriangleException("Độ dài cạnh của tam giác không thể nhỏ hơn 0.");

        } else if (a+b < c || a+c < b || b+c <a) {
            throw new IllegalTriangleException("Tổng độ dài 2 cạnh của tam giác không thể nhỏ hơn cạnh còn lại.");
        }

    }

}
