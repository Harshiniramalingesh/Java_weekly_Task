package compositionoverinheritance;

    class Processor {
        String brand;
        int cores;

        Processor(String brand, int cores) {
            this.brand = brand;
            this.cores = cores;
        }

        void showProcessor() {
            System.out.println("Processor: " + brand + ", Cores: " + cores);
        }
    }

    class Ram {
        int capacity; // in GB

        Ram(int capacity) {
            this.capacity = capacity;
        }

        void showRam() {
            System.out.println("RAM: " + capacity + "GB");
        }
    }

    class Storage {
        int size; // in GB
        String type;

        Storage(int size, String type) {
            this.size = size;
            this.type = type;
        }

        void showStorage() {
            System.out.println("Storage: " + size + "GB " + type);
        }
    }

    class Computer {

        Processor processor;
        Ram ram;
        Storage storage;

        Computer(Processor processor, Ram ram, Storage storage) {
            this.processor = processor;
            this.ram = ram;
            this.storage = storage;
        }

        void showSpecs() {
            processor.showProcessor();
            ram.showRam();
            storage.showStorage();
        }
    }

    public class PcBuilder {
        public static void main(String[] args) {

            Processor p = new Processor("Intel i5", 6);
            Ram r = new Ram(16);
            Storage s = new Storage(512, "SSD");

            Computer pc = new Computer(p, r, s);

            pc.showSpecs();
        }
    }

