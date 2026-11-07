# Ngày 41 · Tham chiếu (2/2)

> Java 100 ngày · 5. Lớp & đối tượng · video 1 phút 23 giây

## Bạn học gì

Tham chiếu (2/2): truyền vào phương thức

## Đáp án câu đố Ngày 40

```java
void main() {
  String maVi = "AN01";
  String maBan = maVi; maBan = "BI02";
  System.out.println(maVi);
}
```

In ra: `AN01`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 41 · TRUYỀN VÀO PHƯƠNG THỨC

Mã hôm qua vẫn là AN không một. Giỏ hàng hai trăm nghìn, gọi hàm giảm ba mươi nghìn, in ra bao nhiêu?

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
class GioHang { int tong = 200000; }
void giam(int tong) { tong -= 30000; }
void main() {
  var gio = new GioHang();
  giam(gio.tong);
  System.out.println(gio.tong);
}
```

**Đoán trước khi chạy — Tổng tiền còn bao nhiêu?**

- A. `170000`
- B. `200000`
- C. `Lỗi biên dịch`

Kết quả (máy đã chạy thật):

```text
200000
```

Đáp án đúng: **B**.

Vẫn hai trăm nghìn, hàm chạy mà tiền không giảm, vì sao?

### ĐỔI THỨ ĐƯA VÀO HÀM — Đưa cả giỏ vào hàm

Giờ đưa cả giỏ vào hàm thay vì con số.

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
class GioHang { int tong = 200000; }
void giam(GioHang gio) {
  gio.tong -= 30000;
}
void main() {
  var gio = new GioHang();
  giam(gio);
  System.out.println(gio.tong);
}
```

Kết quả (máy đã chạy thật):

```text
170000
```

Hàm trừ trên tổng của giỏ đó, và lần này in ra một trăm bảy mươi nghìn. Cùng phép trừ, sao lần này trúng?

### Ý chính — LUẬT TRUYỀN THAM SỐ — Java luôn chép giá trị

Hóa ra Java luôn chép giá trị vào tham số, tức biến riêng của hàm. Truyền số nguyên int giống đưa bạn bản photo số tiền, còn truyền đối tượng giống đưa mật khẩu ví. Ẩn dụ gãy ở chỗ: mật khẩu cũng là bản chép, tham số gán sang giỏ khác thì ngoài vẫn thế.

- **Tham số** — biến riêng của hàm
- **int** — chép con số
- **Đối tượng** — chép tham chiếu
- **Gán tham số** — bên ngoài không đổi

Ghi nhớ nhanh: Bản photo số tiền · Mật khẩu ví · Tham chiếu cũng bị chép

### TỰ TAY CHÉP — Chép số chép tham chiếu

Vậy tự tay chép một lần, khỏi cần hàm. Chép số sang biến tiền rồi trừ, tiền còn một trăm bảy mươi nghìn mà giỏ đứng yên. Chép giỏ thì hai biến cùng nhãn một, tức cùng một giỏ.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
class GioHang { int tong = 200000; }
void main() {
  var gio = new GioHang();
  int tien = gio.tong;
  tien -= 30000;
  System.out.println(gio.tong);
  var thamSo = gio;
  thamSo.tong -= 30000;
  System.out.println(gio.tong);
}
```

Kết quả (máy đã chạy thật):

```text
200000
170000
```

Trừ qua tham số, giỏ thật giảm theo.

### BẪY GIỎ MỚI — Giỏ mới trong hàm

Quay lại chỗ gãy: tạo giỏ mới ngay trong hàm. Giỏ ngoài còn bao nhiêu?

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
class GioHang { int tong = 200000; }
void giam(GioHang gio) {
  gio = new GioHang();
  gio.tong -= 30000;
}
void main() {
  var gio = new GioHang();
  giam(gio);
  System.out.println(gio.tong);
}
```

**Đoán trước khi chạy — Giỏ ngoài còn bao nhiêu?**

- A. `170000`
- B. `200000`
- C. `Lỗi khi chạy`

Kết quả (máy đã chạy thật):

```text
200000
```

Đáp án đúng: **B**.

Vẫn hai trăm nghìn, vì tham số đã trỏ sang giỏ mới. Mẹo dân code: thêm final, tức cấm gán lại, trước tham số là Java chặn ngay. Còn muốn đổi số nguyên thì hàm trả số mới về rồi gán lại.

## Tóm lại

Tóm lại: mã giảm mất vì hàm chỉ trừ trên bản chép.

## Câu đố hôm nay

In ra hai trăm hay số khác? Đoán trước, rồi chạy thử. Đáp án ở Ngày 42.

```java
void main() {
  int[] tong = {200};
  int[] banSao = tong; banSao[0] = 0;
  System.out.println(tong[0]);
}
```

## Bài tập

Viết giam(GioHang gio, int tien) rồi in tổng sau khi gọi.
