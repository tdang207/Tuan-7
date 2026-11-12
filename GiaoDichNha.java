package QuanLyGiaoDich;

import java.time.LocalDate;

class GiaoDichNha extends GiaoDich {
	private String loaiNha;
	private String diaChi;
	
	public GiaoDichNha(String ma, LocalDate ngay, double donGia, double dienTich, String loaiNha,
			String diaChi) {
		super(ma, ngay, donGia, dienTich);
		this.loaiNha = loaiNha;
		this.diaChi = diaChi;
	}
	
	@Override
	public double thanhTien() {
		if (loaiNha.equalsIgnoreCase("Cao cap")) {
			return dienTich * donGia;
		}
		return dienTich * donGia * 0.9;
	}
	@Override
	public String toString() {
		
		return "[Nha]" + super.toString()
		+ " | Loai: " + loaiNha +" | DC: " + diaChi;
	}

}
