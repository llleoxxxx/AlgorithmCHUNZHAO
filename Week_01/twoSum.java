class Solution {
    public int[] twoSum(int[] nums, int target) {
        //java数组取长度写法跟python混淆了，这里不需要写成length() 的函数形式
        int n = nums.length;

        for(int i = 0; i < n ; i++){
            for(int j = i+1; i < n ; i++){
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; //这种写法不熟悉，需要记住
                } 
            }
        }
        //这里忘了return了，报错 missing return statement
         return new int[0];
    }
}


