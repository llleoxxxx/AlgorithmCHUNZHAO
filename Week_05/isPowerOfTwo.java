class Solution {
  public boolean isPowerOfTwo(int n) {
    if (n == 0) return false;
    long x = (long) n;
    return (x & (x - 1)) == 0;  //// 这里清零最低位的1 ，如果是2的幂，那么只存在一个1
  }
}

