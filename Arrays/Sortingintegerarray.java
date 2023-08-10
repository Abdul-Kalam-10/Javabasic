public class Sortingintegerarray {
    public static void main(String[] args) {
        int[] array  = {11,10,71,34,47};
        int temp;
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                if(array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for(int a : array) {
            System.out.println(a);
        }
    }
}
