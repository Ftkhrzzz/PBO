public class Mobil extends Kendaraan{
    int JumlahPintu;

   public Mobil(int JumlahPintu, String NamaPemilik, String NomorPlat, String JenisKendaraan) {
       super(NamaPemilik, NomorPlat, JenisKendaraan);
       this.JumlahPintu = JumlahPintu;
   }

   public int getJumlahPintu() {
       return JumlahPintu;
   }

   public void setJumlahPintu(int JumlahPintu) {
       this.JumlahPintu = JumlahPintu;
   }
   
   @Override
   public void infoKendaraan(){
       super.infoKendaraan();
       System.out.println("Jumlah Pintu Mobil: " + getJumlahPintu() );
   }
}