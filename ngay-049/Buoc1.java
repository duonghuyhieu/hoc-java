class Quai { int dame() { return 10; } }
class Rong extends Quai {
  int dame() { return 50; }
}
void main() {
  Rong dich = new Rong();
  System.out.println(dich.dame());
}
