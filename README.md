# 剑指offer算法笔记

### 字符串

针对字符串的分离组合,可以多用 StringBuilder ,自带有append toString.

 StringBuffer 为线程安全,



### 递归

递归本质就是栈.



### 二叉树

**二叉树的前序遍历和中序遍历反推一棵树**

前序遍历特点： 节点按照 [ 根节点 | 左子树 | 右子树 ] 排序
中序遍历特点： 节点按照 [ 左子树 | 根节点 | 右子树 ] 排序

递推

1. 建立根节点root： 值为前序遍历中索引为pre_root的节点值。
   搜索根节点root在中序遍历的索引i： 为了提升搜索效率，本题解使用哈希表 dic 预存储中序遍历的值与索引的映射关系，每次搜索的时间复杂度为 O(1)O(1)。
2. 构建根节点root的左子树和右子树： 通过调用 recur() 方法开启下一层递归。
   左子树： 根节点索引为 pre_root + 1 ，中序遍历的左右边界分别为 in_left 和 i - 1。
   右子树： 根节点索引为 i - in_left + pre_root + 1（即：根节点索引 + 左子树长度 + 1），中序遍历的左右边界分别为 i + 1 和 in_right

 **“i-in_left+preroot+1”，其实就是右子树根节点=(中序根节点坐标-中序左边界）+先序根节点坐标+1，其中括号内=左子树长度,就是在先序列表中计算(左子树+根结点的位置再+1就是右子树的根结点了)** 

###  斐波那契数列 

```java
F(0) = 0,   F(1) = 1
F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
```

可以用递归的方法,但需要使用map来记录计算过的数,避免重复计算.

涉及到状态转移的最好是利用动态规划,从下到上,直接用a,b,sum来记录前三个数即可.



### 二分法

 排序数组的查找问题首先考虑使用 **二分法** 解决 

 官方的二分法的题解很多都是写的`low + (high - low) // 2 `而不是 `(high + low) // 2` ,这是因为利用减法防止high+low过大儿溢出.



### 深度优先算法

针对数组路径问题,可以使用一个 '/'来顶替当前的值,防止下一次递归中走回头路.参考剑指offer12题



### 位运算

 二进制中，最高位是符号位  1表示负数，0表示正数 

与（&）、非（~）、或（|）、

异或（^）:对所有整数取反=本身的相反数-1

 <<表示左移移 

  **>>** 表示右移

 二进制先前部位即可![技术分享图片](http://image.mamicode.com/info/201810/20181023221934737312.png) 

 **关于负数或者正数来说，移位的时候是一样的，但是在补位的时候，如果最高位是0就补0，如果最高位是1就补1** 





### 大数问题

针对数字超大的数,我们需要用String来存放.

并且针对组合问题,需要使用到全排列.



### 数组内的位置变换问题

使用双指针,可以用快慢指针和首尾双指针.就是一开始的两个指针开始的地方不一样.参考剑指offer21题







### Java注意事项

#### 优化

if(b % 2 == 1)可以改为if(b & 1) 加速

 +－一般使用2个CPU时钟
位运算 只要1个 

#### Integer 越界问题

Integer.MAX_VALUE，即2147483647

Integer.MIN_VALUE -2147483648 

对MAX_VALUE加1,会越界,变成**MIN_VALUE** !!

 Integer.MAX_VALUE + 1 = Integer.MIN_VALUE 