import java.util.*;

public class Disarium{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = in.nextInt();
        int temp1 = num;
        int sum = 0;
        int count = 0;

        while(num!=0){
            count++;
            num/=10;
        }

        int temp2 = temp1;

        while(temp1 != 0){
            int rem = temp1%10;
            int exp = count;
            int base = rem;
            int power = 1;

            for(int i = exp; i >= 1; i--){
                power = power * base;
            }

            sum += power;
            temp1 /= 10;
            count--;
        }

        if(temp2 == sum){System.out.println("Disarium number");}
        else{System.out.println("Not Disarium number");}
    }
}