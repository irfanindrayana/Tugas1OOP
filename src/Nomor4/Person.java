package Nomor4;

public class Person {
    public int age;

    public Person(int age) {
        this.age = age;
    }

    public void calculateAndPrintAgeInMinutes() {
        long ageInMinutes = age * 365 * 24 * 60; // Menghitung umur dalam menit
        System.out.println("Umur dalam menit	: " + ageInMinutes);
    }

    public void calculateAndPrintAgeInMilliseconds() {
        long ageInMilliseconds = age * 365 * 24 * 60 * 60 * 1000; // Menghitung umur dalam milidetik
        System.out.println("Umur dalam milidetik	: " + ageInMilliseconds);
    }
    

	public static void main(String[] args) {
        // Uji program dengan umur 1 tahun
        Person person1 = new Person(1);
        person1.calculateAndPrintAgeInMinutes();
        person1.calculateAndPrintAgeInMilliseconds();

        // Uji program dengan umur 24 tahun
        Person person24 = new Person(24);
        person24.calculateAndPrintAgeInMinutes();
        person24.calculateAndPrintAgeInMilliseconds();

        // Uji program dengan umur 100 tahun
        Person person100 = new Person(100);
        person100.calculateAndPrintAgeInMinutes();
        person100.calculateAndPrintAgeInMilliseconds();
	}
}
    

