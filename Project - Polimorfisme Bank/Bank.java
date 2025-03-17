public class Bank {
    public void transferUang(int jumlah, String rekeningTujuan) {
        System.out.println("Transfer Rp " + jumlah + " ke rekening " + rekeningTujuan);
    }
    
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        int biaya = hitungBiayaTransfer(bankTujuan);
        System.out.println("Transfer Rp " + jumlah + " ke rekening " + rekeningTujuan + " di " + bankTujuan + " dengan biaya Rp " + biaya);
    }
    
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan, String berita) {
        int biaya = hitungBiayaTransfer(bankTujuan);
        System.out.println("Transfer Rp " + jumlah + " ke rekening " + rekeningTujuan + " di " + bankTujuan + " dengan berita: " + berita + " dan biaya Rp " + biaya);
    }
    
    public void sukuBunga() {
        System.out.println("Suku Bunga standar adalah 3%");
    }
    
    public int hitungBiayaTransfer(String bankTujuan) {
        if (bankTujuan.equalsIgnoreCase("BNI")) {
            return 6500;
        } else if (bankTujuan.equalsIgnoreCase("BCA")) {
            return 7500;
        } else {
            return 10000; // Biaya transfer default jika bank tidak dikenal
        }
    }
}
