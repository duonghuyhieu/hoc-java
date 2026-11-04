record CauThu(String ten) {}
void main() {
  var doiHinh = new ArrayList<CauThu>();
  doiHinh.add(new CauThu("Long"));
  var duBi = doiHinh;
  duBi.add(new CauThu("Huy"));
  System.out.println(doiHinh.size());
}
