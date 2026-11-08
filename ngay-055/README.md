# Ngày 55 · MINI: thanh toán Tiền mặt/Thẻ/Ví bằng đa hình

> Java 100 ngày · 6. Kế thừa & đa hình · video 1 phút 39 giây

## Bạn học gì

MINI: thanh toán Tiền mặt/Thẻ/Ví bằng đa hình

## Đáp án câu đố Ngày 54

```java
void main() {
  Object ten1 = "Mưa";
  Object ten2 = new String("Mưa");
  System.out.println(ten1.equals(ten2));
}
```

In ra: `true`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 55 · MINI: THANH TOÁN ĐA HÌNH

Câu đố qua in true: máy dùng cách so của chuỗi thật.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
interface ThanhToan { int phi(); }
class The implements ThanhToan {
  public int phi() { return 3000; } }
void main() {
  ThanhToan cachTra = new The();
  System.out.println(cachTra.phi());
}
```

Kết quả (máy đã chạy thật):

```text
3000
```

Quầy thanh toán này: biến mang kiểu hợp đồng, mà hàm phí trong hợp đồng không có ruột. Vậy ba nghìn phí kia từ đâu ra, và thêm ví điện tử phải sửa mấy dòng?

### Ý chính — KHUNG BÀI MINI — Một hợp đồng ba cách trả

Hóa ra hợp đồng thanh toán, tức interface, chỉ đòi một điều: ai ký phải biết tính phí. Tiền mặt, thẻ, ví, mỗi cách ký bằng implements rồi tự viết ruột riêng. Nên một biến kiểu hợp đồng giữ được mọi cách trả. Lúc chạy, Java nhìn đối tượng thật để chọn ruột, gọi là đa hình, nên ba nghìn là phí thẻ.

- **interface** — hợp đồng: phải có hàm phí
- **implements** — mỗi cách trả tự viết ruột
- **Kiểu hợp đồng** — một biến giữ mọi cách trả
- **Đa hình** — chạy ruột của đối tượng thật

Ghi nhớ nhanh: Tiền mặt phí 0 · Thẻ phí 3.000 · Ví điện tử phí 1.000

### ĐỔI CÁCH TRẢ — Cùng một biến đổi đối tượng

Thế còn khi khách chọn thẻ rồi đổi ý sang ví điện tử? Cùng dòng gọi phí ấy, bạn đoán máy in bao nhiêu?

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
interface ThanhToan { int phi(); }
class The implements ThanhToan {
  public int phi() { return 3000; } }
class ViDienTu implements ThanhToan {
  public int phi() { return 1000; } }
void main() {
  ThanhToan cachTra = new The();
  cachTra = new ViDienTu();
  System.out.println(cachTra.phi());
}
```

**Đoán trước khi chạy — Đổi ý giữa chừng — phí bao nhiêu?**

- A. `3000`
- B. `1000`
- C. `Lỗi biên dịch`

Kết quả (máy đã chạy thật):

```text
1000
```

Đáp án đúng: **B**.

Ra một nghìn, vì phép gán đã đưa biến sang đối tượng ví, nên hàm phí chạy ruột của ví.

### THÊM TIỀN MẶT — Main không cần một if

Vậy muốn nhận tiền mặt, chỉ cần thêm một lớp ký hợp đồng với phí bằng không. Dòng in phí giữ nguyên từng chữ, không câu if nào hỏi khách trả kiểu gì.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
interface ThanhToan { int phi(); }
class The implements ThanhToan {
  public int phi() { return 3000; } }
class TienMat implements ThanhToan {
  public int phi() { return 0; } }
void main() {
  ThanhToan cachTra = new The();
  cachTra = new TienMat();
  System.out.println(cachTra.phi());
}
```

Kết quả (máy đã chạy thật):

```text
0
```

Máy in số không, và đó là đáp án lúc đầu: thêm cách trả chỉ là thêm lớp.

### CỘNG VÀO ĐƠN — Phí cộng vào giỏ hàng

Giờ cộng phí ấy vào đơn thật: giỏ hàng hai trăm năm mươi nghìn, khách quẹt thẻ.

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
interface ThanhToan { int phi(); }
class The implements ThanhToan {
  public int phi() { return 3000; }
}
void main() {
  int tongTien = 250000;
  ThanhToan cachTra = new The();
  tongTien = tongTien + cachTra.phi();
  System.out.println(tongTien);
}
```

Kết quả (máy đã chạy thật):

```text
253000
```

Dòng cộng hỏi phí qua biến hợp đồng, thẻ trả ba nghìn, nên tổng thành hai trăm năm mươi ba nghìn.

### LỖI HAY GẶP — Gõ sai một chữ hoa

Nhưng chỉ cần viết hoa chữ p trong tên hàm phí, lớp tiền mặt coi như chưa ký đủ.

File `Loi1.java` — chạy: `java Loi1.java`

```java
interface ThanhToan { int phi(); }
class TienMat implements ThanhToan {
  public int Phi() { return 0; } }
void main() {
  ThanhToan cachTra = new TienMat();
  System.out.println(cachTra.phi());
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 2: TienMat is not abstract and does
not override abstract method phi() in
ThanhToan
```

Java chỉ vào dòng khai lớp: tiền mặt thiếu hàm phí mà hợp đồng đòi, dù nhìn như có. Sửa về p thường là ký đủ. Mẹo dân code: đặt chữ Override, tức ghi đè, ngay trên hàm, gõ sai tên là bị bắt liền.

## Tóm lại

Tóm lại: thêm cách trả là thêm lớp, không thêm if.

## Câu đố hôm nay

Bằng nhau hay không? Đoán trước, rồi chạy thử. Đáp án ở Ngày 56.

```java
void main() {
  Object phi = 1000;
  System.out.println(phi.equals(1000L));
}
```

## Bài tập

Thêm lớp TraGop phí 5.000 đồng, dòng gọi phí trong main giữ nguyên.
