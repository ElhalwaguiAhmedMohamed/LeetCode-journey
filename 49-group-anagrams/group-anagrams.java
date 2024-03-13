class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String w: strs){
            char[] chars = w.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            if(!map.containsKey(sortedWord)){
                map.put(sortedWord, new ArrayList<>());
            }
            map.get(sortedWord).add(w);
        }
        return new ArrayList<>(map.values());
    }
}