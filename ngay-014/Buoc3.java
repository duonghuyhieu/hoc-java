void main() {
  int thu = 7;
  String buoiTap = switch (thu) {
    case 2 -> "Vai";
    case 7, 8 -> "Chạy bộ";
    default -> "Nghỉ";
  };
  System.out.println(buoiTap);
}
