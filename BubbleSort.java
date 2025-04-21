public class BubbleSort {
    // 冒泡排序方法
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // 每次循环将最大的元素"冒泡"到末尾
            for (int j = 0; j < n - i - 1; j++) {
                // 如果当前元素大于下一个元素，则交换它们
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // 打印数组的方法
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 主方法，用于测试冒泡排序
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.println("排序前的数组：");
        printArray(arr);
        
        bubbleSort(arr);
        
        System.out.println("排序后的数组：");
        printArray(arr);
    }
     
    
} 