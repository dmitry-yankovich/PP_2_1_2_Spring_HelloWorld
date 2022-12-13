public class Cat {

    private String name;
    private Byte age;
    private Color color;

    public Cat() {
    }

    public Cat(String name, Byte age, Color color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Byte getAge() {
        return age;
    }

    public Color getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
