class Xe {
  static final int SUC_CHUA = 30;
  final String bienSo;
  Xe(String so) { bienSo = so; }
}
void main() {
  var xe = new Xe("29A-123");
  System.out.println(xe.bienSo);
  System.out.println(Xe.SUC_CHUA);
}
