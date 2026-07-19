import java.util.*;

public class Atomorphic{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = in.nextInt();
        int sqr = num * num;
        int temp = num;
        int divisor = 1;

        while(num > 0){
            divisor = divisor * 10;
            num /= 10;
        }
        if(sqr % divisor == temp){System.out.println("Atomorphic number");}
        else {System.out.println("Not a Atomorphic number");}
    }
}