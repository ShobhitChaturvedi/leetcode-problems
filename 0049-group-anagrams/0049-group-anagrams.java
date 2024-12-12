import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        for (String word : strs) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = new String(charArray);
            anagramMap.computeIfAbsent(sortedWord, k -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(anagramMap.values());
    }
}