package collection.hashmap;

import collection.treeset.Member;
import collection.treeset.MemberTreeSet;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberTreeSet manager = new MemberTreeSet();

        Member memberLee = new Member("Lee", 300);
        Member memberKim = new Member("Kim", 100);
        Member memberSin = new Member("Sin", 200);
        Member memberKim2 = new Member("Kim2", 100);

        manager.addMember(memberLee);
        manager.addMember(memberKim);
        manager.addMember(memberSin);
        manager.addMember(memberKim2);

        manager.showAllMember();

        manager.removeMember(200);

        manager.showAllMember();

    }
}
