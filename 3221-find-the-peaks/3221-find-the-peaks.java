class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        if(mountain.length < 3) {
            return new ArrayList<>();
        }

        // first, last를 제외한 범위
        int s = 1;
        int e = mountain.length - 2;
        List<Integer> indices = new ArrayList<>();

        for(int i = s; i <= e; i++) {
            System.out.println("mountain = " + mountain[i]);
            if(mountain[i] > mountain[i-1] && mountain[i]> mountain[i+1]) {
                indices.add(i);
            }
        }
        return indices;
    }
}