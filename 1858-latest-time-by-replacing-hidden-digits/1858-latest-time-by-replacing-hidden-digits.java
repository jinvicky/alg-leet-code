class Solution {
    public String maximumTime(String time) {
        StringBuilder sb = new StringBuilder(time);
        String hh = time.split(":")[0];
        String mm = time.split(":")[1];

        // 둘다 비었거나 둘째만 빈 경우  -> 첫째 기준으로 간다.
        // 첫째만 빈 경우 -> 둘째 기준으로 간다.
        for (int i = 0; i < hh.length(); i++) {

            if (hh.indexOf("?") == -1) { //?가 없으면 안함
                break;
            }

            if(hh.charAt(i) != '?') {
                continue;
            }

            if(i==0) { // ?
                // 내다음이 5 이상이면 나는 1이고 그게 아니면 나는 2다. 
                boolean nextEmpty = hh.charAt(i+1) == '?';

                if(nextEmpty || hh.charAt(i+1) < '4') {
                    sb.setCharAt(i,'2');
                }else sb.setCharAt(i, '1');
                
            } else { // ?인데

                char prevSb = sb.charAt(0);

                if(prevSb >= '2') sb.setCharAt(i, '3');
                else sb.setCharAt(i, '9');
            }
        }

        for (int i = 0; i < mm.length(); i++) {
            char mc = mm.charAt(i);

            if (mc == '?') {
                if (i == 0) {
                    sb.setCharAt(3, '5');
                    // 최대는 5다.
                } else {
                    sb.setCharAt(4, '9');
                    // 최대는 9이다. 
                }
            }
        }

        return sb.toString();
    }
}