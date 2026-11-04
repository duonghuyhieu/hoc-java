class TaiXe {
  String chao() { return "Chào"; } }
class Vip extends TaiXe { }
void main() {
  Vip taiXe = new Vip();
  String loiChao = taiXe.chao();
  loiChao = loiChao + ", mời nước";
  System.out.println(loiChao);
}
