
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for (int bill : bills) {
            if (bill == 5) {                    //5元的情况
                five++;
            } else if (bill == 10) {            //10元的情况
                if (five == 0) {
                    return false;
                }
                five--;
                ten++;
            } else {                            //20元的情况
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
