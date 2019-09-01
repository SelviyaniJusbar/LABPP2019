public class Tabungan {
double saldo;
String nama;
double jomlo;
 
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
