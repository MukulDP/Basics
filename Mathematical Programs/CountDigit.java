public class CountDigit{
    public static void main(String[] args){
        int num = 123;
        int count = 0;

        System.out.println(num);

        while(num != 0){
            count++;
            num /= 10;
        }

        System.out.println(count);
    }
}