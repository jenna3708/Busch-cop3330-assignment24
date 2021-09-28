import java.util.Scanner;
import java.util.Arrays;

public class exercise24 {

    static boolean isAnagram(String one, String two)
    {
        boolean anagram = true;

        //checking if they are the same size
        if (one.length() != two.length())
        {
            anagram = false;
            return false;
        }
        else
        {
            char[] s1Array = one.toLowerCase().toCharArray();

            char[] s2Array = two.toLowerCase().toCharArray();

            //Sorting both s1Array and s2Array

            Arrays.sort(s1Array);

            Arrays.sort(s2Array);

            //Checking whether s1Array and s2Array are equal

            anagram = Arrays.equals(s1Array, s2Array);
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("Enter two strings and I'll tell you if they are anagrams:");

        //create a scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String one = input.next();

        System.out.println("Enter the second string:");
        String two = input.next();

        //now we run our function
        isAnagram(one, two);

        if(isAnagram(one,two))
            System.out.println("\""+one+"\" and \""+two+"\" are anagrams");
        else
            System.out.println("\""+one+"\" and \""+two+"\" are not anagrams");
    }

}
