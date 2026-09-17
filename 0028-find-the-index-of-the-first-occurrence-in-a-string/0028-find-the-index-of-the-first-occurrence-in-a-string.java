class Solution {
    public int strStr(String haystack, String needle) {
        int n1 = haystack.length();
        int n2 = needle.length();
        int index = -1;
        if (n2 > n1) {
            return -1;
        }

        /* for(int i=0;i<=n1-n2;i++){
            String s=haystack.substring(i,i+n2);
            if(s.equals(needle)){
                return i;
            }
        }
        return -1;
        */

        for (int i = 0; i <= n1 - n2; i++) {
            int c = 0;

            for (int j = 0; j < n2; j++) {
                char ch1 = haystack.charAt(i + j);
                char ch2 = needle.charAt(j);
                if (ch1 != ch2) {
                    break;
                }
                c++;
            }
            if (c == n2) {
                return i;
            }

        }

        return -1;
    }
}