public class Main {
    public static void main(String[] args) {

     Mobil Jeep= new Mobil (4, "Andi", "B1234XYZ", "Mobil");
     System.out.println("=== Informasi Kendaraan ===");
     Jeep.infoKendaraan();
     
     System.out.println("\n");
     
     Motor Harley = new Motor (true, "Budi", "D5678ABC", "Motor");
     System.out.println("=== Informasi Kendaraan ===");
     Harley.infoKendaraan();
     
     System.out.println("\n");
     
     Harley.serviceKendaraan();
     Harley.serviceKendaraan("Tune Up");
 }
}