public class Main {
    public static void main(String[] args) {
        // Initialize an Engine object with FuelType.STEAM and 100.0 units of fuel
        Engine myEngine = new Engine(FuelType.STEAM, 100.0);
        // Loop until the engine runs out of fuel
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }

        // This line is printed once the engine is out of fuel
        System.out.println("Out of fuel.");
    }
}
