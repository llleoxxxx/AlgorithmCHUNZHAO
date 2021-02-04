class Solution {

    //这里分治的写法太复杂了，看了好几遍自己都没写出来，还是先仔细学习一遍他的写法吧
    //第一遍力求深刻的理解

    //注意这里是private
    private int countInRange(int[] nums, int num, int lo, int hi) {
        int count = 0;
        for (int i = lo; i <= hi; i++) {
            if (nums[i] == num) {
                count++;
            }
        }
        return count;
    }

    //注意这里是private
    private int majorityElementRec(int[] nums, int lo, int hi) {
        // base case; the only element in an array of size 1 is the majority
        // element.

        //递归的终止条件
        if (lo == hi) {
            return nums[lo];
        }

        // 这一段代码理论上不存在小数的问题，都是int
        int mid = (hi - lo) / 2 + lo;

        //这一段一开始很难理解，事实上，这里他并没有return，一开始以为这里就返回了  
        int left = majorityElementRec(nums, lo, mid);
        int right = majorityElementRec(nums, mid + 1, hi);

        // if the two halves agree on the majority element, return it.
        if (left == right) {
            return left;
        }

        // otherwise, count each element and return the "winner".
        int leftCount = countInRange(nums, left, lo, hi);
        int rightCount = countInRange(nums, right, lo, hi);

        
        return leftCount > rightCount ? left : right;
    }

    //注意这里是public 
    public int majorityElement(int[] nums) {
        return majorityElementRec(nums, 0, nums.length - 1);
    }
}

