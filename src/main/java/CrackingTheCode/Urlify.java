package CrackingTheCode;

public class Urlify {


    /**
     * URLify: replace spaces in a string with '%20'. Perform in place.
     *
     * Assumptions:
     *  there is enough space in char array to hold additional characters
     *  given true length of string
     *
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
/*    public static void urlify(char[] chars, int length) {
        int numSpaces = 0;
        for (int i=0; i<length; i++) {
            if (chars[i] == ' ') {
                numSpaces++;
            }
        }

        // Iterate backwards shifting the characters by number of spaces seen up to that point times 2.
        chars[length + 2*numSpaces] = '\0';
        for (int i=length-1; i>=0 && numSpaces>0; i--) {
            char c = chars[i];
            if (c == ' ') {
                numSpaces--;
                chars[i+2*numSpaces] = '%';
                chars[i+2*numSpaces+1] = '2';
                chars[i+2*numSpaces+2] = '0';
            } else {
                chars[i+2*numSpaces] = c;
            }
        }
    }*/
   static void  replaceSpaces(char[] str, int trueLength) {
        int spaceCount = 0, index, i = 0;
        for (i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }


        index = trueLength + spaceCount * 2;
        if (trueLength < str.length) str[trueLength] = '\0';
        for (i = trueLength - 1; i >= 0; i-- ) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }
    }

    public static void main(String args[]){
        String test ="This is  a c    l    ass";
        replaceSpaces(test.toCharArray(),24);
    }
}
