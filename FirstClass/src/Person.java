import java.util.Objects;

public class Person
{
    String name;
    String surname;
    int age;

    public Person(String name, String surname, int age)
    {
        this.name = Objects.requireNonNull(name, "Name must be not null");
        this.surname = Objects.requireNonNull(surname, "Surname must be not null");
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "I am " + name + " " + surname + " and I am " + age + " years old\n";
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, surname, age);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}