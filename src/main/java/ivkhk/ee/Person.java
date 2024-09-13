package ivkhk.ee;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Person {
    private String name;
    private String lastname;
    private int birthyear;
    private int birthmonth;
    private int birthday;
    private String phone;
    private Address address;

    public Person() {
    }

    public Person(String name, String lastname, int birthyear, int birthmonth, int birthday, String phone, Address address) {
        this.name = name;
        this.lastname = lastname;
        this.birthyear = birthyear;
        this.birthmonth = birthmonth;
        this.birthday = birthday;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }

    public int getBirthmonth() {
        return birthmonth;
    }

    public void setBirthmonth(int birthmonth) {
        this.birthmonth = birthmonth;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return birthyear == person.birthyear && birthmonth == person.birthmonth && birthday == person.birthday && Objects.equals(name, person.name) && Objects.equals(lastname, person.lastname) && Objects.equals(phone, person.phone) && Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, birthyear, birthmonth, birthday, phone, address);
    }
    public int getAge(){
        LocalDate birthDate = LocalDate.of(birthyear, birthmonth, birthday);
        LocalDate currentDate = LocalDate.now();
        return Period.between(birthDate, currentDate).getYears();
    }
}

