import java.util.*;

public class LCM{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int num1 = in.nextInt();

        System.out.print("Enter the second number : ");
        int num2 = in.nextInt();

        int max = (num1 > num2 ? num1 : num2);
        int LCM = 0;

        for(int i = max; i <= num1*num2; i+=max){
            if(i % num1 == 0 && i % num2 == 0){
                LCM = i;
                break;
            }
        } 
        System.out.println("The LCM is : " + LCM);
    }
}