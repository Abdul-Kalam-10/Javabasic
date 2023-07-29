public class Printonlyvowels {
    public static void main(String[] args) {
        String word = "alein";
        for(int i=0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            switch (ch)
            {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(ch);
            }

        }
    }
}
