import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入你的身高(m)：");
        double a=sc.nextDouble();
        System.out.println("输入你的体重(kg)：");
        double b=sc.nextDouble();
        double bmi=b/(a*a);
        if(bmi>=18.5&&bmi<=23.9)
        {
            System.out.println("正常");
        }
        else if(bmi<18.5)
            System.out.println("过轻");
        else
            System.out.println("超重");
    }
}
