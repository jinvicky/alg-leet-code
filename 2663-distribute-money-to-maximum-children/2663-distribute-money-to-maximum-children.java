class Solution {
    public int distMoney(int money, int children) {
        if (money < children)
            return -1;

        money -= children; // 최소 1달러씩 먼저 나눔
        int count = Math.min(money / 7, children);
        money -= count * 7;
        children -= count;

        // 예외 조건 1: 마지막 남은 아이가 4달러 받는 경우 → 금지
        if (children == 1 && money == 3)
            count--;

        // 예외 조건 2: 모든 아이가 정확히 8달러 받았는데, 돈이 더 남은 경우 → 누군가 9달러 → 실패
        if (children == 0 && money > 0)
            count--;

        return count;
    }
}
