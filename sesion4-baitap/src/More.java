import java.util.Arrays;

public class More {
    public static void main(String[] args) {
        // Khai báo mảng
        int[] arr = {2, 3, 5, 6, 5, 6, 6, 5};
        // Tạo kích thước lớn hơn mảng ban đầu
        int[] arrUpdate = new int[arr.length +1];
        // Sao chép các phần tử của mảng ban đầu sang mảng mới
        for (int i = 0; i < arr.length; i++) {
            arrUpdate[i] = arr[i];
        }
        // Thêm phần tử vào cuối mảng
        arrUpdate[arrUpdate.length-1] =9;
        System.out.println("Mảng mới sẽ là: " + Arrays.toString(arrUpdate));
    }
}
