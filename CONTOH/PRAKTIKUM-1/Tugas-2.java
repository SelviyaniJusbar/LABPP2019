//Nama: Fulan
//NIM: H0711710xx

public class ContohBede {
double saldo;
String nama;
double jumlah;
 
Tabungan (double jumlah, String nama)
{
this.nama=nama;
this.saldo=jumlah;
}
void nabung (double jumlah)
{
 
jml = jumlah;
this.saldo+=jml;
 
}
void ambilUang(double jumlah)
{
jml = jumlah;
this.saldo-=jml;
}
double ambilSaldo()
{
return saldo;
}
 
}
