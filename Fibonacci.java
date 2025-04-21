public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // 生成前10个斐波那契数
        
        System.out.println("递归方法实现：");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        
        System.out.println("\n\n迭代方法实现（更高效）：");
        fibonacciIterative(n);
    }
    
    // 递归方法计算第n个斐波那契数
    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
    
    // 迭代方法生成斐波那契数列
    public static void fibonacciIterative(int n) {
        int[] fib = new int[n];
        
        // 计算斐波那契数列
        for (int i = 0; i < n; i++) {
            if (i <= 1) {
                fib[i] = i;
            } else {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
        }
        
        // 打印结果
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
        System.out.println();
    }
} 