import java.util.HashSet;
public class Removeduplicateinunsortedarray {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4,4,5,5,2,1,3};
        HashSet<Integer> hs = new HashSet<>();
        for (int i=0;i< arr.length;i++)
        {
            hs.add(arr[i]);
        }
        for(int no:hs)
        {
            System.out.println(no+" ");
        }
        }
}
