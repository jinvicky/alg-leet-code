class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap<Integer, Boolean> m1 = new HashMap<>();
        for(int n1 : nums1) {
            m1.put(n1, true);
        }

        HashMap<Integer, Boolean> m2 = new HashMap<>();
        for(int n2 : nums2) {
            m2.put(n2, true);
        }

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ansN1 = new ArrayList<>();
        List<Integer> ansN2 = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++) {
            int item = nums1[i];
            if(m2.get(item) == null && m1.get(item)) {
                ansN1.add(item);

                m1.put(item, false);
            }
        }
        ans.add(ansN1);

        for(int j = 0; j < nums2.length; j++) {
            int item = nums2[j];
            if(m1.get(item) == null && m2.get(item)) {
                ansN2.add(item);

                m2.put(item, false);
            }
        }
        ans.add(ansN2);

        return ans;
    }
}