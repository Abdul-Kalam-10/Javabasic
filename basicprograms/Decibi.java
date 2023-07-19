public class Decibi {
    public static void main(String[] args) {
        int decimal = 4 , rem ;
        String binary = "";
        while (decimal>0){
            rem = decimal%2;
            binary=rem+binary;
            decimal=decimal/2;
        }
        System.out.println(binary);
    }
}
