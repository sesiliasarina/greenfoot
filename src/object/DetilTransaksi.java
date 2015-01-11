package object;

public class DetilTransaksi {
	private Barang barang;
	private int quantity;
	private Transaksi transaksi;

	public DetilTransaksi(Transaksi transaksi, Barang barang, int quantity) {
		this.transaksi = transaksi;
		this.barang = barang;
		this.quantity = quantity;
	}

	public DetilTransaksi(Barang barang, int quantity) {
		this.barang = barang;
		this.quantity = quantity;
	}

	public Barang getBarang() {
		return barang;
	}

	public int getQuantity() {
		return quantity;
	}

	public Transaksi getTransaksi() {
		return transaksi;
	}

}
