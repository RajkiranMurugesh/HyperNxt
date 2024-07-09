public class Example2{
    private String name;
    private int age;
    private String address;
    
    public chain2 setName(String name) {
        this.name = name;
        return this;
    }
    
    public chain2 setAge(int age) {
        this.age = age;
        return this;
    }

    public chain2 setAddress(String address) {
        this.address = address;
        return this;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
       
    }

    public static void main(String[] args) {
    
        chain2 person = new chain2()
                .setName("rathan")
                .setAge(22)
                .setAddress("banglore");
            
        person.displayDetails();
    }
}
