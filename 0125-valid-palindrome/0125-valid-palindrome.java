/*Step 1: Filter Alphanumeric Characters
The isPalindrome method iterates through the input string s character by character. Using Character.isLetter(ch) and Character.isDigit(ch), it ignores spaces, punctuation, and special symbols, appending only valid letters and digits into a StringBuilder.

Step 2: Case Normalization
The filtered character sequence is converted to a String via sb.toString() and transformed to lowercase using .toLowerCase(). This ensures case-insensitive comparison (e.g., 'A' and 'a' are treated as equal).

Step 3: Initialize Two Pointers
The helper method checkPalindrome sets up two pointer variables:

left set to index 0 (start of the cleaned string).

right set to index s.length() - 1 (end of the cleaned string).

Step 4: Compare Characters Toward Center
Inside the while (left < right) loop:

It compares s.charAt(left) with s.charAt(right).

If a mismatch is detected, it returns false immediately.

If they match, left increments by 1 and right decrements by 1 to check the next inner pair.

Step 5: Return Final Verdict
If the loop completes without finding any mismatched character pairs, checkPalindrome returns true. The main method isPalindrome receives this result and returns true or false. */



class Solution {
    public static boolean checkPalindrome(String s){
        int left=0;
        int right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean isPalindrome(String s) {
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if (Character.isLetter(ch) || Character.isDigit(ch)){
                sb.append(ch);
            }
        }
        String result=sb.toString();
        result=result.toLowerCase();
        if (checkPalindrome(result)){
            return true;
        }
        return false;
    }
}