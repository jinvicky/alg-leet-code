class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.trim().split(" ");

        for (int i = arr.length - 1; i >= 0; i--) {
            if(i == arr.length - 1) {
                sb.append(arr[i]);
            } else if (!arr[i].equals("")) {
                sb.append(" ").append(arr[i]);
            }
        }

        return sb.toString();
    }
}