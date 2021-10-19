class Employee
{
  private String name;
  private int age;
  private int salary;
  
  public void read()
  {
    
  }
  
  public void show()
  {
    //System.out.println("name is"+ name + "age is"+ age + "salary is"+ salary );
    System.out.println("name is   "+ name );
    System.out.println("age is  "+ age );
    System.out.println("salary is  "+ salary);
  }
  
  public Employee()
  {
    
  }
  
  public Employee(String name, int age, int salary)
  {
      this.name= name;
      this.age= age;
      this.salary= salary;
  }
}
  
  public class Main
  {
    public static void main(String [] Args)
    {
      Employee E1 = new Employee();
      Employee E2= new Employee("Ram", 25, 50000);
      E2.show();
    }
    
    
  }
