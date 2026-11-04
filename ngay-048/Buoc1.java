class Khach {
  String ten;
  Khach(String ten) { this.ten = ten; }
}
class Vip extends Khach {
  Vip(String ten) { super(ten); }
}
void main() {
  System.out.println(new Vip("An").ten);
}
