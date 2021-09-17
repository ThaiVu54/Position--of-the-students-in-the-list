import java.util.Scanner;

public class FindValuesInTheArray {
    public static void main(String[] args) {
        String[] students = {"ThaiVu", "Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        //! khai báo biến lưu tên tìm kiếm và gán giá trị nhập vào
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao ten hoc sinh: ");
        String inputName = sc.nextLine();

        //! duyệt mảng sinh viên đã khai báo ở trên, tìm phần tử có giá trị bằng với tên đã nhập vào
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputName)) {
                System.out.println("Vị trí của sinh viên " + inputName + " trong danh sách là vị trí thứ:" + (i+1));
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("không tìm thấy " + inputName + " trong danh sách");
        }
    }
}
