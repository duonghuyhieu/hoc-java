void main() {
  try {
    System.out.println("Giữ ghế A5");
    int moiNguoi = 270 / 0;
  } catch (ArithmeticException e) {
    return;
  }
  System.out.println("Nhả ghế A5");
}
