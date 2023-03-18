public class Notebook {
    private String brand;
    private String color;
    private String os;
    private int ram;
    private int diskSize;
    private String cpu;

    Notebook(String brand, String color, String os, int ram, int diskSize, String cpu) {
        this.brand = brand;
        this.color = color;
        this.os = os;
        this.ram = ram;
        this.diskSize = diskSize;
        this.cpu = cpu;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getOs() {
        return os;
    }

    public int getRam() {
        return ram;
    }

    public int getDiskSize() {
        return diskSize;
    }

    public String getCpu() {
        return cpu;
    }

    public void print() {
        System.out.println(" ");
        System.out.print("Brand: ");
        System.out.println(this.brand);
        System.out.print("Color: ");
        System.out.println(this.color);
        System.out.print("OS: ");
        System.out.println(this.os);
        System.out.print("RAM: ");
        System.out.print(this.ram);
        System.out.println(" GB");
        System.out.print("Disk size: ");
        System.out.print(this.diskSize);
        System.out.println(" GB");
        System.out.print("CPU: ");
        System.out.println(this.cpu);
    }
}
