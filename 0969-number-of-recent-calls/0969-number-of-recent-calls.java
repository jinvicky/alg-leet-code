class RecentCounter {
    private Queue<Integer> list;

    public RecentCounter() {
        list = new LinkedList<>();
    }
    
    public int ping(int t) {
        list.add(t);
        int cnt = 0;

        int rs = t - 3000;
        int re = t;

        int flag = list.size();

        while(flag > 0) {
            int item = list.poll();
            if(rs <= item && item <= re) {
                cnt++;
            }
            if(rs <= item) {
                list.add(item); // poll한 값을 다시 넣는다. 다만 rs 보다 작으면 안 넣어
            }
            flag--; // 루프 감소
        }
        return cnt;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */