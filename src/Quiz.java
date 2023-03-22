public class Quiz {

    public static void main(String[] args) {
        System.out.println(noVowels("Hello"));
        System.out.println(findN(11));

    }



    /** 1. Write a method that returns the number of vowels in a string.
           Consider a, e, i, o, u as vowels. **/

    public static int noVowels (String vowels) {
        int no = 0;
        for (int i = 0; i < vowels.length(); i++) {
            if (vowels.charAt(i) == 'a' || vowels.charAt(i) == 'e' || vowels.charAt(i) == 'i' || vowels.charAt(i) == 'o' || vowels.charAt(i) == 'u') {
                no++;
            }

        }
        return no;
    }






    /** 2. Write a method called findN that finds the number of natural numbers not exceeding N
        and not divisible by any of the numbers [2, 3, 5].

        Example

        Let's take the number 5 as an example:

        1 - doesn't divide integer by 2, 3, and 5
        2 - divides integer by 2
        3 - divides integer by 3
        4 - divides integer by 2
        5 - divides integer by 5

        Answer: 1 (only one number doesn't divide integer by any of 2, 3, 5) **/

public static int findN (int n){
    int div = 0;
    for (int i = 0; i <= n; n--){
        if (n % 2 != 0 && n % 3 != 0 && n % 5 != 0)
        {
            div++;
        }

    }

    return div;


}




    /** 3. Write a method called camelCaseMe so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case). The next words should always be capitalized.

           Examples

           "the-stealth-warrior" gets converted to "theStealthWarrior"

           "The_Stealth_Warrior" gets converted to "TheStealthWarrior"

           "The_Stealth-Warrior" gets converted to "TheStealthWarrior" **/

    public static String camelCaseMe(String a) {
        String b ="";
        if (a.charAt(0) != '_' && a.charAt(0) != '-') {
            b += "" + a.charAt(0);
        }
        for (int i = 1; i < a.length();i++) {
            char c = a.charAt(i);
            if (c != '_' && c != '-') {
                if (a.charAt(i-1) == '_' || a.charAt(i-1)=='-' && c > 96) {
                    c -= 32;
                }
                b += "" + c;
            }
        }
        return b;
    }

}
