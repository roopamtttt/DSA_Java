package Arrays_Question;

public class Sort01 {

    public static int[] sortArr(int [] arr){
        int left = 0;
        for( int Right = 0; Right < arr.length; Right++){
            if(arr[Right] == 1 && Right != left){
                int temp = arr[Right];
                arr[Right] = arr[left];
                arr[left] = temp;
                left++;
            }
            else if (arr[left] == 1) {
                left++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = {1,0,1,0,1};
        int left = 0;
        for( int Right = 0; Right < arr.length; Right++){
            if(arr[Right] == 0 && Right != left){
                int temp = arr[Right];
                arr[Right] = arr[left];
                arr[left] = temp;
                left++;
            }
            else if (arr[left] == 0) {
                left++;
            }
        }
        for(int a : arr){
            System.out.print(a + " ");
        }
    }
}
