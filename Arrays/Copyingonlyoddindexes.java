public class Copyingonlyoddindexes {
    public static void main(String[] args) {
        int[]arr1 = {10,20,30,40,50,60};
        int odd = arr1.length/2;
        int[]arr2 = new int[odd];
        int j=0;
        for(int i=1;i< arr1.length;i+=2)
        {
            arr2[j]=arr1[i];
            j++;
        }
        System.out.println("PRINTING ARRAY 2");
        for (int i=0;i< arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
