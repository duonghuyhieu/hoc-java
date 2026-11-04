class Hop<T> {
  private T qua;
  Hop(T q) { qua = q; }
  T lay() { return qua; }
}
void main() {
  var vang = new Hop<>(500);
  System.out.println(vang.lay() + 1);
}
