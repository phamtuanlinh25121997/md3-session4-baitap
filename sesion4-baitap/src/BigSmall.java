public class BigSmall {
    public static void main(String[] args) {
        int[] arr ={3,546,161,316,3156,151,15,131};
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min){
                min = arr[i];
            }if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
        System.out.println("Giá trị lớn nhất trong mảng là:" + max);
    }
}
