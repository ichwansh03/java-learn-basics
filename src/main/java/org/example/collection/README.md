## Java Collection Notes

* Semua collection (selain map) dapat dilakukan perulangan menggunakan `for each` karena turunan dari class `Iterable`.
* List memiliki index, jadi manage data nya lebih dinamis.
* LinkedList cepat jika ingin menambahkan dan iterasi data, karena posisi index dapat dimanage menggunakan pointer next dan previous. Sementara itu ArrayList sangat cepat jika ingin mengakses data secara detail maupun mengubah data, karena cukup diakses menggunakan index tanpa harus mengakses dari head pointer.