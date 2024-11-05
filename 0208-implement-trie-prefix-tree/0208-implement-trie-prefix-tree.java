class Trie {

    private Map<String, Boolean> treeMap;

    public Trie() {
        this.treeMap = new TreeMap<>();
    }
    
    public void insert(String word) {
        this.treeMap.put(word, true);
    }
    
    public boolean search(String word) {
        if(this.treeMap.get(word) == null) {
            return false;
        }
        return true;
    }
    
    public boolean startsWith(String prefix) {
        for( Map.Entry<String, Boolean> e : this.treeMap.entrySet()){
           String key = String.valueOf(e.getKey());
           if(key.startsWith(prefix)) {
                return true;
           }
       }
       return false;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */