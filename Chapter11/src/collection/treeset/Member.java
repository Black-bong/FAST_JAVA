package collection.treeset;

import java.util.Comparator;

public class Member implements Comparator<Member> {

    private String memberName;
    private int memberID;

    public Member() { }
    public Member(String memberName, int memberID) {
        this.memberID = memberID;
        this.memberName = memberName;
    }

    @Override
    public int hashCode() {
        return memberID;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member) {
            Member member = (Member) obj;
            return this.memberID == member.memberID;
        }
        return false;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public String toString() {
        return memberName + "회원님의 아이디는 " + memberID + "입니다.";
    }
/*
    @Override
    public int compareTo(Member member) {
        // 양수값을 반환해주면 ASC, 음수값을 반환해주면 DESC
//        return (this.memberID - member.memberID) * (-1);

        // String 값으로 정렬
        return memberName.compareTo(member.getMemberName());
    }
 */
    @Override
    public int compare(Member member1, Member member2) {
        return (member1.memberID - member2.memberID);
    }
}
