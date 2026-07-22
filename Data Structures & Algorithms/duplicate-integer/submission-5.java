class Solution {
    public boolean hasDuplicate(int[] nums) {
Hashtable<Integer,Integer> hasDup = new Hashtable<>();
for(int i=0;i<nums.length;i++){
if(hasDup.containsKey(nums[i])==false){
    hasDup.put(nums[i],1);
}
else{
return true;}
    }return false;
     } 
}