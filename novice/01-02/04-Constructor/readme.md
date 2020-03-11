# Konsep OOP
Konsep oop yang dikenalkan disini hanya 1, yakni :
1. Constructor

# Penjelasan Koding

## Constructor
konstruktor sendiri merupakan method spesial yang otomatis dijalankan ketika inisiasi objek. sebagai contoh pada User.java

```java
public class User 
{
    public String username;
    public String password;
    
    public User() 
    {
        System.out.println("eksekusi method constructor...");
    }
}
```
disini terdapat method konstruktor yaitu
```java
 public User() 
    {
        System.out.println("eksekusi method constructor...");
    }
```
untuk membedakan method konstruktor pada java, yaitu dengan melihat nama yang sama dengan nama classnya

</br>

**kita akan berpindah ke Main.java** , disini ketika class user diinisiasi pada kode

```java
User petani = new User();
```
method construct pada class user akan otomatis dijalankan

</br>

```
sumber & referensi
```
1. [Petani Kode - oop modifier](
https://www.petanikode.com/java-oop-constructor/)