void main() {
  var daThich = new HashSet<String>();
  daThich.add("An");
  daThich.add("Bình");
  boolean moi = daThich.add("An");
  System.out.println(moi);
  System.out.println(daThich.size());
}
