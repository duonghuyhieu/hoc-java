void main() {
  int soDu = 0;
  try {
    soDu += Integer.parseInt("200");
    soDu += Integer.parseInt("5k");
    soDu += Integer.parseInt("300");
  } catch (NumberFormatException e) {
    System.out.println(soDu);
  }
}
