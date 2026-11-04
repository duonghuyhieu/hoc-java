class HetXu extends Exception {}
void mua(int gia) throws HetXu {
  if (gia > 100) throw new HetXu();
  System.out.println("Mua " + gia);
}
void main() {
  try { mua(30); mua(150); mua(10); }
  catch (HetXu e) {
    System.out.println("Hết xu"); }
}
