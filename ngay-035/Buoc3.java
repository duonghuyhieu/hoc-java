void main() {
  String[] ten = {"Mì", "Sữa", "Bánh"};
  int[] gia = {12000, 30000, 8000};
  int[] soLuong = {3, 2, 3};
  for (int i = 0; i < ten.length; i++) {
    int tien = gia[i] * soLuong[i];
    String dong = ten[i] + ": " + tien;
    System.out.println(dong);
  }
}
