class Phim {
  String ten;
  Phim(String ten) { this.ten = ten; }
}
void main() {
  var mai = new Phim("Mai");
  var dangXem = mai;
  dangXem = new Phim("Đào");
  System.out.println(dangXem.ten);
}
