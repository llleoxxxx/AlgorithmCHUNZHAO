
```
public interface Queue<E> extends Collection<E> {
    boolean add(E e);
    boolean offer(E e);
    E remove();
    E poll();
    E element();
    E peek();
}
```

 整体来说 Queue的比较简单，同为插入，add抛出异常，offer却返回特殊值。同理remove,pull是做删除操作，element和peek做获取元素的操作。
 注意的是，插入在队尾插入，删除在头部删除。
