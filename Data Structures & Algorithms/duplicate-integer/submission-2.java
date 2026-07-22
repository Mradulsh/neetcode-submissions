class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> dupint = new HashSet<>();
for(int num:nums){
    if(dupint.contains(num)){
        return true;
    }
    dupint.add(num);
}
return false;
    }
}