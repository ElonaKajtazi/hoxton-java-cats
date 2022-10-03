public class Cat {
    public String name;
    public Integer age;
    public boolean likesCuddles;

    public Cat(String name, Integer age, boolean likesCuddles ) {
        this.name = name;
        this.age = age;
        this.likesCuddles = likesCuddles;
    }

    void displayInfo() {
        System.out.println(("This is " + name + ", who is " + age + " years old. " + name  + (likesCuddles ? "" : " doesn't ")+ " like(s) cuddles!"));
    }
}
