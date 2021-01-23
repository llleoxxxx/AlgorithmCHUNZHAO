class Solution {
    public void moveZeroes(int[] nums) {
        if(nums==null) {
                return;
            }

        int j = 0;

        for(int i = 0 ; i < nums.length ; i++ ){
            if(nums[i] != 0){
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j++] = tmp;//这里 我一开始困惑的地方在于这里是先 
                                //实际上这里后++的意思是先使用再自加
                                //听说这里类似快速排序，之后再研究
            }
        }
    }
}
	


