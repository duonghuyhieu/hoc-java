class Quai { int dame() { return 10; } }
class Rong extends Quai {
  int dame() { return 50; } }
void main() {
  Quai[] dan = {new Quai(), new Rong()};
  for (Quai con : dan) {
    int sat = con.dame();
    System.out.println(sat);
  }
}
