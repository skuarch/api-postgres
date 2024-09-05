package app.structure.services;

public class Employ implements Comparable<Employ> {

    public Long id;
    public String name;
    public Integer priority;

    public Employ(Long id, String name, Integer priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }

    public Employ() {
    }

    @Override
    public int compareTo(Employ e) {
        return this.id.compareTo(e.id);
    }

    @Override
    public String toString() {
        return "[id]=" + id + " [name]="+ name + " [priority]=" + priority;
    }
}
