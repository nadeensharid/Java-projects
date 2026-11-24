
public class Org {
    private String name;
    private Leader leader;
    private Member[] members;
    private int count;

    public Org() {
        name = "";
        leader = null;
        members = new Member[10];
        count = 0;
    }

    public Org(String name, Leader leader) {
        this.name = name;
        this.leader = leader;
        members = new Member[10];
        count = 0;
    }

    public void addMember(Member m) {
        if (count < members.length) {
            members[count] = m;
            count++;
        }
    }

    public String toString() {
        String result = "Org: " + name + "\n";
        result += "Leader: " + leader.getName() + "\n";
        result += "Members:\n";

        for (int i = 0; i < count; i++) {
            result += members[i].getName() + "\n";
        }

        return result;
    }
}