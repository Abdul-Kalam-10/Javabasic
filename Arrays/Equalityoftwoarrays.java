import java.util.Arrays;
public class Equalityoftwoarrays {
    public static void main(String[] args) {
        //approach 1//
        int[] arr1 = {10,20,30,40,50};
        int[] arr2 = {10,20,30,40,55};

       boolean status = Arrays.equals(arr1,arr2);
        if(status==true)
        {
            System.out.println("Arrays are equal");
        }
        else{
            System.out.println("not equal");
        }

    }

    }
    //approach2//
    /*boolean status = true;
    if(arr1.length == arr2.length)
    {
        for (int i=0;i<arr1.length;i++)
        {
            if (arr1[i] != arr2[i])
            {
                status = false;
            }
        }
    }
    else
    {
      status = false;
    }
    if (status==true)
    {
        System.out.println("arrays are equal");
    }
    else{
        System.out.println("not equal");
    }
    }
    }*/
