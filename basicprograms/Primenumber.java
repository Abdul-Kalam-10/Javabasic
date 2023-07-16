public class Primenumber {
    public static void main(String[] args) {
        int num = 17;
        int count = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count > 0)
            System.out.println("NOT A PRIME");
        else {
            System.out.println("A PRIME NUMBER");
        }
    }
}