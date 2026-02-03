public class Solution {
    public int[] SeparateDigits(int[] nums) {
        IList<int> list = new List<int>();
        for(int i = 0; i < nums.Length; i++){
            foreach(char c in ("" + nums[i])){
                list.Add(c - '0');
            }
        }

        int[] ret = new int[list.Count];
        for(int i = 0; i < list.Count; i++){
            ret[i] = list[i];
        }
        return(ret);
    }
}
