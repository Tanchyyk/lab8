package mail;

import lombok.Setter;
import lombok.Getter;

@Getter@Setter
public class Client {
    private String id;
    private String name;
    private int age;
    private Gender gender;

    public Client(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = new UniqueId().generateUniqueId();
    }
}