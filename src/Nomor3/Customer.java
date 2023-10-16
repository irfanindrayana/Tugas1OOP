package Nomor3;

public class Customer {
    private int customerID;
    private char customerStatus;
    private int pembelianSetahun;

    public Customer() {
        customerID = 1202220316;
        customerStatus = 'N'; 
        customerStatus = 'O';
        pembelianSetahun = 99999000;
    }

    public void displayCustomerInfo() {
        System.out.println("Pembelian = " + pembelianSetahun);
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.displayCustomerInfo();
    }
}
