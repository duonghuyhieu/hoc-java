// Cố ý sai — chạy để xem lỗi như trong video.
enum CheDo { CHUONG, RUNG, IM_LANG }
void main() {
  var nhap = "im_lang";
  var cheDo = CheDo.valueOf(nhap);
  System.out.println(cheDo);
}
