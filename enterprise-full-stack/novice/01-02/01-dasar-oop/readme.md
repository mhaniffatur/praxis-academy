# Konsep OOP
ada 3 konsep oop yang dikenalkan pada saat praktik di file ini, yakni
1. Pendefinisian sebuah class sebagai objek pada class lainnya
2. mendefinisikan atribut pada sebuah class melalui objek yang sudah didefinisikan
3. memanggil method pada sebuah class melalui objek yang sudah didefinisikan

# Penjelasan koding
disini terdapat 2 file yang akan dijelaskan yaitu  **Player.java** dan **Game.java**

## Player.java

```java
String name;
int speed;
int healthPoin;
```
baris diatas merupakan pendefinisian atribut/variabel yang hanya bisa diakses di class player

<br />

```java
void run()
{
    System.out.println(name +" is running...");
    System.out.println("Speed: "+ speed);
}
```
baris diatas merupakan pendefinisian method run, method ini berjenis method void / method tanpa nilai balik

<br />

```java
boolean isDead()
{
    if(healthPoin <= 0) return true;
    return false;
}
```
baris diatas merupakan pendefinisian method isDead, method ini berjenis method non-void / method dengan nilai balik

<br />

## Game.java
Game.java merupakan file **main** yang diakses


```java
Player petani = new Player();
```
baris diatas merupakan pendefinisian class player.java sebagai objek di class Game.java

<br />


```java
petani.name = "Petani Kode";
petani.speed = 78;
petani.healthPoin = 100;

// petani dalam petani.name merupakan nama objek yang sudah didefinisikan pada saat mendefinisikan objek petani

// name dalam petani.name merupakan nama atribut yanf didefinsikan pada class player.java
```
baris diatas merupakan pendefinisian atribut yang terdapat pada di class player.java melalui objek petani pada game.java

<br />

```java
petani.run();

if(petani.isDead()){
    System.out.println("Game Over!");
}

// petani dalam petani.run() merupakan nama objek yang sudah didefinisikan pada saat mendefinisikan objek petani

// run dalam petani.run() merupakan nama method yang didefinsikan pada class player.java
```
baris diatas merupakan pemanggilan method yang terdapat pada di class player.java melalui objek petani pada game.java

```
sumber & referensi
```
1. [Petani Kode - oop dasar](
https://www.petanikode.com/java-oop/)