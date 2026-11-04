void main() {
  Object[] hopThu = {"Hay!", 5, 7};
  int tong = 0;
  for (Object tin : hopThu) {
    if (tin instanceof Integer luot) {
      tong = tong + luot;
    }
  }
  System.out.println(tong);
}
