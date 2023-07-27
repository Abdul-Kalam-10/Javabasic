public class Copyanotherarrayreverseorder {
    public static void main(String[] args){
        int[] a={10,20,30,40,50};
        int[] b=new int[a.length];
        System.out.println("arr1");
        for(int k=0;k<a.length;k++){
            System.out.println(a[k]);
        }
        int i = 0,j=b.length-1;
        while(i<b.length){
            b[i] = a[j];
            i++;
            j--;
        }
        System.out.println("arr2");
        for (int k=0;k<b.length;k++){
            System.out.println(b[k]);
        }
    }
}
