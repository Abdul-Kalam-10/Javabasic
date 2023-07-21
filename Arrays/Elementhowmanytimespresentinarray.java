public class Elementhowmanytimespresentinarray {
    public static void main(String[] args) {
        int[] arr={34,56,23,45,56};
        int key = 56,count= 0,i=0;
        while(i< arr.length)
        {
            if (key == arr[i]) {
                count=count+1;
            }
            i=i+1;
        }
        System.out.println(count);
    }
}
