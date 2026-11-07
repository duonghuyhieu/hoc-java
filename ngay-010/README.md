# Ngày 10 · boolean & so sánh

> Java 100 ngày · 2. Ra quyết định · video 1 phút 7 giây

## Bạn học gì

boolean & so sánh

## Đáp án câu đố Ngày 9

```java
void main() {
  String soGhe = "4";
  System.out.println(1 + 1 + soGhe);
}
```

In ra: `24`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 10 · BOOLEAN & SO SÁNH

Hai mươi bốn: tính trước, dán sau. Ví năm mươi nghìn, dòng này hỏi có đúng bốn mươi lăm nghìn không.

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  int soDu = 50000;
  boolean vuaDu = soDu = 45000;
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 3: incompatible types: int cannot be
converted to boolean
```

Thiếu một ký tự, Java từ chối: bạn thấy chỗ nào?

### SỬA MỘT DẤU — Một dấu gán hai dấu hỏi

Chính chỗ này: một dấu bằng là gán, nên Java báo không đổi số sang đúng sai. Thêm dấu nữa mới là hỏi, đáp án cất trong kiểu boolean. Vậy dòng in hiện gì, chọn đi.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int soDu = 50000;
  boolean vuaDu = soDu == 45000;
  System.out.println(vuaDu);
}
```

**Đoán trước khi chạy — Dòng in hiện gì?**

- A. `false`
- B. `true`
- C. `45000`

Kết quả (máy đã chạy thật):

```text
false
```

Đáp án đúng: **A**.

Hiện false, nghĩa là sai: ví đâu có đúng số đó.

### Ý chính — BOOLEAN — Một công tắc sáu phép so sánh

Thế còn true, nghĩa là đúng? Boolean như công tắc đèn: đúng là bật, sai là tắt. Sáu phép so sánh gạt nó: lớn hơn, nhỏ hơn, hai bản kèm bằng. Còn lại: bằng nhau, khác nhau.

- **boolean** — chỉ true hoặc false
- **> <** — lớn hơn, nhỏ hơn
- **>= <=** — kèm cả bằng
- **== !=** — bằng nhau, khác nhau

Ghi nhớ nhanh: true bật: đúng · false tắt: sai · == so sánh

### SO LẠI MỚI ĐỔI — Ví đổi công tắc đứng yên

Nhưng công tắc này có cái bẫy: ví đổi, nó không tự nhảy. Mua món bốn mươi lăm nghìn: đủ tiền, công tắc bật. Trả xong ví còn năm nghìn, mà lệnh in vẫn ra true.

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  int soDu = 50000;
  int gia = 45000;
  boolean duTien = soDu >= gia;
  soDu = soDu - gia;
  System.out.println(duTien);
  duTien = soDu >= gia;
  System.out.println(duTien);
}
```

Kết quả (máy đã chạy thật):

```text
true
false
```

Phải so lại lần nữa, công tắc mới tắt. Mẹo dân code: đặt tên boolean thành câu hỏi có không.

## Tóm lại

Tóm lại: Java từ chối vì một dấu là gán, hai dấu là hỏi.

## Câu đố hôm nay

Dòng nào in true? Đoán trước, rồi chạy thử. Đáp án ở Ngày 11.

```java
void main() {
  int soDu = 5000;
  System.out.println(soDu != 5000);
  System.out.println(soDu <= 5000);
}
```

## Bài tập

In kết quả 50000 > 45000 và 5 == 5.0, giải thích.
