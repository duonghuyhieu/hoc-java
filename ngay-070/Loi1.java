// Cố ý sai — chạy để xem lỗi như trong video.
class Hop<T> {
  private T qua;
  Hop(T q) { qua = q; }
  T lay() { return qua; }
}
void main() {
  int vang = new Hop<int>(500).lay();
  vang = vang + 250;
  System.out.println(vang);
}
