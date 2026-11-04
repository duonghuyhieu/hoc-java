interface Goi { String goi(); }
interface Chup { String chup(); }
class May implements Goi, Chup {
  public String goi() { return "Alo"; }
  public String chup() { return "Ảnh"; }
}
void main() {
  System.out.println(new May().chup());
}
