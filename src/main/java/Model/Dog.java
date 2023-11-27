package Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "dogs")
@NoArgsConstructor
public class Dog {
    @Id
    @GeneratedValue
    private int id;

    @Setter
    @Getter
    @Column(name = "name")
    private String name;

    @Setter
    @Getter
    @Column(name = "age")
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
