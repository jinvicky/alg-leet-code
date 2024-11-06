class Solution {
   public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        // Sort products so they will be added in a sorted order to nodes 
        Arrays.sort(products);
        
        Trie<String> root = new Trie<>();
        for (String prod : products) {
            Trie<String> n = root;
            for (char ch : prod.toCharArray()) {
                int i = ch - 'a';
                if (n.next[i] == null) {
                    n.next[i] = new Trie<>();
                }
                n = n.next[i];
                if (n.words.size() < 3) {
                    n.words.add(prod);
                }
            }
        }
        
        List<List<String>> res = new ArrayList<>();
        Trie<String> n = root;
        // Start going over the search word char by char
        for (int i = 0; i < searchWord.length(); i++) {
            n = n.next[searchWord.charAt(i) - 'a'];
            // If we met null, means no more matches possible
            if (n == null) {
                for (int j = i; j < searchWord.length(); j++) {
                    res.add(Collections.emptyList()); // Use emptyList() for type safety
                }
                break;
            }
            res.add(new ArrayList<>(n.words)); // Create a new list to avoid shared references
        }
        return res;
    }

    // Trie node
    class Trie<T> {
        Trie<T>[] next;
        List<T> words;

        @SuppressWarnings("unchecked")
        Trie() {
            words = new ArrayList<>();
            next = new Trie[26];
        }
    }
}
