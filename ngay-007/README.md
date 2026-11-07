# Ngày 7 · ÔN + mini hoá đơn trà sữa

> Java 100 ngày · 1. Dòng code đầu tiên · video 1 phút 45 giây

## Bạn học gì

ÔN + mini hoá đơn trà sữa

## Đáp án câu đố Ngày 6

```java
void main() {
  String tiSo = 1 + 1 + " - " + 1 + 1;
  System.out.println(tiSo);
}
```

In ra: `2 - 11`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 7 · ÔN + MINI HÓA ĐƠN TRÀ SỮA

Bảng hôm qua hiện hai, gạch nối, mười một.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int traSua = 45000;
  int ship = 15000;
  String dong = "Tổng " + traSua + ship;
  System.out.println(dong + "đ");
}
```

Kết quả (máy đã chạy thật):

```text
Tổng 4500015000đ
```

Trà sữa bốn mươi lăm nghìn, ship mười lăm nghìn, mà hóa đơn đòi hơn bốn tỉ đồng. Thủ phạm chỉ một dòng, bạn chỉ ra được không?

### TÍNH TRƯỚC, GHÉP SAU — Tính riêng rồi mới ghép

Vậy thủ phạm là dòng ghép chuỗi: gặp chữ Tổng trước, dấu cộng dán hai số. Mẹo dân code: tính tiền ra biến riêng, rồi mới ghép chữ. Sửa xong, hóa đơn in ra bao nhiêu?

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  int traSua = 45000;
  int ship = 15000;
  int tong = traSua + ship;
  String dong = "Tổng " + tong;
  System.out.println(dong + "đ");
}
```

**Đoán trước khi chạy — Hóa đơn giờ in gì?**

- A. `Tổng 60000đ`
- B. `Tổng 4500015000đ`
- C. `Lỗi biên dịch`

Kết quả (máy đã chạy thật):

```text
Tổng 60000đ
```

Đáp án đúng: **A**.

Sáu mươi nghìn, vì biến tổng là số nên dấu cộng tính thật.

### Ý chính — ÔN ĐỒ NGHỀ — Đồ nghề sáu ngày

Nhưng đơn thật còn nhiều khoản, mà đồ nghề sáu ngày qua là đủ. Tiền tròn đồng dùng số nguyên int. Còn phần trăm giảm giá cần double, số có phần lẻ. Dấu bằng cho tổng tự cộng từ giá trị cũ. Chia số nguyên thì rơi phần lẻ, phép lấy dư giữ phần thừa.

- **int** — tiền tròn đồng
- **double** — số có phần lẻ
- **=** — gán, cộng từ giá trị cũ
- **/ và %** — chia nguyên, lấy dư

Ghi nhớ nhanh: int số nguyên · = lệnh gán · + gặp chữ là nối

### CỘNG DỒN — Cộng dồn từng khoản

Giờ ráp cả đơn: thêm trà đào bốn mươi nghìn, tổng khởi đầu bằng ly trà sữa. Cộng trà đào, tổng lên tám mươi lăm nghìn.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  int traSua = 45000;
  int traDao = 40000;
  int ship = 15000;
  int tong = traSua;
  tong = tong + traDao;
  tong = tong + ship;
  System.out.println(tong + "đ");
}
```

Kết quả (máy đã chạy thật):

```text
100000đ
```

Cộng ship, tổng tròn một trăm nghìn đồng.

### CHIA TIỀN — Ba người chia một đơn

Khoan đã, ba người góp đơn này, mỗi người trả bao nhiêu? Chia ba và lấy dư, ra hai số nào?

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
void main() {
  int tong = 100000;
  int moiNguoi = tong / 3;
  int du = tong % 3;
  System.out.println(moiNguoi + "đ");
  System.out.println("Dư " + du + "đ");
}
```

**Đoán trước khi chạy — Mỗi người trả mấy đồng?**

- A. `33333đ / Dư 1đ`
- B. `33333.33đ / Dư 0đ`
- C. `Lỗi biên dịch`

Kết quả (máy đã chạy thật):

```text
33333đ
Dư 1đ
```

Đáp án đúng: **A**.

Mỗi người ba mươi ba nghìn ba trăm ba mươi ba đồng, vì chia nguyên bỏ phần lẻ. Một đồng thừa là phần phép lấy dư nhặt lại.

### LỖI HAY GẶP — Cất số lẻ vào int

Quay lại đơn một trăm nghìn, thêm mã giảm mười phần trăm. Nhân không phẩy một ra số lẻ, mà biến giảm giá là int.

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  int tong = 100000;
  int giam = tong * 0.1;
  System.out.println(giam + "đ");
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 3: incompatible types: possible lossy
conversion from double to int
```

Java báo có thể mất phần lẻ, kèm số dòng để bạn đọc trước. Đổi biến giảm giá sang double là hết lỗi.

### TỔNG KẾT CHẶNG: DÒNG CODE ĐẦU TIÊN

Vậy một tờ hóa đơn đã ôn gần đủ chặng đầu. Máy chạy từng lệnh, lỗi thì đọc số dòng, dấu cộng gặp chữ là nối. Lưu thẻ này lại để ôn.

- Ngày 1 · Chương trình Java đầu tiên — Máy chạy từ main, từng lệnh, đúng từng chữ.
- Ngày 2 · Đọc lỗi biên dịch — Thấy error, đọc số dòng và mô tả trước.
- Ngày 3 · Biến và các kiểu dữ liệu… — Chọn đúng kiểu, đặt tên đúng luật và dễ đọc.
- Ngày 4 · Biến — Java từ chối vì dấu bằng là lệnh gán, không phải toán.
- Ngày 5 · int/double, chia nguyên, % — Giờ bạn biết viên ngọc mất nằm ở phép lấy dư.
- Ngày 6 · String — Hai mươi ba bàn ảo sinh ra vì dấu cộng gặp chữ.

## Tóm lại

Tóm lại: tính tiền xong hẵng ghép chữ, hóa đơn khỏi thành bốn tỉ.

## Câu đố hôm nay

Màn hình hiện gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 8.

```java
void main() {
  int ly = 7;
  String ghi = "Còn " + ly / 2 + ly % 2;
  System.out.println(ghi);
}
```

## Bài tập

Viết hóa đơn 2 món + phí ship, in từng dòng có chữ «đ».
