class TimeMap {
    Map<String, TreeMap<Integer, String>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        TreeMap<Integer, String> values = map.getOrDefault(key, new TreeMap<>());
        values.put(timestamp, value);
        map.put(key, values);
    }
    
    public String get(String key, int timestamp) {
       TreeMap<Integer, String> values = map.get(key);
       if(values == null || values.size()==0) return "";
       Integer lastKey = values.floorKey(timestamp);
       return lastKey == null ? "" : values.get(lastKey); 
    }
}

/**
class TimeMap {
    Map<String, List<Pair>> map;
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        List<Pair> list = map.getOrDefault(key, new ArrayList<>());
        list.add(new Pair(value, timestamp));
        map.put(key, list);
    }
    
    public String get(String key, int timestamp) {
       List<Pair> list = map.get(key);
       if(list == null) return "";
       return search(list, timestamp); 
    }

    String search(List<Pair> list, int time){
            int low =0;
            int high = list.size()-1;
            int ans = -1;
            while(low<=high){
                int mid = low+(high-low)/2;
                Pair p = list.get(mid);
                if(p.time== time) return p.value;
                else if(p.time > time){
                    high = mid-1;
                }else{
                   ans = mid;
                   low = mid+1; 
                }
            }
            return ans ==-1 ? "" : list.get(ans).value;
    }
}
class Pair implements Comparable<Pair>{
    String value;
    int time;
    Pair(String value, int time){
        this.value = value;
        this.time = time;
    }
    public int compareTo(Pair p){
        return this.time-p.time;
    }
}
**/
/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */