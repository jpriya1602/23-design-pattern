package Structural.Facade;

public class Member {
    private final String id;
    private String name;
    private String phoneNumber;
    private boolean active;

    public Member(String id, String name, String phoneNumber, boolean active) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.active = active;
    }

    public boolean isActive() {
        return active;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setActive(boolean active){
        this.active = active;
    }

    @Override
    public boolean equals(Object obj) {
        Member member = (Member) obj;
        return this.getId().equals(member.getId());
    }
}
