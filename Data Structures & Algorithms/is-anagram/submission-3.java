class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false; 
        }

        Map<Character, Integer> charCount = new HashMap<>();
        
        // Count characters in the first string
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!charCount.containsKey(c)) {
                return false; 
            }
            charCount.put(c, charCount.get(c) - 1);
            if (charCount.get(c) == 0) {
                charCount.remove(c);  
            }
        }

        // If the map is empty, all counts matched perfectly.
        return charCount.isEmpty();
    }
}