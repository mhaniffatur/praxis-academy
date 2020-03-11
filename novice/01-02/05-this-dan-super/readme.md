# Konsep OOP
konsep oop yang dikenalkan disini ada 2 yakni, kata kunci `this` dan `super`

# Konsep this
misalkan terdapat potongan program seperti ini
```java
class User {
    private String username;

    // ini method setter
    public void setUsername(String username){
        this.username = username;
    }

    // ini method getter
    public String getUsername(){
        return this.username;
    }
}
```
kata kunci `this` pada 
``` java
this.username = username;
```
merujuk pada class User itu sendiri, jadi `this.username ` sebenarnya sama dengan `User.username`. `this` menjadi `user` **karena classnya bernama User**

# Konsep Super
misalkan terdapat potongan program seperti ini
```java
public class Person {
    String name = "Petanikode";
    int age = 22;
}
```
dan turunannya
```java
public class Employee extends Person {
    
    float salary = 4000f;
    String name = "Dian";
    int age = 23;
      
    public void showInfo(){
        System.out.println("Name: " + super.name);
        System.out.println("Age: " + super.age);
        System.out.println("Salary: $" + salary);
    }
}
```
nah kata kunci `super` pada 
``` java
System.out.println("Name: " + super.name);
```
merujuk kepada class induknya yakni Person. Jadi `super.name` sebenarnya sama dengan `Person.name`. `super` menjadi `person` karena **induk class dari employee adalah person**

</br>

```
Sumber & Referensi
```
1. [Petani Kode - this and super](
https://www.petanikode.com/java-oop-this-super/)