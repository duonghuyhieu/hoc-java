class Vi {
  int soDu;
  Vi(int soDu) { this.soDu = soDu; }
}
void main() {
  Vi vi = new Vi(100000);
  Vi viPhu = vi;
  viPhu.soDu = 30000;
  System.out.println(vi.soDu);
}
