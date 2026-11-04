void main() {
  var bangGia = List.of(250, 99, 120);
  var gia = new ArrayList<>(bangGia);
  Collections.sort(gia);
  gia.sort(Comparator.reverseOrder());
  System.out.println(gia);
}
