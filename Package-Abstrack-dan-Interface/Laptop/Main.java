package Laptop;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Laptop laptop = null;
        
        System.out.println("=== Pilih Laptop yang ingin di gunakan ===");
        System.out.println("1. Lenovo");
        System.out.println("2. Mackbook");
        System.out.println("3. Toshiba");
        System.out.println("Pilihanmu (1/2/3) :");
        int pilihanLaptop = input.nextInt();
        
        switch (pilihanLaptop) {
            case 1:
                laptop = new Lenovo();
                break;
            case 2:
                laptop = new Mackbook();
                break;
            case 3:
                laptop = new Toshiba();
                break;
            default :
                System.out.println("Pilihan tidak tersedia");
                System.exit(0);
        }
        
        LaptopUser revan = new LaptopUser(laptop);
        
        int pilihan = 0;
        do{
            System.out.println("\n === Menu ===");
            System.out.println("1. Nyalakan Laptop");
            System.out.println("2. Matikan Laptop");
            System.out.println("3. Perbesar Volume");
            System.out.println("4. Perkecil Volume");
            System.out.println("5. Keluar");
            pilihan = input.nextInt();
            
            switch(pilihan){
                case 1:
                    revan.turnOnLaptop();
                    break;
                case 2:
                    revan.turnOffLaptop();
                    break;
                case 3:
                    revan.makeLaptopLouder();
                    break;
                case 4:
                    revan.makeLaptopSilence();
                    break;
                case 5:
                    System.out.println("Terima Kasih sudah menggunakan laptop");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan !=5);
        input.close();
    } 
}
