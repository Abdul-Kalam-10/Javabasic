public class Firsthalfascsecondhalfdes {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int i, j, temp;
        System.out.println("Input:");
        for (i = 0; i < arr.length; i++) {
            System.out.println(" " + arr[i]);
        }
        System.out.println(" ");
        System.out.println("output:");
        for (i = 0; i < arr.length; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (i = 0; i < arr.length/2; i++) {
            System.out.println(" " + arr[i]);
        }
        for (i = 0; i < arr.length; i++) {
            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (i = 0; i < arr.length/2; i++) {
            System.out.println(" " + arr[i]);
        }
    }
    }


