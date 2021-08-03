package collection.set;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet manager = new MemberHashSet();

        Member memberLee = new Member("Lee", 100);
        Member memberKim = new Member("Kim", 200);
        Member memberSin = new Member("Sin", 300);
        Member memberSin2 = new Member("Sin2", 300);

        manager.addMember(memberLee);
        manager.addMember(memberKim);
        manager.addMember(memberSin);
        manager.addMember(memberSin2);

        manager.showAllMember();

        manager.removeMember(memberKim.getMemberID());
        manager.showAllMember();
    }
}
