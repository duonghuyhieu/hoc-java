void main() {
  int pin = 15;
  boolean dangSac = false;
  if (pin < 50) {
    System.out.println("Pin vừa");
  } else if (pin < 20 && !dangSac) {
    System.out.println("Cắm sạc");
  }
}
