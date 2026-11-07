# Ngày 51 · abstract class

> Java 100 ngày · 6. Kế thừa & đa hình · video 1 phút 19 giây

## Bạn học gì

abstract class

## Đáp án câu đố Ngày 50

```java
void main() {
  Object tin = null;
  boolean laTin = tin instanceof Object;
  System.out.println(laTin);
}
```

In ra: `false`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 51 · ABSTRACT CLASS

Hôm qua ra false: giá trị rỗng chẳng thuộc kiểu nào.

File `Loi1.java` — chạy: `java Loi1.java`

```java
class ThanhToan {
  int phi(int gia);
}
void main() { }
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 2: missing method body, or declare
abstract
```

Còn đây, hàm tính phí vé không có ruột, Java từ chối. Một chữ cứu được nó, chữ gì?

### MỘT CHỮ CỨU HÀM — Chữ abstract

Chữ abstract, tức trừu tượng: hàm chỉ có tên, không ruột. Có hàm trừu tượng thì cả lớp phải ghi abstract.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
abstract class ThanhToan {
  abstract int phi(int gia);
}
void main() { }
```

Đoạn này không in ra gì.

Nhưng hàm rỗng ruột thì tính phí kiểu gì?

### Ý chính — ABSTRACT CLASS — Lớp chung, chưa đủ ruột

Hóa ra cha khỏi cần tính: phương thức thanh toán chung chung không tự trả tiền. Phải là thẻ hay tiền mặt, tức lớp con nối bằng extends viết đủ. Ẩn dụ gãy ở chỗ: lớp này vẫn có hàm thường, làm kiểu biến được.

- **abstract class** — lớp chung, chưa hoàn chỉnh
- **extends** — lớp con viết đủ hàm thiếu
- **Hàm thường** — có sẵn, lớp con dùng luôn
- **Kiểu biến** — khai báo được, không new được

Ghi nhớ nhanh: abstract chưa có ruột · extends con viết đủ · new chỉ lớp con

### LỚP CON VIẾT NỐT — Thẻ tính phí

Giờ thẻ viết ruột hàm phí: một phần trăm giá. Biến kiểu cha giữ thẻ, vé một trăm nghìn in bao nhiêu?

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
abstract class ThanhToan {
  abstract int phi(int gia);
}
class The extends ThanhToan {
  int phi(int gia) { return gia / 100; }
}
void main() {
  ThanhToan the = new The();
  System.out.println(the.phi(100000));
}
```

**Đoán trước khi chạy — Vé 100.000, in ra gì?**

- A. `1000`
- B. `0`
- C. `Lỗi biên dịch`

Kết quả (máy đã chạy thật):

```text
1000
```

Đáp án đúng: **A**.

Ra một nghìn: cha chỉ hứa, thẻ mới tính. Mẹo: lớp con báo đỏ, bấm Alt Enter trong IntelliJ để tự sinh khung hàm.

### CỘNG VÀO TIỀN VÉ — Tổng tiền đổi

Vậy tổng tiền bắt đầu một trăm nghìn. Cộng phí thẻ vào, tổng thành một trăm lẻ một nghìn.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
abstract class ThanhToan {
  abstract int phi(int gia);
}
class The extends ThanhToan {
  int phi(int gia) { return gia / 100; }
}
void main() {
  int tong = 100000;
  tong += new The().phi(tong);
}
```

Đoạn này không in ra gì — trên video, ô BIẾN cho thấy giá trị đổi qua từng dòng.

Đổi phương thức chỉ cần thay tên lớp con.

### LỖI HAY GẶP — new lớp cha

Nhưng thay bằng chính lớp cha thì hỏng.

File `Loi2.java` — chạy: `java Loi2.java`

```java
abstract class ThanhToan {
  abstract int phi(int gia);
}
class The extends ThanhToan {
  int phi(int gia) { return gia / 100; }
}
void main() {
  int tong = 100000;
  tong += new ThanhToan().phi(tong);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 9: ThanhToan is abstract; cannot be
instantiated
```

Java báo ngay lúc biên dịch: lớp trừu tượng không new được. Sửa: new lớp con cụ thể.

## Tóm lại

Tóm lại: abstract cứu hàm không ruột, lớp con viết nốt.

## Câu đố hôm nay

In số hay báo lỗi? Đoán trước, rồi chạy thử. Đáp án ở Ngày 52.

```java
void main() {
  abstract class Ve { int gia = 90000; }
  class Vip extends Ve { }
  System.out.println(new Vip().gia);
}
```

## Bài tập

Thêm lớp TienMat có phí 0 đồng.
