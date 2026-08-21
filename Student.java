public class Student {

    private String maSV;
    private String hoTen;
    private double diemChuyenCan;
    private double diemGiuaKy;
    private double diemCuoiKy;

    public Student(
            String maSV,
            String hoTen,
            double diemChuyenCan,
            double diemGiuaKy,
            double diemCuoiKy) {

        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemChuyenCan = diemChuyenCan;
        this.diemGiuaKy = diemGiuaKy;
        this.diemCuoiKy = diemCuoiKy;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public double getDiemChuyenCan() {
        return diemChuyenCan;
    }

    public double getDiemGiuaKy() {
        return diemGiuaKy;
    }

    public double getDiemCuoiKy() {
        return diemCuoiKy;
    }

    public double getDiemTrungBinh() {

        return diemChuyenCan * 0.1
                + diemGiuaKy * 0.3
                + diemCuoiKy * 0.6;
    }

    public String getXepLoai() {

        double diemTB = getDiemTrungBinh();

        if (diemTB >= 8.5) {
            return "Giỏi";
        } else if (diemTB >= 7) {
            return "Khá";
        } else if (diemTB >= 5) {
            return "Trung bình";
        } else {
            return "Yếu";
        }
    }
}