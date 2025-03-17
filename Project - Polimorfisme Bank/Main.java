public class Main {
    public static void main(String[] args) {
        System.out.println("=== Informasi Bank BNI ===");
        BankBNI bni = new BankBNI();
        bni.sukuBunga();
        bni.transferUang(500000, "20230040");
        bni.transferUang(1000000, "20230040", "BNI");
        bni.transferUang(2000000, "20230040", "BNI", "Buat Revan Belanja");
        
        System.out.println("\n");
        
        System.out.println("=== Informasi Bank BCA ===");
        BankBCA bca = new BankBCA();
        bca.sukuBunga();
        bca.transferUang(50000, "30040097");
        bca.transferUang(100000, "30040097", "BCA");
        bca.transferUang(200000, "30040097", "BCA", "Buat Revan Jajan");
        
        System.out.println("\n");
        
        System.out.println("=== Informasi Bank Tidak Dikenal ===");
        Bank bankLain = new Bank();
        bankLain.transferUang(10000, "30120430");
        bankLain.transferUang(50000, "30120430", "Mandiri");
        bankLain.transferUang(100000, "30120430", "Mandiri", "Sedekah");
    }
}
