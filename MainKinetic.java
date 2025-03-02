
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MDK
 */
public class MainKinetic {
// Property massa dan kecepatan
    private double massa;
    private double kecepatan;

    // Getter untuk massa
    public double getMassa() {
        return massa;
    }

    // Setter untuk massa
    public void setMassa(double massa) {
        this.massa = massa;
    }

    // Getter untuk kecepatan
    public double getKecepatan() {
        return kecepatan;
    }

    // Setter untuk kecepatan
    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    // Method untuk menghitung energi kinetik
    public double hitungEnergiKinetik() {
        return 0.5 * massa * kecepatan * kecepatan;
    }

    public static void main(String[] args) {
        // Membuat objek scanner untuk input dari keyboard
        Scanner scanner = new Scanner(System.in);

        // Membuat objek MainKinetic
        MainKinetic kinetic = new MainKinetic();

        // Input massa
        System.out.print("Masukkan massa sepeda (kg): ");
        double massa = scanner.nextDouble();
        kinetic.setMassa(massa);

        // Input kecepatan
        System.out.print("Masukkan kecepatan sepeda (m/s): ");
        double kecepatan = scanner.nextDouble();
        kinetic.setKecepatan(kecepatan);

        // Menghitung energi kinetik
        double energiKinetik = kinetic.hitungEnergiKinetik();
        
        // Menampilkan hasil perhitungan energi kinetik
        System.out.println("Energi Kinetik sepeda Andika adalah: " + energiKinetik + " Joule");

        // Menutup scanner
        scanner.close();
    }
}
    
   