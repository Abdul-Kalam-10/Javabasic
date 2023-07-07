public class Gcd {
    public static void main(String[] args) {
        int num1 = 12, num2 = 30, min;
        min = (num1 > num2) ? num1 : num2;
        while (min >= 2) {
            if ((num1 % min == 0) && (num2 % min == 0)) {
                break;
            }
            min--;
        }
        System.out.println("GCD is" + " "+min);
    }
}


