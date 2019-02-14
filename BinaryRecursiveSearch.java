public class BinaryRecursiveSearch implements Practice03Search {
    public String searchName(){
        return("Binary recursive search");
    }
    public int search(int[] arr, int target) {
        return search(arr, target, 0, arr.length-1);
    }

    public int search(int[] arr, int target, int start, int end){
        int mid=(start+end)/2;
        if(start>end) {
            return -1;
        }
        if(arr[mid]==target) {
            return mid;
        }
        else if(arr[mid]<target) {
            return search(arr, target, mid + 1, end);
        }
        else {
            return search(arr, target, mid - 1, start);
        }
    }
}
