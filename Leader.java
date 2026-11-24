public class Leader extends Member {
    private int year; // 1 or 2

    public Leader() {
        super();
        year = 1;
    }

    public Leader(String name, int id, int year) {
        super(name, id);
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}