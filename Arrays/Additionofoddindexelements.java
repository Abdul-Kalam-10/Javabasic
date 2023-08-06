public class Additionofoddindexelements {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        int total = 0;
        for(int i=1;i< arr.length;i+=2)
        {
            total = total + arr[i];
        }
        System.out.println("total odd index: " + total);

    }
}
