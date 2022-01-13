package day01;

public class Teacher {
    private String name;
    private String tantargy;
    private String osztaly;
    private int oraszam;

    public Teacher(String name, String tantargy, String osztaly, int oraszam) {
        this.name = name;
        this.tantargy = tantargy;
        this.osztaly = osztaly;
        this.oraszam = oraszam;
    }

    public String getName() {
        return name;
    }

    public String getTantargy() {
        return tantargy;
    }

    public String getOsztaly() {
        return osztaly;
    }

    public int getOraszam() {
        return oraszam;
    }
}
