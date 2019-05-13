public class FirstClass {
    private String name ="Cristi";
    private int age;

    public FirstClass(String n){
        this.name = n;
    }

    public FirstClass(String n, int age){
        this.name = n;
        this.age = age;
    }
    public static void main(String[] args) {
        FirstClass object1 = new FirstClass("Ana");
    }
}
