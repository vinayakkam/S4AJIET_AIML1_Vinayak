class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        if (x < 0) return false;
        long reversed = 0;

        while (x != 0) {
            reversed = (reversed * 10) + (x % 10);
            x /= 10;
        }
        return reversed == original;
    }
}
