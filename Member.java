
public class Member extends Person {
    private int id;

    public Member() {
        super();
        id = 0;
    }

    public Member(String name, int id) {
        super(name);
        this.id = id;
    }

    public int getId() {
        return id;
    }
}