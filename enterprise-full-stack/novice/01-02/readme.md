# Rangkuman materi pertemuan ke-2
Daftar materi
1. OOP
2. Package
3. Gradle
4. Exception Handling
   
## Materi Konsep OOP
ada 7 sub materi yang dibahas di konsep oop
1. **Dasar OOP**
   
   Dasar OOP mencakup cara **pemanggilan sebuah class sebagai objek di class lain**. selain itu disini juga tercakup cara untuk mengakses method dan attribut pada class yang dipanggil sebagai objek

   [Praktik dan Penjelasan **Dasar OOP**](https://github.com/mhaniffatur/praxis-academy/tree/master/enterprise-full-stack/novice/01-02/01-dasar-oop)

2. **Inheritance dan Overriding**

    Sesuai judulnya, disini mencakup Konsep **Inheritance** dan **Overriding**. Secara singkat **inheritance adalah pewarisan** method dan atribut. Sedangkan **Overriding adalah Penulisan ulang** method/Atribut yang sudah diwariskan

   [Praktik dan Penjelasan **Inheritance dan Overriding**](https://github.com/mhaniffatur/praxis-academy/tree/master/enterprise-full-stack/novice/01-02/02-inheritance-overriding)

3. **Class Modifier**

    Class Modifier merupakan properti khusus yang ditulis dengan format
    ```java
    <*modifier*> Class <*nama class*>
    ```
    [Penjelasan **Class Modifier**](https://github.com/mhaniffatur/praxis-academy/tree/master/enterprise-full-stack/novice/01-02/03-modifier)

4. **Method Constructor**

    Method constructor merupakan method spesial yang selalu langsung dieksekusi ketika sebuah class diinisiasi sebagai objek

     [Praktik dan Penjelasan **Method Constructor**](https://github.com/mhaniffatur/praxis-academy/tree/master/enterprise-full-stack/novice/01-02/04-Constructor)

5. **Konsep `this` dan `super`**

    `this` sendiri merupakan kata kunci khusus untuk merujuk kepada class itu sendiri. Sedangkan `super`
    merupakan kata kunci untuk merujuk kepada class induk

    [Praktik dan Penjelasan **Konsep `this` dan `super`**](https://github.com/mhaniffatur/praxis-academy/tree/master/enterprise-full-stack/novice/01-02/05-this-dan-super)

6. **Class Interface**

    Class Interface sendiri merupakan sebuah class yang menghubungkan suatu class dengan class turunan dari class interface itu sendiri. Banyak juga yang bilang class interface ini merupakan blueprint dari class turunannya

    [Praktik dan Penjelasan **Class Interface**](https://github.com/mhaniffatur/praxis-academy/tree/master/enterprise-full-stack/novice/01-02/06-interface)

7. Class Abstract


## Materi Konsep Package
-
## Materi Konsep Gradle
Gradle adalah sebuah program yang berfungsi untuk melakukan build secara otomatis. Karena itu, Gradle sering disebut sebagai build-tool. Build di sini bisa kita artikan sebagai aktivitas melakukan compile dan packaging.

compile dan packaging gradle ini sebenarnya sama dengan command
```java
javac HelloWorld.java
```
nah tapi jika kita menggunakan command `javac` pada project yang sudah besar yang dimana terdapat banyak file .java serta library akan sangat merepotkan. Disinilah Gradle hadir sebagai solusi dengan mengotomatisasinya

Konsep kerja Gradle sama seperti Apache Ant dan Apache Maven.

Namun, bedanya terletak pada bahasa DSL yang digunakan. Gradle menggunakan Groovy dan Kotlin, sedangkan Maven dan Ant menggunakan XML.

untuk langkah-langkah penginstalan Gradle pada windows bisa dilihat di link dibawah

[Panduan install Gradle pada windows]()

## Materi Konsep Exception Handling