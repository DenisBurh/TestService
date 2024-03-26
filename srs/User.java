import java.util.Objects;

public class User {
    public int agw;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return agw == user.agw && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agw, name);
    }

    public User(int agw, String name) {
        this.agw = agw;
        this.name = name;
    }

    public String name;
}
