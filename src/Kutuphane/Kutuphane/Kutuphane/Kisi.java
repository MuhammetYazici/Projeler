package Kutuphane.Kutuphane.Kutuphane;

public class Kisi {
    private String name;
    private final int Id;

    private static int sayac=1;

    public Kisi(String name, String id) {
        setName(name);
        this.Id=sayac++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

}
