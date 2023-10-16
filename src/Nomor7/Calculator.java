package Nomor7;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Kalkulator Sederhana:");
            System.out.print(
            		" 1: + (Penjumlahan),\n"
            		+" 2: - (Pengurangan),\n"
            		+" 3: * (Perkalian),\n"
            		+" 4: / (Pembagian),\n"
            		+" 5: % (Modulus),\n"
            		+" 6: Konversi,\n"
            		+" 7: Keluar.\n"
            		+"Pilih operasi: ");
            int choice = scanner.nextInt();

            if (choice == 7) {
                System.out.println("Terima kasih!");
                break;
            }
            

            switch (choice) {
                case 1: // Penjumlahan
                    System.out.println("Masukkan angka pertama:");
                    double num1 = scanner.nextDouble();
                    System.out.println("Masukkan angka kedua:");
                    double num2 = scanner.nextDouble();
                    double sum = num1 + num2;
                    System.out.println("Hasil penjumlahan: " + sum);
                    break;
                case 2: // Pengurangan
                    System.out.println("Masukkan angka pertama:");
                    num1 = scanner.nextDouble();
                    System.out.println("Masukkan angka kedua:");
                    num2 = scanner.nextDouble();
                    double difference = num1 - num2;
                    System.out.println("Hasil pengurangan: " + difference);
                    break;
                case 3: // Perkalian
                    System.out.println("Masukkan angka pertama:");
                    num1 = scanner.nextDouble();
                    System.out.println("Masukkan angka kedua:");
                    num2 = scanner.nextDouble();
                    double product = num1 * num2;
                    System.out.println("Hasil perkalian: " + product);
                    break;
                case 4: // Pembagian
                    System.out.println("Masukkan angka pertama:");
                    num1 = scanner.nextDouble();
                    System.out.println("Masukkan angka kedua:");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        double quotient = num1 / num2;
                        System.out.println("Hasil pembagian: " + quotient);
                    } else {
                        System.out.println("Tidak dapat membagi oleh nol.");
                    }
                    break;
                case 5: // Modulus
                    System.out.println("Masukkan angka pertama:");
                    num1 = scanner.nextDouble();
                    System.out.println("Masukkan angka kedua:");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        double remainder = num1 % num2;
                        System.out.println("Hasil modulus: " + remainder);
                    } else {
                        System.out.println("Tidak dapat menghitung modulus oleh nol.");
                    }
                    break;
                case 6: // Konversi bilangan
                    System.out.println("Pilih tipe konversi (1: Desimal ke Biner, 2: Desimal ke Oktal, 3: Desimal ke Heksadesimal, 4: Konversi sebaliknya):");
                    int conversionChoice = scanner.nextInt();
                    System.out.println("Masukkan nilai:");
                    int decimalValue = scanner.nextInt();
                    String result = "";
                    switch (conversionChoice) {
                        case 1: // Desimal ke Biner
                            result = Integer.toBinaryString(decimalValue);
                            break;
                        case 2: // Desimal ke Oktal
                            result = Integer.toOctalString(decimalValue);
                            break;
                        case 3: // Desimal ke Heksadesimal
                            result = Integer.toHexString(decimalValue);
                            break;
                        case 4: // Konversi sebaliknya
                            System.out.println("Pilih tipe konversi (1: Biner ke Desimal, 2: Oktal ke Desimal, 3: Heksadesimal ke Desimal):");
                            int reverseChoice = scanner.nextInt();
                            System.out.println("Masukkan nilai:");
                            String binaryValue = scanner.next();
                            switch (reverseChoice) {
                                case 1: // Biner ke Desimal
                                    result = String.valueOf(Integer.parseInt(binaryValue, 2));
                                    break;
                                case 2: // Oktal ke Desimal
                                    result = String.valueOf(Integer.parseInt(binaryValue, 8));
                                    break;
                                case 3: // Heksadesimal ke Desimal
                                    result = String.valueOf(Integer.parseInt(binaryValue, 16));
                                    break;
                                default:
                                    System.out.println("Pilihan konversi tidak valid.");
                            }
                            break;
                        default:
                            System.out.println("Pilihan konversi tidak valid.");
                    }
                    System.out.println("Hasil konversi: " + result);
                    break;
                default:
                    System.out.println("Pilihan operasi tidak valid.");
            }
            
        }
        
        scanner.close();
        
    }
}
