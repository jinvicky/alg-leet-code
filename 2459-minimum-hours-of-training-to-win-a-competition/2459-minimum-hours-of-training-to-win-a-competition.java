class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience, int[] energy, int[] experience) {
        
        int egSum = 0;
        for(int e : energy) {
           egSum += e;
        }
        int egNeed = initialEnergy > egSum ? 0 : Math.abs(initialEnergy - egSum) + 1;

        System.out.println("ans1 " +egNeed); // ok인듯

        int expNeed = 0;

        for(int exp : experience) {
            if(initialExperience <= exp) {
                // 같거나 작다면? 

                System.out.println(exp);
                expNeed += exp - initialExperience + 1;
                initialExperience += exp - initialExperience + 1;
            }
            initialExperience += exp;
        }

        System.out.println("ans2 "+expNeed);

        return egNeed + expNeed;
    }
}