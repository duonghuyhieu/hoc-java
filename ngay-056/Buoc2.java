void main() {
  var gia =
    new HashMap<String, Integer>();
  gia.put("Kiếm", 300);
  gia.put("Khiên", 200);
  var giaCu = gia.put("Kiếm", 500);
  System.out.println(giaCu);
  System.out.println(gia.size());
}
