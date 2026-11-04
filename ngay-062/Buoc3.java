void main() {
  int soDu = 0;
  try {
    soDu += Integer.parseInt("5k");
  } catch (Exception e) {}
  System.out.println("Số dư: " + soDu);
}
