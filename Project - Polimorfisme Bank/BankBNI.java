public class BankBNI extends Bank {
    @Override
    public void sukuBunga() {
        System.out.println("Suku Bunga dari BNI adalah 4%");
    }
    
    @Override
    public void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        int biaya = hitungBiayaTransfer(bankTujuan);
        System.out.println("Transfer Rp " + jumlah + " ke rekening " + rekeningTujuan + " di BNI dengan biaya Rp " + biaya);
    }
}