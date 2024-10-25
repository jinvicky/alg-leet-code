
class Solution {
	public int toNumber(Character ch) {
		return ch - 48;
	}
    public String decodeString(String s) {
    	Stack<Integer> st = new Stack<>();
Stack<StringBuilder> st1 = new Stack<>();
StringBuilder sb = new StringBuilder();
int n = 0;

for(int i = 0; i < s.length(); i++) {
	char c = s.charAt(i);
	if(Character.isDigit(c)) {
		n = n * 10 + (c-'0');
	} else if(c == '[') {
		st.push(n);
		n = 0;
		st1.push(sb);
		sb = new StringBuilder();
	} else if (c == ']') {
		int k = st.pop();
		StringBuilder temp = sb;
		sb = st1.pop();

		while(k-- > 0) {
			sb.append(temp);
		}
	} else {
		sb.append(c);
	}

    }
	return sb.toString();
}
}
