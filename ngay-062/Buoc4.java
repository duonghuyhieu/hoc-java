void main() {
  int soDu = 0;
  try {
    soDu += Integer.parseInt("5k");
  } catch (NumberFormatException e) {
    System.out.println(e.getMessage());
  }
  System.out.println("Số dư: " + soDu);
}
