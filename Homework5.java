class PersonalComputer {
    private String computer = "Computer";
    private String monitor = "Monitor";

    class Monitor {
        private String monitorSize = "32 inch";
        private String color = "Black";
        private String power = "45W";

        void turnOn() {
            System.out.printf("Turning on the %s \n",monitor);
        }

        void printInfo() {
            System.out.printf("The spec of the %s \n", monitor);
            System.out.printf("Size: %s \n", monitorSize);
            System.out.printf("Color: %s \n", color);
            System.out.printf("Power: %s \n", power);
        }
    }
    class Computer {
        private String cpu = "Core i7";
        private String memory = "32GB";
        private String hd = "2TB";
        private String color = "White";
        private String power = "700W";

        void turnOn() {
            System.out.printf("Turning on the %s \n", computer);
        }
        void printInfo() {
            System.out.printf("The spec of the %s \n", computer);
            System.out.printf("CPU: %s \n", cpu);
            System.out.printf("Memory: %s \n", memory);
            System.out.printf("HDD: %s \n", hd);
            System.out.printf("Color: %s \n", color);
            System.out.printf("Power: %s \n", power);
        }
    }
}

class Homework5 {
    public static void main(String[] args) {
        PersonalComputer personalComputer = new PersonalComputer();
        PersonalComputer.Computer Computer = personalComputer.new Computer();
        PersonalComputer.Monitor Monitor = personalComputer.new Monitor();
        Computer.turnOn();
        Monitor.turnOn();
        Computer.printInfo();
        Monitor.printInfo();
    }
}