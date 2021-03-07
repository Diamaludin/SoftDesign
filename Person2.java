 public class Person
{
 private String Fname;
 private String Lname;

 public String getName() {
 return Fname;
}
 public String getName() {
 return Lname;

public class Person {
String fname;
String Lname;

public static void main(String[] args)
{
Person p = new Person();

p.setFname("Diamaludin");
p.setLname("Mariga");
System.out.println(p.getFname());
System.out.println(p.getLname());

p.printDetails();
}
public void setFName(String Fname)
{
this.fname= fname;
}
public void setlName(String Lname)
{
this.Lname=Lname;
}
public String getFName() {
return this.Fname;
}
public String getLName() {
return this.Lname;
}
public void printDetails() {
System.out.println(getFname + " " + getLname);
}
}
 }
 }
