
import java.util.Scanner ;
public class Prog7{
    public static void  main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter a value");
        a=sc.nextInt();
        switch (a)
        {
            case 1: System.out.println("yo");
            break;
            default: System.out.print("check ur eyes");
        }

    }
}