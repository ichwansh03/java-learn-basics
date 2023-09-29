## Java Collection Notes

* Semua collection (selain map) dapat dilakukan perulangan menggunakan `for each` karena turunan dari class `Iterable`.
* List memiliki index, jadi manage data nya lebih dinamis dan dapat memasukkan data yang redundant.
* LinkedList cepat jika ingin menambahkan dan iterasi data, karena posisi index dapat dimanage menggunakan pointer next dan previous. Sementara itu ArrayList sangat cepat jika ingin mengakses data secara detail maupun mengubah data, karena cukup diakses menggunakan index tanpa harus mengakses dari head pointer.
* Jika data pada list atau set tidak dapat diubah, gunakan method `Collection.unmodifiableList(value)` dan `Collection.unmodifiableSet(value)` ketika return get data. Jika ingin mereturn data list yg kosong, gunakan method `Collections.emptyList()` dan `Collections.emptySet()`. Di map juga bisa menerapkan beberapa method tersebut.
* Set tidak memiliki index dan jika memasukkan data redundant, maka set akan mengakses satu data saja.
* Queue support First In First Out/antrian memiliki tiga class turunan: ArrayDeque (sama seperti ArrayList), LinkedListQueue (sama seperti LinkedList) dan PriorityQueue (sama seperti ArrayList, namun menggunakan implementasi Comparable/Comparator untuk mengurutkan data). Deque support Last In First Out/tumpukan.
* Map berisikan key dan value. Key pada map harus bersifat unique dan tidak boleh duplikat serta key harus mapping satu value. Class `WeakHashMap` cocok digunakan untuk menyimpan data cache secara temporary karena akan menghapus data yang tidak pernah digunakan.
* Setiap interface `Collection` sudah disediakan class abstract dan tidak perlu implement collection.

## Related Article
![Eksplorasi Struktur Data Queue dan Deque serta Implementasinya di Java](https://ichwansholihin.medium.com/eksplorasi-struktur-data-queue-dan-deque-serta-implementasinya-di-java-15b016e87703)
