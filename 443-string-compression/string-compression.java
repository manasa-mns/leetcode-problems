class Solution {
    public int compress(char[] ch) {
        int n = ch.length;
        if (n == 0) return 0;
        
        int count = 1;
        int index = 0;

        for (int i = 1; i < n; i++) {
            if (ch[i] == ch[i - 1]) {
                count++;
            } else {
                ch[index++] = ch[i - 1];
                if (count > 1) {
                    for (char c : Integer.toString(count).toCharArray()) {
                        ch[index++] = c;
                    }
                }
                count = 1;
            }
        }

        ch[index++] = ch[n - 1];
        if (count > 1) {
            for (char c : Integer.toString(count).toCharArray()) {
                ch[index++] = c;
            }
        }

        return index;
    }

}