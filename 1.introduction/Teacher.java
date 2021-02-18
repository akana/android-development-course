public class Teacher extends Employee {
  private char gender;

  public Teacher(String lastname, String firstname, int yearOfBirth, double salary, char gender) {
    super(lastname, firstname, yearOfBirth, salary, "Teacher");
    this.gender = gender;
  }

  public String getFullName() {
    String name = super.getFullName();
    if (this.gender == 'M') {
      return "Mr. " + name;
    } else {
      return "Ms. " + name;
    }
  }

  public static void main(String[] args) {
    Teacher akana = new Teacher("mao", "akana", 1980, 500, 'M');
    System.out.println(akana.getFullName() + ": " + akana.getJob());
  }

}
