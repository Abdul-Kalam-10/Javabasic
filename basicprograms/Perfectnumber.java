public class Perfectnumber {
    public static void main(String[] args) {
        int num = 28, perfect = 0, i = 1;
        do {
            if (num % i == 0)
                perfect = perfect + i;
            i = i + 1;
        } while (i <= num / 2);
        if(num == perfect){
            System.out.println("Perfect number");
        }
        else{
            System.out.println("not a perfect number");
        }
    }
}