int sacPin(int pin) {
  return pin + 20;
}
void main() {
  int pin = 30;
  sacPin(pin);
  System.out.println(pin);
}
