record CauThu(String ten) {}
void main() {
  var doi = new HashSet<CauThu>();
  doi.add(new CauThu("Long"));
  doi.add(new CauThu("Long"));
  System.out.println(doi.size());
}
