public class Engine {

private FuelType fuel_type; // Assuming FuelType is an enum or class that is defined elsewhere
private double curr_fuel;
private double max_fuel = 500.00; //Do I put max fuel here? 

// a constructor, which takes in initial values for the attributes named above and sets them appropriately
public Engine(FuelType fuel_type, double curr_fuel) {
    this.fuel_type = fuel_type;
    this.curr_fuel = curr_fuel;}

// Getter methods for fuelType, currFuel, and maxFuel
public FuelType get_Fuel_Type() {
    return fuel_type;
}

// a `refuel()` method which will reset the `Engine`'s current fuel level to the maximum, and which doesn't need to `return` anything
public void refuel() {
    if (this.curr_fuel < this.max_fuel) {
        this.curr_fuel = this.max_fuel; 
        System.out.println("Engine refueled to maximum fuel level of: " + max_fuel + ".");
    } else {
        System.out.println("Fuel is already at maximum capacity of: " + max_fuel + ".");
    }
}

// a `go()` which will decrease the current fuel level, print some useful information (e.g. remaining fuel level), and return `True` if the fuel level is above 0 and `False` otherwise.
public boolean go() {
    if (this.curr_fuel <= 0) {
        System.out.println("No remaining fuel");
        return false; // Use lowercase for boolean literals
    } else {
        this.curr_fuel -= 10.00; // Subtract fuel for the operation
        System.out.println("Remaining fuel: " + this.curr_fuel);
        return this.curr_fuel > 0;

    }}}