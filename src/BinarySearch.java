public class BinarySearch {
    public static void main(String[] args) {
//        int arr [] = new int[] {1,4,5,6,8,9, 21, 44, 56};
//        int k = 5;
//        int l = 0;
//        int r = arr.length-1;
//        while (l <= r){
//            int mid = (l + r) /2;
//            if (arr[mid] == k) System.out.println(mid);
//            if (arr[mid] > k) r = mid-1 ;
//            else l = mid+1 ;
//        }
//        System.out.println(-1);
//    }
        int[] arr = new int[] {1, 4, 5, 6, 8, 9, 21, 44, 56};
        int search = 21;
        int l = 0;
        int r = arr.length-1;
        while (l <= r){
            int mid = (l + r) / 2;
            if (arr[mid] == search){
                System.out.println(mid);
            }
            if (arr[mid] > search){
                r = mid-1;
            }
            else {
                l = mid + 1;
            }
        }
        System.out.println(-1);

    }
}
