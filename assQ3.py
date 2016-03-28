import binascii;
with open("wahidah.bin","rb") as rb, open("last.txt","w") as wl:
 for data in rb:
  n=int(data,2)
  wl.write("{}\n".format(binascii.a2b_hex('%x' % n)));
