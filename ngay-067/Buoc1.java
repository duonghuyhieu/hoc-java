record Mon(String ten, int gia) {}
void main() {
  var ao = new Mon("Ao thun", 150);
  var sale = new Mon(ao.ten(), 120);
  System.out.println(sale.gia());
}
