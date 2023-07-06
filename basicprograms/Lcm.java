public class Lcm {
    public static void main(String[] args) {
        int num1 = 3, num2 = 5, max,lcm;
        max = (num1>num2)? num1 : num2;
        while (true) {
            if((max%num1==0)&&(max%num2==0)){
             lcm = max;
             break;
        }
        max++;
    }
        System.out.println(lcm);
}
}
