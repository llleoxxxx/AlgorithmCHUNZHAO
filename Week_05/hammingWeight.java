public int hammingWeight(int n) {
    int sum = 0;
    while (n != 0) {
        sum++;
        n &= (n - 1); // 这里清零最低位的1 ，具体原理可以看图解
    }
    return sum;
}
