package com.happyman;

import com.google.inject.internal.cglib.proxy.$UndeclaredThrowableException;

import java.util.HashMap;
import java.util.Map;

/**
 * @author HappyMan
 * @version 0.1.0
 * @create 2021-06-01 10:10
 * @since 0.1.0
 **/
public class Recursion {
    // 假设有n个台阶,每次跨一个或者2个台阶,有多少种走法?
    // 结题思路: 1.首先找出递推公式,然后用代码实现
    //          2.根据第一步可有两种解法
    //          3.如果先跨一个台阶,有n-1个跨法
    //          4.如果先跨两个台阶,有n-2个跨法
    //          5.递推公式: f(n) = f(n-1)+f(n-2)
    //          6.终止条件(当n=0和1的时候只有一种情况)

    // 递归逻辑: 如果一个问题A分解称B C D 三个子问题,我们这样可以假设BCD已经解决,在
    // 此基础上考虑如何解决A问题
    // 注意: 1. 在编写递归代码时候,只要遇到递归我们就把他抽象成一个递推公式,不要去想里面
    // 一层层的调用关系,不要试图用脑去分解递归的每个步骤
    //      2. 注意栈溢出
    //      3. 警惕重复计算
    static int depth = 0;

    public static int f(int n) throws Exception {
        Map<Integer, Integer> map = new HashMap<>();

        // 为了避免栈溢出
        ++depth;
        if(depth > 1000) throw new Exception("递归深度已经到头了");
        // 看看计算次数
        System.out.println(depth);

        // 使用散列表避免重复计算问题
        if(map.containsKey(n)) {
            return map.get(n);
        }
        if (n == 1 ) return 1;
        if (n == 0 ) return 1;
        int ret = f(n - 1) + f(n - 2);
        map.put(n,ret);
        return ret;
    }

    public static void main(String[] args) {
        try {
            int f = f(6);
            System.out.println(f);
        }catch (Exception e) {
            e.getMessage();
        }
    }
}
