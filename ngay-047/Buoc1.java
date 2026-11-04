class TaiXe {
  String chao() { return "Chào"; } }
class Vip extends TaiXe { }
void main() {
  System.out.println(new Vip().chao());
}
