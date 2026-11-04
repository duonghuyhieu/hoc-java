interface Goi {
  default String goi() { return "Alo"; }
}
interface Chup { String chup(); }
class May implements Goi, Chup {
  public String chup() { return "Ảnh"; }
}
void main() {
  System.out.println(new May().goi());
}
