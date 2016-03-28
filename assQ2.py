import binascii;

rd=[rf.rstrip('\n') for rf in open("wahidah.txt","r")];
with open("wahidah.bin","wb") as wb:
 for data in rd:
  bd=bin(int(binascii.b2a_hex(data),16))
  wb.write("{}\n".format(bd));
