package test01.test06;

class Member {
    private String name;
    private int age;

    // TODO: name에 대한 Getter와 Setter를 작성하시오.
    // Setter에는 이름이 null이 아니고 2글자 이상인지 검증하는 로직을 추가하시오.
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if(name == null || name.length() < 2) {
            System.out.println("유효하지 않은 이름입니다.");
        }
        this.name = name;
    }
    // TODO: age에 대한 Getter와 Setter를 작성하시오.
    // Setter에는 나이가 0에서 120 사이인지 검증하는 로직을 추가하시오.
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age < 0 || age > 120) {
            System.out.println("유효하지 않은 나이입니다.");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public void printInfo() {
        System.out.println("이름: " + name + ", 나이: " + age);
    }
}

public class MemberManagement {
    public static void main(String[] args) {
        // TODO: 유효한 이름("이순신")과 유효하지 않은 나이(150)를 설정하고 정보를 출력하시오.
        Member member = new Member();
        member.setName("이순신");
        member.setAge(150);
        member.printInfo();
        // TODO: 유효하지 않은 이름("김")과 유효한 나이(30)를 설정하고 정보를 출력하시오.
        Member member1 = new Member();
        member1.setName("김");
        member1.setAge(30);
        member1.printInfo();
        // TODO: 유효한 이름("강감찬")과 유효한 나이(45)를 설정하고 정보를 출력하시오.
        Member member2 = new Member();
        member2.setName("강감찬");
        member2.setAge(45);
        member2.printInfo();
    }
}
