
public class Driver {
    public static void main(String[] args) {

        Leader l1 = new Leader("Ali", 1, 1);
        Leader l2 = new Leader("Sara", 2, 2);

        Member m1 = new Member("John", 10);
        Member m2 = new Member("Lina", 11);
        Member m3 = new Member("Mike", 12);

        Org org1 = new Org("Tech Club", l1);
        Org org2 = new Org("Art Club", l2);

        org1.addMember(m1);
        org1.addMember(m2);

        org2.addMember(m2); // عضو في الاثنين
        org2.addMember(m3);

        System.out.println(org1);
        System.out.println(org2);
    }
}