class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0;
        int ans = 0;

        for (int num : nums) {
            sum += num;

            int mod = (sum % k + k) % k; 

            if (map.containsKey(mod)) {
                ans += map.get(mod);
            }

            map.put(mod, map.getOrDefault(mod, 0) + 1);
        }

        return ans;
    }
}