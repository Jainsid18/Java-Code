import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseString {

    public static String[] reverseString(String s[])
    {
        int left=0;
        int right = s.length-1;
        while(left<right)
        {
            String temp = s[left];
            s[left]=s[right];
            s[right] = temp;
            left++;
            right--;
        }

        return s;
    }

    public static void main(String args[])
    {
        String s[] ={"h","e","l","l","o"};
        System.out.println(Arrays.toString(reverseString(s)));
    }
}
