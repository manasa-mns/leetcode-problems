

public class Solution {
    public int countPairs(int[] deliciousness) {
        // Define the modulo as per the problem statement
        final int MOD = 1_000_000_007;
        
        // Use a HashMap to store the frequency of each deliciousness value
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        
        // Iterate over the array
        for (int num : deliciousness) {
            // Check for all powers of 2 up to the maximum possible sum (2^21 > 2 * 10^5)
            for (int power = 1; power <= (1 << 21); power <<= 1) {
                // Calculate the complement value needed to form a power of 2
                int complement = power - num;
                // Add the frequency of the complement to the count if it exists in the map
                count = (count + map.getOrDefault(complement, 0)) % MOD;
            }
            // Update the frequency of the current deliciousness value in the map
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        int[] deliciousness1 = {1, 3, 5, 7, 9};
        System.out.println(solution.countPairs(deliciousness1)); // Output: 4

        int[] deliciousness2 = {1, 1, 1, 3, 3, 3, 7};
        System.out.println(solution.countPairs(deliciousness2)); // Output: 15
    }
}