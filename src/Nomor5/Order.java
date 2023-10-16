package Nomor5;

public class Order {
	public int itemQuantity;

    public Order(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public void calculateTotal() {
        long result = (long) itemQuantity * itemQuantity; // Casting ke long untuk menghindari kehilangan data
        System.out.println("Hasil perkalian: " + result);
    }

    public static void main(String[] args) {
        // Tes program dengan nilai masukan 1-digit tipe int
        Order order1 = new Order(5);
        order1.calculateTotal();

        // Tes program dengan nilai masukan 5-digit tipe int
        Order order2 = new Order(12345);
        order2.calculateTotal();

        // Tes program dengan nilai masukan 9-digit tipe int
        Order order3 = new Order(123456789);
        order3.calculateTotal();
    }
    }


