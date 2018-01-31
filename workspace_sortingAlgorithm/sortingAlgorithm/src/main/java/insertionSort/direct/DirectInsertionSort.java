package insertionSort.direct;
/**
 * 	直接插入排序
 * @author lilin
 *
 */
public class DirectInsertionSort {

    public static void main(String[] args) {
        int[] a1={49,38,65,97,76,13,27,49,78,34,12,64,1};
        
        int[] a2={1, 12, 13, 27, 34, 38,  49, 64, 65, 76, 78, 97};
        
        int[] a={97, 78, 76, 65, 64, 49, 38, 34, 27, 13, 12, 1};
        
        System.out.println("排序之前：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        
        sort(a);
        System.out.println();
        System.out.println("排序之后：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

    /**
     * 	初始时，a[0]自成1个有序区，无序区为a[1..n-1]。
     *  令i=1
     *	将a[i]并入当前的有序区a[0…i-1]中形成a[0…i]的有序区间。
     *	i++并重复第二步直到i==n-1。排序完成。
     * 	直接插入排序
     * @param a
     */
	private static void sort(int[] a){
    	int count = 0;
        //直接插入排序
        for (int i = 1; i < a.length; i++) {
            //待插入元素
            int temp = a[i];
            int j;
            for (j = i-1; j>=0; j--) {
                //将大于temp的往后移动一位
                if(a[j]>temp){
                	count++;
                    a[j+1] = a[j];
                }else{
                	count++;
                    break;
                }
            }
            a[j+1] = temp;
        }
        System.out.println("比较次数：" + count);
    }

}