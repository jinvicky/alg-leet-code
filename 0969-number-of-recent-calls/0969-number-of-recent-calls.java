class RecentCounter {
    private Queue<Integer> list;

    public RecentCounter() {
        list = new LinkedList<>();
    }
    
    public int ping(int t) {
        list.add(t);
        int rs = t - 3000;
        int re = t;

        while(list.peek() < rs) {
            list.poll();
        }
        return list.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */