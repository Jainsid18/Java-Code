public class MergeString {

    public static String mergeAlternately(String word1,String word2)
    {
        int i=0;
        int j=0;

        StringBuilder st = new StringBuilder();

        while(i<word1.length() && j<word2.length())
        {
            st.append(word1.charAt(i));
            st.append(word2.charAt(j));

            i++;
            j++;
        }

        while(i<word1.length())
        {
            st.append(word1.charAt(i));
            i++;
        }

        while(j<word2.length())
        {
            st.append(word2.charAt(j));
            j++;
        }
        return st.toString();
    }
    public static void main(String args[])
    {
        String word1="abc";
        String word2="pqr";

        System.out.println(mergeAlternately(word1,word2));
    }
}
