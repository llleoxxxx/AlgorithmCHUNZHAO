# 第一周学习笔记
### [总结:作业完成情况]
- BASIC
    - [删除排序数组中的重复项](./removeDuplicates.java)
    - [旋转数组](./rotate.java)
    - [合并两个有序链表](./mergeTwoLists.java)
    - [合并两个有序数组](./merge.java)
    - [两数之和](./twoSum.java)
    - [移动零](./moveZeroes.java)

-备注【需要再重新刷一遍】

### [第一周学习总结]
-作业一:用 add first 或 add last 这套新的 API 改写 Deque 的代码。
    -[作业1改写的代码](./deque_new.java)
    
-作业二:分析 Queue 和 Priority Queue 的源码。
    -[分析Queue的源码](./Queue源代码分析.md)
    -[分析Priority Queue的源码](./PriorityQueue源码分析.md)


### [课堂笔记总结]
-有一段 三个for循环嵌套，分别减1减2减3的，需要再重复看一遍


### [数组、链表、跳表]
    -数组 

    - 数组可以随机访问任何一个元素，访问任何一个元素，访问时间特别快

    - 数组写法
    -java,c++  : int 【a】
    -python  list = 【】
    -javascript : let x = 【】

    -泛型:高级语言对于数组元素的类型没有严格要求
    -数组底层硬件实现:内存管理器
    -当申请数组的时候，计算机在内存中开辟了一段连续的地址，每个地址可以直接通过内存管理器进行访问。
    -数组中元素访问的速度非常快:直接访问任何一个元素时间复杂度都是一样的,常数时间的复杂度 O(1)
    -数组的问题:增加和删除的时候 ,最坏情况下容易挪动整个数组，所以平均下来要移动一半的位置，此时时间复杂度就不是常数级别的了 
    -接下来是Java中Arraylist的源码分析 
    -链表(注意，不是列表)
    -linked list
    -它有 value 和 next， next指针 指向下一个元素 
    -单链表 :  head/tail  最后一个元素指向空
    -循环链表  : tail指针指向head




