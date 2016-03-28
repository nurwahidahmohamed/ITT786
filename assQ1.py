import binascii;
nama=raw_input("Nama Anda:");
alamat=raw_input("AlamatAnda:");

with open("wahidah.txt","w") as fh:
 fh.write("Nama: {} \nAlamat:{}".format(nama,alamat));

