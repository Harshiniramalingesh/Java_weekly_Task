package compositionoverinheritance;
class Ram1 {
    private int capacity1; // in GB

    public Ram1(int capacity1) {
        this.capacity1 = capacity1;
    }

    public int getCapacity1() {
        return capacity1;
    }

    public void showRam1() {
        System.out.println("RAM: " + capacity1 + "GB");
    }
}
class Computer1 {

    private Ram1 ram1;

    public Computer1(Ram1 ram1) {
        this.ram1 = ram1;
    }

    public void showSpecs1() {
        ram1.showRam1();
    }


    public void upgradeRam1(Ram1 newRam1) {

        if (newRam1.getCapacity1() > this.ram1.getCapacity1()) {
            this.ram1 = newRam1;   // Replace old RAM
            System.out.println("RAM upgraded successfully!");
        } else {
            System.out.println("Upgrade failed! New RAM must be higher.");
        }
    }
}
public class SwappingPartsOfRam {
    public static void main(String[] args) {

        Ram1 oldRam1 = new Ram1(8);
        Computer1 pc1 = new Computer1(oldRam1);

        pc1.showSpecs1();

        System.out.println("Upgrading RAM...");

        Ram1 newRam1 = new Ram1(16);
        pc1.upgradeRam1(newRam1);

        pc1.showSpecs1();
    }
}
