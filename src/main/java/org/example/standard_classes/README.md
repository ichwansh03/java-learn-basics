## Java Standard Classes Notes

* String adalah tipe data immutable, artinya value tidak dapat diubah dan String akan membuat value baru yang akan memenuhi memory. Untuk memanipulasi string tanpa membuat value baru secara parallel, disarkan menggunakan `StringBuffer`, jika tidak paralel gunakan `StringBuilder`.
* Untuk mengetahui processor yang tersedia atau memory capacity, gunakan class `Runtime`.
* Method `UUID.randomUUID()` digunakan untuk men-generate unique number yang selalu berbeda.
* Gunakan `Objects.toString(Object value)` jika tidak ingin melakukan pengecekan manual menggunakan if. Begitu juga dengan `equals()` dan `hashCode()`. Hal ini bertujuan untuk menghindari NPE.
* Class `PropertiesApp` digunakan untuk mengkonfigurasi dan menyimpan file properties.

## Related Article
![Perbedaan Antara StringBuffer dan StringBuilder di Java](https://ichwansholihin.medium.com/perbedaan-antara-stringbuffer-dan-stringbuilder-di-java-5465a8d01005)
