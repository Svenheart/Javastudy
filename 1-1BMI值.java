import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("����������(m)��");
        double a=sc.nextDouble();
        System.out.println("�����������(kg)��");
        double b=sc.nextDouble();
        double bmi=b/(a*a);
        if(bmi>=18.5&&bmi<=23.9)
        {
            System.out.println("����");
        }
        else if(bmi<18.5)
            System.out.println("����");
        else
            System.out.println("����");
    }
}
