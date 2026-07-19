public class LovePattern{
    public static void main(String[] args){
        
        int num = 3;
        for(int i=1; i<=num*2; i++){
            for(int j=1; j<=num*2+1; j++){

                if((i+j == num || j-i == num-1 && i + j == num*2 || i+j == num+1 && i!=j || i-j == num-1)||
                    (i+j == num*2 && j-i==num+1 || j-i == num+2 || i+j == num*3+1)){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
            }System.out.println();
        }
    }
}