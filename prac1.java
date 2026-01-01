import java.util.ArrayList;
import java.util.Scanner;

// Class SinhVien
class SinhVien {
    private String id;
    private String name;
    private double gpa;

    // Constructor không tham số
    public SinhVien() {
    }

    // Constructor có tham số
    public SinhVien(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    // Nhập thông tin sinh viên
    public void input(Scanner sc) {
        System.out.print("Nhap ma SV: ");
        id = sc.nextLine();

        System.out.print("Nhap ten SV: ");
        name = sc.nextLine();

        System.out.print("Nhap GPA: ");
        gpa = Double.parseDouble(sc.nextLine());
    }

    // Xuất thông tin sinh viên
    public void output() {
        System.out.printf("%-10s %-20s %-5.2f\n", id, name, gpa);
    }

    // Getter GPA
    public double getGpa() {
        return gpa;
    }
}

// Class Main
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<SinhVien> list = new ArrayList<>();

        System.out.print("Nhap so luong sinh vien: ");
        int n = Integer.parseInt(sc.nextLine());

        // Nhập danh sách
        for (int i = 0; i < n; i++) {
            System.out.println("=== Sinh vien thu " + (i + 1) + " ===");
            SinhVien sv = new SinhVien();
            sv.input(sc);
            list.add(sv);
        }

        // In danh sách
        System.out.println("\nDANH SACH SINH VIEN");
        System.out.printf("%-10s %-20s %-5s\n", "MaSV", "Ten", "GPA");
        for (SinhVien sv : list) {
            sv.output();
        }

        // Tìm sinh viên GPA cao nhất
        SinhVien max = list.get(0);
        for (SinhVien sv : list) {
            if (sv.getGpa() > max.getGpa()) {
                max = sv;
            }
        }

        System.out.println("\nSINH VIEN CO GPA CAO NHAT:");
        max.output();
    }
}
