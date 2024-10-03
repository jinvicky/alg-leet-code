class Solution {
    public int strStr(String haystack, String needle) {

        if(haystack.length() < needle.length()) { // 일단 needle보다 작으면 안되겠지?
            return -1;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int sliceRange = i + needle.length();
            if(haystack.substring(i, sliceRange).equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}