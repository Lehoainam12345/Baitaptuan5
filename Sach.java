
public class Sach {
    // Các thuộc tính (đóng gói: private)
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;

    // Constructor không tham số
    public Sach() {
    }

    // Constructor đầy đủ tham số
    public Sach(String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
    }

    // Getter và Setter (đóng gói dữ liệu)
    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        if (namXuatBan > 0) {
            this.namXuatBan = namXuatBan;
        } else {
            System.out.println("⚠ Năm xuất bản không hợp lệ!");
        }
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        if (soLuong >= 0) {
            this.soLuong = soLuong;
        } else {
            System.out.println("⚠ Số lượng không thể âm!");
        }
    }

    // Phương thức hiển thị thông tin sách
    public void hienThiThongTin() {
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tiêu đề: " + tieuDe);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.println("Số lượng: " + soLuong);
        System.out.println("---------------------------");
    }
}


public class Sach {
    protected String maSach;
    protected String tieuDe;
    protected String tacGia;
    protected int namXuatBan;
    protected int soLuong;
    public Sach (String maSach, String tieuDe, String tacGia, int namXuatBan, int soLuong){
        this.maSach=maSach;
        this.tieuDe=tieuDe;
        this.tacGia=tacGia;
        this.namXuatBan=namXuatBan;
        this.soLuong=soLuong;
    }
    public Sach (String maSach, String tieuDe, String tacGia, int namXuatBan){
        this.maSach=maSach;
        this.tieuDe=tieuDe;
        this.tacGia=tacGia;
        this.namXuatBan=namXuatBan;
    }
    public Sach (String maSach, String tieuDe, String tacGia){
        this.maSach=maSach;
        this.tieuDe=tieuDe;
        this.tacGia=tacGia;
    }
    public Sach (String maSach, String tieuDe ){
        this.maSach=maSach;
        this.tieuDe=tieuDe;
    }
    public String getmasach(){
        return maSach;
    }
    public String gettieude(){
        return tieuDe;
    }
    public String gettacgia(){
        return tacGia;
    }
    public int getnamxuatban(){
        return namXuatBan;
    }
    public int getsoluong(){
        return soLuong;
    }
    public void setmasach(String maSach){
        this.maSach=maSach;
    }
    public void settieude(String tieuDe){
        this.tieuDe=tieuDe;
    }
    public void settacgia(String tacGia){
        this.tacGia=tacGia;
    }
    public void setnamxuatban(int namXuatBan){
        this.namXuatBan=namXuatBan;
    }
    public void setsoLuong (int soLuong){
        this.soLuong=soLuong;
    }

    public void hienThiThongTin() {
        System.out.println("maSach: "+maSach+" tieuDe: "+tieuDe+" tacGia: "+tacGia+" namXuatBan: "+namXuatBan);
    }

    

}
