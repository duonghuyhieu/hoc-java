int sacPin(int pin, int phut) {
  return pin + phut * 2;
}
void main() {
  int pin = 30;
  pin = sacPin(pin, 10);
  pin = sacPin(pin, 15);
  System.out.println(sacPin(pin, 5));
}
