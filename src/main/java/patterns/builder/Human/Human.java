package patterns.builder.Human;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class Human {
    private int age;
    private String name;
    private int weight;

    private Human(Builder builder) {
        this.age = builder.age;
        this.name = builder.name;
        this.weight = builder.weight;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private int age;
        private String name;
        private int weight;

        public Builder age(int age) {
            this.age = age;
            return this;
        }
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder weight(int weight) {
            this.weight = weight;
            return this;
        }

        public Human build() {
            return new Human(this);
        }
    }

    public void getInfo() {
         System.out.println(this);
    }
}
