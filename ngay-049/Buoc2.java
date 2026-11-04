class Quai { int dame() { return 10; } }
class Rong extends Quai {
  int dame() { return 50; }
}
void main() {
  Quai dich = new Rong();
  System.out.println(dich.dame());
}
