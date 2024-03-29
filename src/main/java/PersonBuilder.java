public class PersonBuilder {
    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setName(String name) throws IllegalAccessException {
        if (name == null) {
            throw new IllegalAccessException("не заданно имя");
        } else {
            this.name = name;
        }
        return this;
    }
    public PersonBuilder setSurname(String surname) throws IllegalAccessException {
        if (surname == null) {
            throw new IllegalAccessException("не заданна фамилия");
        } else {
            this.surname = surname;
        }
        return this;
    }
    public PersonBuilder setAge(int age) throws IllegalArgumentException{
        if (age < 0 || age > 130) {
            throw new IllegalArgumentException ("не корректно задан возраст");
        } else {
            this.age = age;
        }
        return this;
    }
    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        Person person;
        if (name == null || surname == null) {
            throw new IllegalStateException("Не возможно создать объект Person");
        } else if (age == 0) {
            person = new Person(name, surname);
        } else {
            person = new Person(name, surname, age);
        }
        person.setAddress(address);
        return person;
    }
}
