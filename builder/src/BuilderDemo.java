public class BuilderDemo {

    public static void main(String[] args) {

        Person person1 = new Person.PersonBuilder("Saman", "Sarafraz")
                .setAge(33)
                .setEmail("saman.sarafraz86@gmail.com")
                .build();

        System.out.println(person1);

        Person person2 = new Person.PersonBuilder("Ali", "Azizi")
                .setAddress("No1, Tehran, Iran")
                .setPhoneNumber("0212222221")
                .build();

        System.out.println(person2);

    }
}
