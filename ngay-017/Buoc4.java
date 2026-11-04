void main() {
  int km = 8;
  int tienHang = 300000;
  boolean hoaToc = true;
  int phi = 15000 + km * 3000;
  if (hoaToc) { phi = phi + 20000; }
  if (tienHang >= 300000) { phi = 0; }
  System.out.println(phi);
}
