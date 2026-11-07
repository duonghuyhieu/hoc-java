# Ngày 36 · Class & object (1/2)

> Java 100 ngày · 5. Lớp & đối tượng · video 1 phút 17 giây

## Bạn học gì

Class & object (1/2): khuôn & bánh

## Đáp án câu đố Ngày 35

```java
void main() {
  int gia = 10000;
  String dong = "Tiền: " + gia * 3;
  System.out.println(dong);
}
```

In ra: `Tiền: 30000`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 36 · CLASS & OBJECT

Đáp án là Tiền: ba mươi nghìn, vì nhân chạy trước.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
class ThuCung { String ten = "Miu"; }
void main() {
  System.out.println(new ThuCung().ten);
}
```

Kết quả (máy đã chạy thật):

```text
Miu
```

Còn đoạn này in Miu. Giờ bỏ chữ new, Miu vẫn đó, còn in được không?

### KHÁC MỘT CHỖ — Bỏ new đi

Vậy lệnh in hỏi thẳng tên thú cưng: bạn đoán hiện gì?

File `Loi1.java` — chạy: `java Loi1.java`

```java
class ThuCung { String ten = "Miu"; }
void main() {
  System.out.println(ThuCung.ten);
}
```

**Đoán trước khi chạy — Còn in được Miu không?**

- A. `Miu`
- B. `null`
- C. `Lỗi biên dịch`

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 3: non-static variable ten cannot be
referenced from a static context
```

Đáp án đúng: **C**.

Java từ chối biên dịch, dù Miu còn đó: vì sao?

### Ý chính — KHUÔN VÀ BÁNH — Một khuôn, nhiều bánh

Hóa ra class chỉ là khuôn bánh trung thu, từng cái bánh mới là đối tượng. New là động tác đúc, có đúc mới có bé để hỏi tên. Biến trong khuôn gọi là field, tức trường dữ liệu. Nhưng bánh ra lò là xong, còn đối tượng vẫn đổi nhân được.

- **class** — khuôn: quy định có ô gì
- **object** — từng cái bánh thật
- **new** — đúc một object mới
- **field** — ô dữ liệu của mỗi object

Ghi nhớ nhanh: class cái khuôn · object từng cái bánh · new đúc bánh

### KHÔNG CÓ KHUÔN — Một ô tên, hai bé

Thế còn biến thường: tên giữ chữ Miu. Bé thứ hai tới, tên bị đè thành Vàng.

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  String ten = "Miu";
  ten = "Vàng";
  System.out.println(ten);
}
```

Kết quả (máy đã chạy thật):

```text
Vàng
```

Miu mất hẳn, vì chung một ô.

### MỖI BÉ MỘT NHÂN — Hai bé, hai nhân riêng

Giờ quay về khuôn: đúc hai bé. Bé đầu Miu, bé sau Vàng. Lệnh in hỏi bé đầu, bạn đoán tên nào?

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
class ThuCung { String ten; int tuoi; }
void main() {
  ThuCung miu = new ThuCung();
  ThuCung vang = new ThuCung();
  miu.ten = "Miu";
  miu.tuoi = 2;
  vang.ten = "Vàng";
  vang.tuoi = 5;
  System.out.println(miu.ten);
}
```

**Đoán trước khi chạy — Bé đầu tên gì?**

- A. `Miu`
- B. `Vàng`
- C. `Lỗi biên dịch`

Kết quả (máy đã chạy thật):

```text
Miu
```

Đáp án đúng: **A**.

Vẫn là Miu, vì mỗi đối tượng giữ ô riêng.

### LỖI HAY GẶP — Có tên, chưa có bé

Khoan đã, quên new thì dòng này chỉ có cái tên.

File `Loi2.java` — chạy: `java Loi2.java`

```java
class ThuCung { String ten; int tuoi; }
void main() {
  ThuCung miu;
  miu.ten = "Miu";
  System.out.println(miu.ten);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 4: variable miu might not have been
initialized
```

Java báo dòng dưới: biến chưa được khởi tạo. Sửa: đúc bé ngay dòng khai báo. Mẹo dân code: class viết hoa, biến viết thường, nhìn là biết khuôn hay bé.

## Tóm lại

Tóm lại: Java từ chối vì khuôn đâu có tên.

## Câu đố hôm nay

Hiện số nào? Đoán trước, rồi chạy thử. Đáp án ở Ngày 37.

```java
void main() {
  class Meo { int tuoi = 1; }
  new Meo().tuoi = 9;
  System.out.println(new Meo().tuoi);
}
```

## Bài tập

Câu hỏi cho phần sau: mỗi bé gán tay từng ô, có cách nào gọn hơn?
