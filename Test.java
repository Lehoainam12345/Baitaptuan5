
package Baitaptuan5;

public class Test{
    public static void main(String[] args){
        Sach sach1 = new Sach("001","nhagiakim", "Paulo Coelho", 1988,10);
        sach1.hienThiThongTin() ;
        Sach sach2 = new Sach("002","ghichepphapy", "Lưu Hiểu Huy", 2022,10);
        sach2.hienThiThongTin() ;

=======


public class Test {
    public static void main(String[] args) {
        // Tạo đối tượng sách bằng constructor có tham số
        Sach sach1 = new Sach("B001", "Lập trình Java", "Nguyễn Văn A", 2021, 5);
        Sach sach2 = new Sach("B002", "Cấu trúc dữ liệu", "Trần Thị B", 2020, 3);

        // Hiển thị thông tin sách
        System.out.println("===== Thông tin sách =====");
        sach1.hienThiThongTin();
        sach2.hienThiThongTin();

        // Tạo đối tượng bằng constructor không tham số + setter
        Sach sach3 = new Sach();
        sach3.setMaSach("B003");
        sach3.setTieuDe("Cơ sở dữ liệu");
        sach3.setTacGia("Lê Văn C");
        sach3.setNamXuatBan(2019);
        sach3.setSoLuong(7);

        // Hiển thị sách 3
        sach3.hienThiThongTin();

    }
}
