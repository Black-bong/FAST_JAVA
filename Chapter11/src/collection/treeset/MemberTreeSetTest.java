package collection.treeset;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet manager = new MemberTreeSet();

        Member memberLee = new Member("Lee", 300);
        Member memberKim = new Member("Kim", 100);
        Member memberSin = new Member("Sin", 200);

        manager.addMember(memberLee);
        manager.addMember(memberKim);
        manager.addMember(memberSin);

        manager.showAllMember();

    }
}
