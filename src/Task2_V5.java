import java.util.Scanner;
public class Task2_V5 {
    public static void main(String[] args){
        {
            Scanner in = new Scanner(System.in,"cp1251");
            float[] F = new float[5];
            float min;
               System.out.println("Введіть занчення першого елементу масива:");
                F[0] = in.nextFloat();
                System.out.println("Введіть занчення другого елементу масива:");
                F[1] = in.nextFloat();
                System.out.println("Введіть занчення третього елементу масива:");
                F[2] = in.nextFloat();
                System.out.println("Введіть занчення четвертого елементу масива:");
                F[3] = in.nextFloat();
                System.out.println("Введіть занчення п'ятого елементу масива:");
                F[4] = in.nextFloat();
                System.out.println("Мінімум одномірного масиву: ");
                min = F[0];
                for (int i = 1; i > F.length; i++)
                    if (min > F[i])
                        min = F[i];
                System.out.println(min);

        }
    }
}
