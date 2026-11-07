# Ngày 48 · Kế thừa (2/2)

> Java 100 ngày · 6. Kế thừa & đa hình · video 1 phút 18 giây

## Bạn học gì

Kế thừa (2/2): override, super, @Override

## Đáp án câu đố Ngày 47

```java
void main() {
  class Xe { int gia() { return 9; } }
  class Vip extends Xe { }
  System.out.println(new Vip().gia());
}
```

In ra: `9`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 48 · KẾ THỪA: OVERRIDE, SUPER

Chín nhé, lớp con rỗng vẫn có hàm cha. Lớp VIP của shop này cũng rỗng, bạn đoán in gì?

File `Loi1.java` — chạy: `java Loi1.java`

```java
class Khach {
  String ten;
  Khach(String ten) { this.ten = ten; }
}
class Vip extends Khach {
}
void main() {
  System.out.println(new Vip().ten);
}
```

**Đoán trước khi chạy — Lớp rỗng này in ra gì?**

- A. `null`
- B. `Lỗi biên dịch`
- C. `Lỗi khi chạy`

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 5: constructor Khach in class Khach
cannot be applied to given types;
```

Đáp án đúng: **B**.

Lỗi biên dịch ngay lớp rỗng, vì sao?

### SỬA BẰNG SUPER — super(...) gọi hàm tạo cha

Đó là vì Java tự gọi hàm tạo rỗng, mà cha đòi tên.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
class Khach {
  String ten;
  Khach(String ten) { this.ten = ten; }
}
class Vip extends Khach {
  Vip(String ten) { super(ten); }
}
void main() {
  System.out.println(new Vip("An").ten);
}
```

Kết quả (máy đã chạy thật):

```text
An
```

Nên con viết hàm tạo, chuyển tên lên bằng super, tức lớp cha.

### Ý chính — BA MÓN CỦA LỚP CON — Viết lại, gọi cha, gắn nhãn

Thế còn đổi cách làm? Viết lại hàm cùng tên, gọi là ghi đè, override. Như tài xế VIP gọi câu chào gốc bằng super, rồi mời nước. Nhưng tài xế lệch chữ vẫn là chào, còn Java cần nhãn Override soát.

- **override** — con viết lại hàm của cha
- **super** — gọi hàm tạo, hàm gốc của cha
- **@Override** — nhờ Java soát tên và kiểu

Ghi nhớ nhanh: override viết lại · super gọi cha · @Override nhãn soát lỗi

### GHI ĐÈ — Cùng tên hàm hai kết quả

Quay lại shop: khách thường bớt năm phần trăm.

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
class Khach { int bot() { return 5; } }
class Vip extends Khach {
  @Override
  int bot() { return 15; }
}
void main() {
  int phanTram = new Khach().bot();
  phanTram = new Vip().bot();
  System.out.println(phanTram);
}
```

Kết quả (máy đã chạy thật):

```text
15
```

Cùng hàm đó, khách VIP đẩy phần trăm lên mười lăm. Nhưng mười lăm gõ tay, cha lên bảy thì VIP đứng yên.

### GỌI LẠI CHA — super.bot() thêm phần riêng

Vậy lấy phần của cha bằng super, cộng thêm mười. Cha lên bảy, bạn đoán VIP được mấy?

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
class Khach { int bot() { return 7; } }
class Vip extends Khach {
  @Override
  int bot() { return super.bot() + 10; }
}
void main() {
  int phanTram = new Khach().bot();
  phanTram = new Vip().bot();
  System.out.println(phanTram);
}
```

**Đoán trước khi chạy — VIP được mấy phần trăm?**

- A. `15`
- B. `17`
- C. `7`

Kết quả (máy đã chạy thật):

```text
17
```

Đáp án đúng: **B**.

Mười bảy, sửa một chỗ, cả hai theo.

### LỖI HAY GẶP — Đảo hai chữ thành hàm mới

Nhưng đảo hai chữ, nó thành hàm mới, không ghi đè.

File `Loi2.java` — chạy: `java Loi2.java`

```java
class Khach { int bot() { return 7; } }
class Vip extends Khach {
  @Override
  int bto() { return super.bot() + 10; }
}
void main() {
  int phanTram = new Khach().bot();
  phanTram = new Vip().bot();
  System.out.println(phanTram);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 3: method does not override or
implement a method from a supertype
```

Nhãn Override làm Java báo: không khớp hàm nào của cha. Sửa đúng tên; thiếu nhãn thì máy im lặng in bảy. Mẹo dân code: IntelliJ bấm Control O, máy tự viết đúng tên.

## Tóm lại

Tóm lại: con gọi cha bằng super, lớp rỗng hết bị chặn.

## Câu đố hôm nay

In ra gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 49.

```java
void main() {
  String ma = new String("VIP");
  String khac = new String("VIP");
  System.out.println(ma.equals(khac));
}
```

## Bài tập

Thêm lớp KhachVang ghi đè bot(), dùng super cộng thêm 20.
