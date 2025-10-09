
package Baitaptuan5;
=======
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
