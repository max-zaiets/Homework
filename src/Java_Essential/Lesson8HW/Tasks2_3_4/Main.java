package Java_Essential.Lesson8HW.Tasks2_3_4;

public class Main {
    public static void main(String[] args) {
        Device a = new Device("Samsung", 150, "84gh5dth1d3t");
        Device c = new EthernetAdapter("Samsung", 100, "1awf884easf65", 1366, "qwert");
        Device d = new Device("Samsung", 150, "84gh5dth1d3t");
        Device f = new EthernetAdapter("Samsung", 100, "1awf884easf65", 1366, "qwert");
        Device g = new Monitor("Samsung", 200, "1awf884easf65", 1366, 768);
        Device h = new Monitor("Samsung", 200, "1awf884easf65", 465, 768);

        System.out.println(a.equals(d));
        System.out.println(c.equals(f));
        System.out.println(g.equals(h));

        System.out.println(a.hashCode());
        System.out.println(d.hashCode());

        System.out.println(c.hashCode());
        System.out.println(f.hashCode());

        System.out.println(g.hashCode());
        System.out.println(h.hashCode());


    }
}
