package Lesson9.Task2;

public class Computers {
    public static void main(String[] args) {

        Computer[] computers = new Computer[5];
        computers[0] = new Computer("AMD Ryzen 5 5600G 3.9GHz/16MB ", 500);
        computers[1] = new Computer("Intel Core i5-11400F 2.6GHz/12MB", 500);
        computers[2] = new Computer("AMD Ryzen 5 3600 3.6GHz/32MB", 1000);
        computers[3] = new Computer("AMD Ryzen 5 5600 3.5GHz/32MB", 1500);
        computers[4] = new Computer("Intel Core i7-12700K 3.6GHz/25MB", 1500);

        for (int i = 0; i < computers.length; i++) {
            System.out.println("CPU - " + computers[i].CPU + "; " + computers[i].SSD_volume + " Gb");
        }
    }
}
