public class Student {

  private String Name;
  private int Age;
  private String Nazw;
  private String Data;

  public Student(String name, String nazw, int age , String data) {
    Name = name;
    Nazw = nazw;
    Age = age;
    Data = data;
  }

  public String GetName() {return Name;}
  public int GetAge() {return Age;}
  public String GetNazw() {return Nazw;}
public String GetData(){return Data;}
  public String ToString() {
    return Name + " " + Nazw + " " + Integer.toString(Age) + " " + Data;
  }

    public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 4) 
      return new Student("Parse Error","Parse Error" , -1,"Parse Error");
    return new Student(data[0], data[1], Integer.parseInt(data[2]),data[3]);
  }
}