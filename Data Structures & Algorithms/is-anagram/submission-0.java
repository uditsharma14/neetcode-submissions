class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;  // If lengths differ, they're not anagrams.
        }

        Map<Character, Integer> charCount = new HashMap<>();
        
        // Count characters in the first string
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Subtract counts using the second string
        for (char c : t.toCharArray()) {
            if (!charCount.containsKey(c)) {
                return false;  // If a character in t isn’t in s, they aren’t anagrams.
            }
            charCount.put(c, charCount.get(c) - 1);
            if (charCount.get(c) == 0) {
                charCount.remove(c);  // Remove the character if its count hits zero.
            }
        }

        // If the map is empty, all counts matched perfectly.
        return charCount.isEmpty();
    }
}