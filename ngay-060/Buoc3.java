enum CheDo { CHUONG, RUNG, IM_LANG }
void main() {
  var cheDo = CheDo.CHUONG;
  cheDo = CheDo.IM_LANG;
  var chon = CheDo.valueOf("IM_LANG");
  System.out.println(cheDo == chon);
  System.out.println(cheDo);
}
