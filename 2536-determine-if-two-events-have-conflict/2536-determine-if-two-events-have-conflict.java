class Solution {
    // public boolean haveConflict(String[] event1, String[] event2) {
    //     String s1 = event1[0];
    //     String e1 = event1[1];

    //     String s2 = event2[0];
    //     String e2 = event2[0];

    //     // s2랑 e1이 겹치면 t다. s2 < e1 
    //     if(s2.compareTo(e1) <= 0) {
    //         return true;
    //     }

    //     return false;
    // }

    public boolean haveConflict(String[] event1, String[] event2) {
    String s1 = event1[0], e1 = event1[1];
    String s2 = event2[0], e2 = event2[1];
    return s1.compareTo(e2) <= 0 && s2.compareTo(e1) <= 0;
}

}