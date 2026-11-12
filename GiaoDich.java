package QuanLyGiaoDich;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

abstract class GiaoDich {
	protected String maGiaDich;
	protected LocalDate ngayGiaoDich;
	protected double donGia;
	protected double dienTich;
	
	public GiaoDich(String maGiaDich, LocalDate ngayGiaoDich, 
			double donGia, double dienTich) {
		
		this.maGiaDich = maGiaDich;
		this.ngayGiaoDich = ngayGiaoDich;
		this.donGia = donGia;
		this.dienTich = dienTich;
	}
	
	public abstract double thanhTien();

	public String getMaGiaDich() {
		return maGiaDich;
	}

	public LocalDate getNgayGiaoDich() {
		return ngayGiaoDich;
	}

@Override
public String toString() {
	return String.format( 
		"Ma: %-6% | Ngay: %s | Don gia: %,.0f | DT: %.1f | Thanh tien: %,.0f",
		maGiaDich,ngayGiaoDich.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")),
		donGia, dienTich, thanhTien());
				
	
}

}
