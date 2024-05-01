import java.util.Scanner;
class Souvenir {
    public String name;
    public double price;

    public Souvenir(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
public class SouvenirShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Souvenir[] souvenirs = {
                new Souvenir("Keychain", 70.99),
                new Souvenir("T-shirt", 120.99),
                new Souvenir("Mug", 80.49),
                new Souvenir("Hat", 90.99)
        };

        double totalCost = 0;
        while (true) {
            System.out.println("Available Souvenirs:");
            for (int i = 0; i < souvenirs.length; i++) {
                System.out.println((i + 1) + ". " + souvenirs[i].getName() + " - $" + souvenirs[i].getPrice());
            }
            System.out.println("Enter the number of the souvenir you want to buy, or 0 to exit:");
            int choice = scanner.nextInt();


            if (choice == 0) {
                break;
            }
            if (choice < 0 || choice > souvenirs.length) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }
            totalCost += souvenirs[choice - 1].getPrice();
            System.out.println("Added " + souvenirs[choice - 1].getName() + " to your cart.");
        }
        System.out.println("Total cost: $" + totalCost);

        scanner.close();
    }
}
