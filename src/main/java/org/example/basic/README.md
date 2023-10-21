## Java Basic Notes

* Method Overloading adalah kemampuan membuat method dengan nama yang sama, namun jumlah parameternya berbeda, hal ini jika dapat dilakukan di Constructor. Sementara itu method Overriding adalah proses mendeklarasikan ulang method di class child dari class parent. Di field, tidak ada istilah variable overriding, adanya variable hiding. Behavior antara method dan field berbeda, jadi disarankan untuk override method saja, tidak perlu buat field baru di class child.
* Jika ingin menggunakan perbandingan antar teks di string, gunakan fungsi `matches()` untuk membandingkan teks dengan return Boolean. Sementara `equals()` digunakan untuk membandingkan 2 objek.
* Class `RecursiveProblem` merupakan contoh error `StakcOverflow`, dimana ketika method memanggil terlalu dalam sebuah value, maka value akan tersimpan dalam stack, dan stack tersebut akan menumpuk value sehingga sistem tidak dapat menampung value hasil pemanggilan tersebut.
* Keyword `extends` digunakan untuk pewarisan dari class, jika dari interface gunakan `implements`.
* Keyword `this` digunakan untuk mengakses field atau method objek dari class, untuk menghindari variabel shadowing dari parameter jika nama variabelnya sama. Sementara itu, keyword `super` digunakan untuk mengambil value dari class parent, namun penggunakan keyword ini sifatnya *opsional*.
* Record Class (`StudentRecords`) hanya berfungsi untuk menyimpan data dan bersifat immutable (tidak bisa diubah) dan `record` class hanya bisa implement interface, tidak bisa extend class.
* Enum Class juga bisa ditambahkan field, constructor dan method.
* Setiap class Exception di java memiliki super class yakni `Throwable`.
* Exception hanya dapat di extend di method menggunakan keyword `throws`. Untuk mengakses method exception harus implementasi blok try-catch, namun tidak wajib jika class extend ke `Runtime Exception` ataupun `Error`. Tetapi jika tidak menggunakan blok try-catch maka sistem akan force-close. Jika ingin mengetahui secara detail error seperti nama class, letak baris dll gunakan method `printStackTrace()` dari class `Throwable`.
* Annotation bertujuan untuk menambahkan metadata pada program, dengan keyword `@interface` dan attribute wajib `@Terget` untuk scope penggunaan (FIELD/METHOD/CLASS) dan `@Retention` untuk scope program berjalan (RUNTIME/CLASS/SOURCE). Lihat contoh implementasinya di class `StudentApp`.

## Related Articles

[Perbandingan Pass by Value dan Pass by Reference di Java](https://ichwansholihin.medium.com/perbandingan-pass-by-value-dan-pass-by-reference-di-java-af94ef10ea78)

[Mengelola Data Immutable Menggunakan Record Class di Java](https://ichwansholihin.medium.com/mengelola-data-immutable-menggunakan-record-class-di-java-ab4ff258ce3b)
