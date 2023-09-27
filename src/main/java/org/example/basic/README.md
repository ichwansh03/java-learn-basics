## Java Basic Notes

* Method Overloading adalah kemampuan membuat method dengan nama yang sama, namun jumlah parameternya berbeda, hal ini jika dapat dilakukan di Constructor. Sementara itu method Overriding adalah proses mendeklarasikan ulang method di class child dari class parent. Di field, tidak ada istilah variable overriding, adanya variable hiding. Behavior antara method dan field berbeda, jadi disarankan untuk override method saja, tidak perlu buat field baru di class child.
* Jika ingin menggunakan perbandingan antar teks di string, gunakan fungsi `matches()` untuk membandingkan teks dengan return Boolean. Sementara `equals()` digunakan untuk membandingkan 2 objek.
* Class `RecursiveProblem` merupakan contoh error `StakcOverflow`, dimana ketika method memanggil terlalu dalam sebuah value, maka value akan tersimpan dalam stack, dan stack tersebut akan menumpuk value sehingga sistem tidak dapat menampung value hasil pemanggilan tersebut.
* Keyword `extends` digunakan untuk pewarisan dari class, jika dari interface gunakan `implements`.
* Keyword `this` digunakan untuk mengakses field atau method objek dari class, untuk menghindari variabel shadowing dari parameter jika nama variabelnya sama. Sementara itu, keyword `super` digunakan untuk mengambil value dari class parent, namun penggunakan keyword ini sifatnya *opsional*.
* 