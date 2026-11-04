class TaiXe {
  String chao() { return "Chào"; } }
class Vip extends TaiXe {
  @Override String chao() {
    return super.chao() + ", mời nước";
  }
}
void main() {
  System.out.println(new Vip().chao());
}
