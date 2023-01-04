public class MyStackByArr {
    int[] arr;
    int mTop;
    public MyStackByArr(int size) {
        arr = new int[size];
        mTop = -1;
    }
    public void push(int val){
        arr[++mTop] = val;
    }
    public int pop(){
        return arr[mTop--];
    }
    public int pick(){
        return arr[mTop];
    }
}
