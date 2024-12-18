import java.util.ArrayList;

class Computer {
    private double processorPower;

    public Computer(double processorPower) {
        this.processorPower = processorPower;
    }

    public double getProcessorPower() {
        return processorPower;
    }

    public void setProcessorPower(double processorPower) {
        if (processorPower > 0) {
            this.processorPower = processorPower;
        } else {
            System.out.println("Мощность процессора должна быть положительной!");
        }
    }

    public void displayInfo() {
        System.out.println("Computer: Processor Power = " + processorPower + " GHz");
    }
}

class Desktop extends Computer {
    private String graphicsCard;

    public Desktop(double processorPower, String graphicsCard) {
        super(processorPower);
        this.graphicsCard = graphicsCard;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Desktop: Graphics Card = " + graphicsCard);
    }
}

class Laptop extends Computer {
    private double batteryLevel;

    public Laptop(double processorPower, double batteryLevel) {
        super(processorPower);
        this.batteryLevel = batteryLevel;
    }

    public double getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(double batteryLevel) {
        if (batteryLevel >= 0 && batteryLevel <= 100) {
            this.batteryLevel = batteryLevel;
        } else {
            System.out.println("Уровень заряда должен быть в диапазоне 0-100%!");
        }
    }

    public void chargeBattery() {
        batteryLevel = 100;
        System.out.println("Батарея полностью заряжена!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Laptop: Battery Level = " + batteryLevel + "%");
    }
}

class Tablet extends Computer {
    private double batteryLevel;

    public Tablet(double processorPower, double batteryLevel) {
        super(processorPower);
        this.batteryLevel = batteryLevel;
    }

    public double getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(double batteryLevel) {
        if (batteryLevel >= 0 && batteryLevel <= 100) {
            this.batteryLevel = batteryLevel;
        } else {
            System.out.println("Уровень заряда должен быть в диапазоне 0-100%!");
        }
    }

    public void chargeBattery() {
        batteryLevel = 100;
        System.out.println("Батарея полностью заряжена!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tablet: Battery Level = " + batteryLevel + "%");
    }
}

class Office {
    private ArrayList<Computer> computers = new ArrayList<>();

    public void addComputer(Computer computer) {
        computers.add(computer);
        System.out.println("Компьютер добавлен в офис.");
    }

    public void removeComputer(Computer computer) {
        if (computers.remove(computer)) {
            System.out.println("Компьютер удалён из офиса.");
        } else {
            System.out.println("Такой компьютер не найден.");
        }
    }

    public void displayComputers() {
        System.out.println("Список компьютеров в офисе:");
        for (Computer computer : computers) {
            computer.displayInfo();
        }
    }

    public void countComputers() {
        int desktops = 0, laptops = 0, tablets = 0;
        for (Computer computer : computers) {
            if (computer instanceof Desktop) {
                desktops++;
            } else if (computer instanceof Laptop) {
                laptops++;
            } else if (computer instanceof Tablet) {
                tablets++;
            }
        }
        System.out.println("Десктопы: " + desktops + ", Лаптопы: " + laptops + ", Планшеты: " + tablets);
    }
}
