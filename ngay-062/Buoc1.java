void main() {
  String nhap = "50k";
  try {
    int tien = Integer.parseInt(nhap);
    System.out.println("Nạp " + tien);
  } catch (NumberFormatException e) {
    System.out.println("Chỉ nhập số!");
  }
  System.out.println("Ví vẫn mở");
}
