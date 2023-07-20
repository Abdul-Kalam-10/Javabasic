public class Bideci {
    public static void main(String[] args) {
        int binary = 1010, i=0,rem;
        double decimal = 0;
        while (binary>0){
            rem = binary % 10;
            decimal = decimal + (rem*Math.pow(2,i));
            binary = binary/10;
            i = i+1;
        }
        System.out.println(decimal);
    }
}
