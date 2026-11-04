void main() {
  var daThich = new HashSet<String>();
  daThich.add("An");
  daThich.remove("An");
  boolean coAn = daThich.contains("An");
  System.out.println(coAn);
  if (daThich.add("An")) {
    System.out.println("Báo: An thích");
  }
}
