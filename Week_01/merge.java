class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        //这个循环很简单，直接用第一个数组末尾开始插入
        for (int i = 0; i < n; ++i) {
            nums1[m + i] = nums2[i];
        }

        Arrays.sort(nums1);
        //审题注意，使 nums1 成为一个有序数组 ，我没有注意到有序这个条件
        //这个排序方法不知道
    }
}

