package insertionSort.binary;

/**
 * 二分插入排序
 * @author lilin
 *
 */
public class BinaryInsertionSort {
    public static void main(String[] args) {
        int[] a={49,38,65,97,176,213,227,49,78,34,12,164,11,18,1};
        System.out.println("排序之前：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        
        //二分插入排序
        sort(a);
        System.out.println();
        System.out.println("排序之后：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
    
    /** 二分查找排序思想
     * <p>有6个记录，前5个已经排序的基础上，对第六个记录排序
     * 		[15, 27, 36, 53, 69]  42
     * 		low     mid     high
     * 
     * 		因为（42>36）
     *      [15, 27, 36, 53, 69]  42
     *                   low high
     *                   mid
     *      又 (42<53)
     *      [15, 27, 36, 53, 69]  42
     *              high low
     *              
     *      (high<low, 查找结束，插入位置为low或high+1
     * @param a
     */
    private static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            int low = 0;
            int high = i-1;
            int mid = 0;
            while(low<=high){
                mid = (low+high)/2;
                if(temp<a[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }
            for (int j = i-1; j >= low; j--) {
                a[j+1] = a[j];
            }
            if(low != i){
                a[low] = temp;
            }
        }
    }
}