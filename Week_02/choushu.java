class Solution {
    private int[] uglyNumber = {2,3,5};
    public int nthUglyNumber(int n) {
        //创建小根堆，每次出堆的都是最小值
        //这里为什么用long还不太懂 
        //PriorityQueue默认是一个小顶堆
        Queue<Long> queue = new PriorityQueue<>();
        queue.add(1L);
        //记录出堆的个数，出堆的元素完全按照从小到大排序
        int count = 0;
        while (! queue.isEmpty()){

            //poll 返回并切移除头部(就是最小的在这里)
            long cut = queue.poll();

            //如果出堆的个数>=n,当前cut就是第n个丑数
            //前加加就是先加后调用，后加加就是先用后加。
            if(++count >= n){
                return (int) cut;
            }
            for(int num : uglyNumber){
                //排除重复的数字
                if(! queue.contains(num * cut)){
                    //这里默认会排序
                    queue.add(num * cut);
                }
            }
        }
        return -1;
    }
}
