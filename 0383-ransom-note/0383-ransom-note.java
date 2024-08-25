class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        boolean available = true;
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        for (char c : magazine.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for(int i = 0; i < ransomNote.length(); i++) {

            if(charCountMap.get(ransomNote.charAt(i)) == null) {
                available = false;
                break;
            }
            
            Integer cnt = charCountMap.get(ransomNote.charAt(i));

            if(cnt == 0) {
                available = false;
                break;
            } else {
                charCountMap.put(ransomNote.charAt(i), --cnt);
            }
        }
        return available;
    }
}