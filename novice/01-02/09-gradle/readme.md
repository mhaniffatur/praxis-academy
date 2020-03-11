#  Panduan Install Gradle pada windows

1. Download file binary gradle pada https://gradle.org/next-steps/?version=6.2.2&format=bin
   
2. Buat Folder baru bernama Gradle pada Disk C:, sehingga bentuk direktorinya seperti ini `C:\Gradle`

3. Ekstrak file binary Gradle-x.x.x-bin.zip kedalam direktori `C:\Gradle` tadi. Nah jika sudah bentuk direktorinya akan menjadi seperti ini `C:\Gradle\gradle-x.x.x`

4. selanjutnya buka pengaturan tentang environment variable pada control panel dengan cara seperti ini
   ```
   In File Explorer right-click on the This PC (or Computer) icon, then click Properties -> Advanced System Settings -> Environmental Variables.
   ```

5. Dalam tab system variable cari klik variable `path`. Lalu klik new dan masukkan alamat seperti ini `C:\Gradle\gradle-x.x.x\bin`. 


```
x.x.x disesuaikan dengan versi gradle yang diunduh
```

#  Verifikasi penginstalan gradle
nah untuk mengecek apakah gradle terinstal atau tidak. silahkan buka command prompt lalu ketikkan `gradle -v`

```
$ gradle -v

------------------------------------------------------------
Gradle 6.2.2
------------------------------------------------------------
```

jika yang muncul seperti diatas, maka penginstalan berhasil. disini saya menggunakan Gradle versi 6.2.2