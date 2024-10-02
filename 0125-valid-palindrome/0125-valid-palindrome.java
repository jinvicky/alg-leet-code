class Solution {
    public boolean isPalindrome(String s) {
        // String에서 특수문자랑 공백을 제거한다.
    s = s.replace("`", "")
            .replace(";", "")
            .replace("?", "")
            .replace("!", "")
            .replace(".", "")
            .replace(",", "")
            .replace(":", "")
            .replace("@", "")
            .replace("#", "")
            .replace("_", "")
            .replace("{", "")
            .replace("}", "")
            .replace("[", "")
            .replace("]", "")
            .replace("'", "")
            .replace("\"", "")
            .replace("(", "")
            .replace(")", "")
            .replace("-", "")
            .replace("+", "")
            .replace("&", "")
            .replace("*", "")
            .replace("/", "")
            .replace("\\", "");

        // " "의 경우는 그냥 true를 리턴한다. length가 1인데 " " 내용일 때 
        if(s.length() == 1 && s.equals(" ")) {
            return true;
        }

        s = s.replace(" ", "");
        int left = 0;
        int right = s.length() - 1;

        while (left <= right) {
            System.out.println("left and right: " + left + " : " + right);
            char leftVal = Character.toLowerCase(s.charAt(left));
            char rightVal = Character.toLowerCase(s.charAt(right));

            // 대소문자 구분 없이 비교하려면 toLowerCase()를 사용할 수 있습니다.
            if (leftVal != rightVal) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
