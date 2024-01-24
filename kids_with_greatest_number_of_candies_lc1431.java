class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();;
        int currentMax = 0;
        for(int i : candies){
            currentMax = Math.max(currentMax, i);
        }
        for(int a = 0; a < candies.length; a++) {
            result.add(currentMax <= (candies[a] + extraCandies) ? true : false);
        }

        return result;
    }
}