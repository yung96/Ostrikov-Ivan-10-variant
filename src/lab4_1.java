public class lab4_1 {
    public static void main(String[] args) {
        Desktop desktop = new Desktop(3.5, "NVIDIA RTX 3080");
        Laptop laptop = new Laptop(2.8, 50);
        Tablet tablet = new Tablet(1.5, 80);

        Office office = new Office();
        office.addComputer(desktop);
        office.addComputer(laptop);
        office.addComputer(tablet);

        office.displayComputers();
        office.countComputers();

        laptop.chargeBattery();
        tablet.setBatteryLevel(60);
        desktop.setGraphicsCard("AMD Radeon RX 6800");

        office.displayComputers();
    }
}
