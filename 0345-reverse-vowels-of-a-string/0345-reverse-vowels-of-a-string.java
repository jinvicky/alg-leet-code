class Solution {
    private boolean isVowel(char alpha) {
       char lowerAlpha = Character.toLowerCase(alpha);

       if(lowerAlpha == 'a'
       || lowerAlpha == 'e'
       || lowerAlpha == 'i'
       || lowerAlpha == 'o'
       || lowerAlpha == 'u'
       ) return true;

       return false;
    }

    public String reverseVowels(String s) {
        char[] alphabets = s.toCharArray();
        Queue<Integer> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < alphabets.length; i++) {
            char alpha = alphabets[i];

            if(isVowel(alpha)) {
                queue.add(i);
                stack.push(alpha);
            }
        }
        
    
        while(!stack.isEmpty()) {
            int index = queue.poll();
            char alpha = stack.pop();

            alphabets[index] = alpha;
        }

        StringBuilder sb = new StringBuilder();
        for(int j = 0; j < alphabets.length; j++) {
            sb.append(alphabets[j]);
        }
        return sb.toString();
    }
}