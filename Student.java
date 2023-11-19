public class Student {
    public String firstName;
    public String animal;
    public Student(String name, String favAnimal)
    {
      firstName = name;
      animal = favAnimal;
    }
    public String getName()
    {
      return firstName;
    }
    public String getAnimal()
    {
      return animal;
    }
    public String toString()
    {
      return firstName + "'s favorite animal is " + animal;
}
