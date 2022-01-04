import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Width: ");
        width = sc.nextFloat();

        System.out.println("Enter Height: ");
        height = sc.nextFloat();

        float area = width * height;
        System.out.printf("Area is %s", area);
    }
}
