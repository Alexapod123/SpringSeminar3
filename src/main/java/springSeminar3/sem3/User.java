package springSeminar3.sem3;

import java.time.LocalDate;
import java.util.UUID;

public class User {
    public enum Condition {
        DIRECTOR,
        ACCOUNTANT,
        OFFICE_MANAGER,
        DEVELOPER,
        SELLER
    }

    private UUID id;
    private String name;
    private LocalDate birthday;
    private Condition condition;

    public User(String name, LocalDate birthday, Condition condition) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.birthday = birthday;
        this.condition = condition;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }
}
