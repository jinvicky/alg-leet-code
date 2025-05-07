class Solution {
    public String maxValue(String n, int x) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (n.charAt(0) == '-') {
            sb.append('-');

            for (i = 1; i < n.length(); i++) {
                if ((n.charAt(i) - '0') > x) {
                    break;
                }
            }

        } else {
            for (i = 0; i < n.length(); i++) {
                if ((n.charAt(i) - '0') < x) {
                    break;
                }
            }

        }
        int start = n.contains("-") ? 1 : 0;
        sb.append(n.substring(start, i));
        sb.append(x);
        sb.append(n.substring(i));

        return sb.toString();
    }
}
