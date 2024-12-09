class Solution {
    public String capitalizeTitle(String title) {
        StringBuilder sb = new StringBuilder();
        for (String t : title.split(" ")) {
            if (t.length() == 1 || t.length() == 2) {
                sb.append(t.toLowerCase()).append(" ");
            } else {
                t = t.toLowerCase();
                // 첫글자만 대문자로 바꿔서 추가하고 싶다.
                String toUpper = String.valueOf(t.charAt(0)).toUpperCase();
                t = t.substring(1); // 맨 첫글자 삭제
                sb.append(toUpper).append(t).append(" ");
            }
        }
        return sb.toString().trim();
    }
}