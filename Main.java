public class Main {
    public static void main(String[] args) {
        System.out.println("=== PET SHOP DEVOPS ===");
        System.out.println();

        Pet pet1 = new Pet("Thor", "Cachorro", 4, 80.00);
        Pet pet2 = new Pet("Mia", "Gato", 2, 60.00);
        Pet pet3 = new Pet("Bob", "Coelho", 3, 50.00);

        pet1.exibirInformacoes();
        pet2.exibirInformacoes();
        pet3.exibirInformacoes();
    }
}
