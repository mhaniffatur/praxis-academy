# Ada 3 Macam Modifier dalam Java
Secara umum ada 3 macam modifier yang digunakan dalam Java: public, private, dan protected.

Apabila kita tidak menggunakan tiga kata kunci tersebut, maka member atau class itu tidak menggunakan modifier (no modifier).

Masing-masing modifier akan menentukan di mana saja member bisa diakses.

Berikut ini tabel jangkauan untuk masing-masing modifier:

|Modifier| Class | Package | Subclass | World |
|--|--|--|--|--|
|**public**| Y | Y | Y | Y |
|**protected**| Y | Y | Y | N |
|**private**| Y | N | N | N |
|**no modifier**| Y | Y | N | N |

```
Keterangan:
```
1. Y artinya `bisa diakses`;
2. N artinya `tidak bisa diakses`;
3. Subclass `artinya class anak`;
4. World artinya `seluruh package di aplikasi`.


```
sumber & referensi
```
[Petani Kode - oop modifier](
https://www.petanikode.com/java-oop-modifier/)