public class Squarerootofnumber{
    public static void main(String[] args) {
        int num = 36 , i= 2;
        while(i<=num/2){
            if(num/i==i){
                System.out.println("square number is " +" " + i);
                break;
            }
            i++;
        }
    }
}
