class Solution {
    public int calPoints(String[] operations) {
        List<Integer> record = new ArrayList<>();

        for(int i = 0; i < operations.length; i++) {
            String item = operations[i];

            if("+".equals(item)) {
                record.add(record.get(record.size()-2) + record.get(record.size()-1));
            } else if ("D".equals(item)) {
                record.add(2 * record.get(record.size()-1));
            } else if ("C".equals(item)) {
                record.remove(record.size()-1);
            } else { // 숫자 
                int num = Integer.parseInt(item);
                record.add(num);
            }
        }

        int total = 0;
        for(int n : record) {
            total += n;
        }
        return total;
    }
}