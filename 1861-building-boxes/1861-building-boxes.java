class Solution {

    static final double ONE_THIRD = 1.0d / 3.0d;

    public int minimumBoxes(int n) {
        int k = findLargestTetrahedralNotGreaterThen(n);
        int used = tetraheral(k);
        int floor = triangular(k);
        int unused = (n-used);
        if (unused == 0) return floor;

        int r = findSmallestTriangularNotLessThen(unused);
        return (floor + r);
    }

    private final int findLargestTetrahedralNotGreaterThen(int te) {
        int a = (int) Math.ceil(Math.pow(product(6, te), ONE_THIRD));
        while(tetraheral(a) > te) {
            a--;
        }
        return a;
    }

    private final int findSmallestTriangularNotLessThen(int t) {
        int a = -1 + (int) Math.floor(Math.sqrt(product(t, 2)));
        while(triangular(a) < t) {
            a++;
        }
        return a;
    }

    private final int tetraheral(int a) {
        return (int) ratio(product(a, a+1, a+2), 6);
    }

    private final int triangular(int a) {
        return (int) ratio(product(a, a+1), 2);
    }

    private final long product(long... vals) {
        long product = 1L;
        for(long val : vals) {
            product *= val;
        }
        return product;
    }

    private final long ratio(long a, long b) {
        return (a / b);
    }

 }