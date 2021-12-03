public class lab3 {
  private static int[] origin;
  private static int length;
  private int lt;
  private int gt;

  public static void QuickSort3Way(int len) {
    length = len;
    origin = new int[]{0,7,8,1,8,9,3,8,8,8,0,7,8,1,8,9,3,8,8,8};
  }

  public void swap(int a, int b) {
    int temp = origin[a];
    origin[a] = origin[b];
    origin[b] = temp;
  }

  public int randomPivot(int start, int end){
    return (start + (int)(Math.random()*(end-start+1)));
  }

  public void partition(int pivot, int start, int end){
    swap(pivot,start);  // swapping pivot and starting element in that subarray

    int pivot_value = origin[start];
    lt = start;
    gt = end;

    int i = start;
    while(i <= gt) {

        if(origin[i] < pivot_value) {
            swap(lt, i);
            lt++;
            i++;
        }

        if(origin[i] > pivot_value) {
            swap(gt, i);
            gt--;
        }
        if(origin[i] == pivot_value)
            i++;
    }
}
public void Sort(int start, int end){
    if(start < end) {

        int pivot = randomPivot(start,end); // choose the index for pivot randomly
        partition(pivot, start, end); // about index the array is partitioned

        Sort(start, lt-1);
        Sort(gt+1, end);

    }
}

public void Sort(){
    Sort(0,length-1);
}

public void disp(){
    for(int i=0; i<length;++i){
        System.out.print(origin[i]+" ");
    }
    System.out.println();
}

public static void main(String[] args) {

}

}