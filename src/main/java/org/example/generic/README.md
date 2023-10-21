## Java Generic Notes

* Generic parameter type dapat digunakan di Class, Field atau Method. Default dari setiap generic yg dibuat bersifat invariant dan bertipe data `Object`. Invariant tidak boleh di substitusi dengan class child maupun parent (ex: Object != String).
* Cara agar dapat substitusi dari class parent, gunakan Covariant (`Example<? extends Object> examples`) Covariant bersifat read-only, data bersifat immutable. Jika dari class child, gunakan Contravariant (`Example<? super String example`). Lihat contoh di class `GenericApp`.
* Jika ingin menggunakan generic type namun hanya menggunakan tipe data yg spesifik, gunakan `BoundedTypeParameter`. Jika ingin menurunkan interface contract pada bounded type, gunakan simbol `& namainterface`. Tidak bisa menurunkan class lebih dari satu, karena di Java tidak boleh memiliki 2 parent class.

## Related Article
[Mengenal Konsep Invariant, Covariant dan Contravariant pada Generic Type Parameter di Java](https://ichwansholihin.medium.com/mengenal-konsep-invariant-covariant-dan-contravariant-pada-generic-type-parameter-di-java-9998d0911d52)
