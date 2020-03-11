# Konsep OOP
konsep OOP yang dikenalkan disini hanya 1 yaitu class interface.

# Konsep interface
interface sendiri sebenarnya berfungsi sebagai penghubung antara 1 class dan class lainnya. Banyak juga yang bilang bahwa interface itu merupakan blueprint dari sebuah class. sebagai contoh kita akan membuat sebuah interface phone yang menghubungkan UserPhone(pengguna hp) dan Type Phone(turunan dari interface phone).

untuk diagram hubungan classnya berbentuk seperti ini
```java
PhoneUser.java -> Phone.java
Phone.java -> Xiaomi.java
Phone.java -> Oppo.java
Phone.java -> Iphone.java
```
Nah coba lihat pada Phone.java
```java
public interface Phone
{
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;
    
    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
}
```
disini ambil contoh method di Phone.java
```java
void powerOn()
```
Nah cara tiap Phone seperti Xiaomi/Iphone/Oppo dalam menyalakan hpnya tentu berbeda2 secara coding. Tetapi pengguna(PhoneUser.java) menggunakan sebuah method yang sama dalam menyalakan hpnya, yakni method
```java
 void turnOnThePhone()
{
    this.phone.powerOn();
}
```
walaupun tipe hpnya berbeda

phone dalam `this.phone.powerOn()` merujuk pada interface phone yang bisa dimasukkan merek phone yang diinginkan

sekarang coba dilihat di Main.java dimana kode utama dieksekusi
```java
// membuat objek HP
Phone redmiNote8 = new Xiaomi();

// membuat objek user
PhoneUser dian = new PhoneUser(redmiNote8);

// kita coba nyalakan HP-nya
dian.turnOnThePhone();

// biar enak, kita buat dalam program
Scanner input = new Scanner(System.in);
String aksi; 
```
Nah coba kita telusuri alur dari method
```java
dian.turnOnThePhone();
```
1. dian.turnOnThePhone(); akan memanggil method turnOnThePhone(); pada class PhoneUser. yang berisi
```java
private Phone phone;

    public PhoneUser(Phone phone) {
        this.phone = phone;
    }
    
    void turnOnThePhone(){
        this.phone.powerOn();
    }
```
2. selanjutnya turnOnThePhone() akan memanggil this.phone.powerOn();. Dimana `this.phone` merujuk pada turunan phone yang dimasukkan kedalam interface phone saat inisiasi di Main.java
```java
// membuat objek HP
Phone redmiNote8 = new Xiaomi();

// membuat objek user
PhoneUser dian = new PhoneUser(redmiNote8);
```
maka `this.phone.powerOn();` merujuk kepada method `Xiaomi.powerOn();`



