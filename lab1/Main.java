package lab1;

public class Main {
    public static void main(String[] args) {
        // Створення власника
        Date birthDate = new Date(12, 4, 1985);
        Owner owner = new Owner("Anna", "Shevchenko", birthDate);

        // Створення тварини
        Animal animal = new Animal("Tuzik", AnimalType.DOG, owner);

        // Додавання візитів
        Visit visit1 = new Visit("Vaccination", 250.0, new Date(10, 3, 2023));
        Visit visit2 = new Visit("Check-up", 300.0, new Date(22, 8, 2024));

        animal.addVisit(visit1);
        animal.addVisit(visit2);

        // Повна інформація
        System.out.println("=== Full Info ===");
        animal.printFullInfo();

        // Скорочена інформація
        System.out.println("\n=== Short Info ===");
        animal.printShortInfo();
    }
}
