class Solution {

    public void rotate(int nums[], int k) {

            int length = nums.length;
            int newarr[] = new int[length]; //这里定义数组，注意写法
            
            //为什么不直接拷贝数组呢？可能原因:直接拷贝数组仅仅是把指针指向它
            for(int i = 0; i < length ; i++){
                newarr[i] = nums[i];
            }
            
            //用mod来实现这个旋转的效果
            for(int i = 0; i < length ; i++){
                nums[(i + k) % length] = newarr[i];
            }

    }
}
        
 
