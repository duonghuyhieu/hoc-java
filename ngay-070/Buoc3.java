class Hop<T> {
  private T qua;
  Hop(T q) { qua = q; }
  T lay() { return qua; }
}
void main() {
  int vang = new Hop<>(500).lay();
  vang = vang + 250;
  System.out.println(vang);
}
