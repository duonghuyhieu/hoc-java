class Vi { int soDu; }
void main() {
  var viAn = new Vi();
  var viBinh = viAn;
  var viChi = new Vi();
  System.out.println(viAn == viChi);
  viChi = viAn;
  System.out.println(viAn == viChi);
}
