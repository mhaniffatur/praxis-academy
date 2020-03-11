# Konsep OOP
ada 2 konsep oop yang dikenalkan pada praktik di file ini, yakni : 
1. konsep inheritance (pewarisan atribut/method)
2. konsep overriding (penulisan ulang atribut/method yang sudah diwariskan)

# Penjelasan koding

## diagram pewarisan pada file

```java
BangunDatar.java -> Persegi.java
BangunDatar.java -> Segitiga.java

*ket
simbol -> berarti mewariskan
```
<br />
## Inheritance pada Persegi.java

```java
public class Persegi extends BangunDatar 
```
extends disini berarti class persegi **mewarisi** seluruh atribut dan method yang ada pada class BangunDatar. Hal ini membuat kita dapat memanggil atribut/method pada BangunDatar melalui Objek persegi seperti ini

```java
persegi.test();
```
padahal method test() hanya terdapat di BangunDatar.java tapi kita bisa memanggilnya lewat objek persegi
<br />
## Overriding pada Persegi.java

overriding disini berarti kita **menulis ulang method yang sudah diwariskan**. Sebagai contoh pada class BangunDatar.java sudah terdapat method luas yang diwariskan ke class persegi. tetapi apabila kita ingin memodifikasinya hanya untuk class Persegi.java kita bisa menggunakan konsep overriding, yang berarti kita menulis ulang method yang diwariskan tadi

```java
float luas()
{
        System.out.println("Menghitung laus bangun datar");
        return 0;
}
```
method luas sudah ada pada BangunDatar.java. tetapi kita ingin memodifikasinya di Persegi.java

```java
@Override
float luas()
{
    float luas = sisi * sisi;
    System.out.println("Luas Persegi: " + luas);
    return luas;
}
```
@Override digunakan agar kita bisa menulis ulang method luas pada Persegi.java

```
sumber & referensi
```

1. [Petani Kode - inheritance](
https://www.petanikode.com/java-oop/)