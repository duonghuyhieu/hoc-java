void main() {
  var bangGia = List.of(250, 99, 120);
  var gia = new ArrayList<>(bangGia);
  Collections.sort(gia);
  System.out.println(gia);
}
