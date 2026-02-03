class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            for(char c : ("" + nums[i]).toCharArray()){
                list.add(c - '0');
            }
        }

        int[] ret = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            ret[i] = list.get(i);
        }
        return(ret);
    }
}
