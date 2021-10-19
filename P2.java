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
    System.out.println("name is"+ name + "age is"+ age + "salary is"+ salary );
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
  
  public class Main
  {
    public Static void main(String [] Args)
    {
      Employee E1 = new Employee();
      E1.Employee("Ram", 25, 50000);
      E1.show();
    }
    
    
  }
