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
        String message = "This is %s, who is %s year(s) old. %s %s cuddles! \n";
        System.out.printf(message, this.name, this.age, this.name, this.likesCuddles ? "likes": "doesn't like");
    }
}
