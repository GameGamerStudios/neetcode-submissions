class Solution {
    public int countCharacters(String[] words, String chars) {
        int sum = 0;
        Map<String, Integer> amount = new HashMap<>();
        for (char c : chars.toCharArray()) {
            String s = String.valueOf(c);
            amount.put(s, amount.getOrDefault(s, 0) + 1);
        }

        for (String word : words) {
            Map<Character, Integer> wMap = new HashMap<>();
            for (char c : word.toCharArray()) {
                wMap.put(c, wMap.getOrDefault(c, 0) + 1);
            }
            boolean good = true;
            for (char c : wMap.keySet()) {
                if (wMap.get(c) > amount.getOrDefault(String.valueOf(c), 0)) {
                    good = false;
                    break;
                }
            }
            if (good) sum+=word.length();
        }

        return sum;
    }
}