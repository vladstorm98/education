package practice.builder_homework;

public class Human {
    private int age;
    private String name;
    private int weight;

    public static HumanBuilder builder() {
        return new HumanBuilder();
    }

    public static class HumanBuilder {
        private Human human = new Human();

        public HumanBuilder age(int newAge) {
            human.setAge(newAge);
            return this;
        }
        public HumanBuilder name(String newName) {
            human.setName(newName);
            return this;
        }
        public HumanBuilder weight(int newWeight) {
            human.setWeight(newWeight);
            return this;
        }

        public Human build() {
            return human;
        }
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void getInfo() {
         System.out.println(age + name + weight);
    }
}
