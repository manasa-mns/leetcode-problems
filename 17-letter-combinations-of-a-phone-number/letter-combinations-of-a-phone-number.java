import java.util.*;

class Solution {
    private static final String[] digitToLetters = {
        "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return new ArrayList<>();
        }

        List<String> ans = new ArrayList<>();
        backtrack(digits, 0, new StringBuilder(), ans);
        return ans;
    }

    private void backtrack(String digits, int i, StringBuilder sb, List<String> ans) {
        if (i == digits.length()) {
            ans.add(sb.toString());
            return;
        }

        for (char c : digitToLetters[digits.charAt(i) - '0'].toCharArray()) {
            sb.append(c);
            backtrack(digits, i + 1, sb, ans);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
