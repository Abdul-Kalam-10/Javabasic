public class Neonnumber {
    public static void main(String[] args) {
        int num = 9,sum= 0,sqr,digit;
        sqr = num*num;
        while(sqr>0){
            digit = sqr%10;
            sum =sum+digit;
            sqr = sqr/10;
        }
        if(sum == num ){
            System.out.println("Neon");
        }
        else{
            System.out.println("Not a Neon");
        }
    }



}
