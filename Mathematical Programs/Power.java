public class Power{
    public static void main(String[] args){
        int base = 2;
        int exp = 3;
        int power = 1;

        for(int i = exp; i >= 1; i--){
            power *= base;
        }

        System.out.println(power);
    }
}