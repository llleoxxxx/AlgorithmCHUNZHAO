```
// 初始化元素
private static final int DEFAULT_INITIAL_CAPACITY = 11;
// 实际用来保存的数组
transient Object[] queue; // non-private to simplify nested class access
// 元素个数
private int size = 0;
// 比较器(关键的特性)
private final Comparator<? super E> comparator;
// 修改次数是多少
transient int modCount = 0; // non-private to simplify nested class access
```

-其中插入元素的操作，和queue类似，一个报异常，一个返回特殊值。
从实现上看，add调用了offer


-其中删除元素的操作，和queue类似，一个报异常，一个返回特殊值。
从实现上看，remove调用了poll


-其中查询元素的操作，和queue类似，一个报异常，一个返回特殊值。
从实现上看，element调用了peek


-多了扩容的方法:grow()来实现扩容的效果，这一点区别挺大的。


-至于实现priority的方法。还没有看懂，继续在看
