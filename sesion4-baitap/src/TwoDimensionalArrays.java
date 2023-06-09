public class TwoDimensionalArrays {
    public static void main(String[] args) {
    // Khởi tạo mảng 2 chiều
        int[][] arrD = {{1,2,3},{121,54,465},{651,41653,165}};
        // tính tổng số trong mảng 2 chiều
        int sum = 0;
        for (int i =0; arrD.length;i++){
            for (int j = 0; j < arrD.length; j++) {
                sum += arrD[i][j];
            }
        }
        System.out.println("Tổng số của mảng 2 chiều là :" + sum);
    }
}
