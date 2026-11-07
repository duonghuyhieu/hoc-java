# Ngày 2 · Đọc lỗi biên dịch (thiếu ;, lệch ngoặc: lỗi phổ biến nhất của người mới)

> Java 100 ngày · 1. Dòng code đầu tiên · video 1 phút 2 giây

## Bạn học gì

Đọc lỗi biên dịch (thiếu ;, lệch ngoặc: lỗi phổ biến nhất của người mới)

## Đáp án câu đố Ngày 1

```java
void main() {
  System.out.println(20 + 5);
  System.out.println("20 + 5");
}
```

In ra: `25` / `20 + 5`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 2 · ĐỌC LỖI BIÊN DỊCH

Đáp án hôm qua: hai mươi lăm, rồi đúng chữ hai mươi cộng năm. Thiếu một dấu ở dòng ba, dòng hai có kịp in không?

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  System.out.println("Vào trận");
  System.out.println("Máu: 100")
}
```

**Đoán trước khi chạy — Dòng 2 có kịp in không?**

- A. `Vào trận`
- B. `Vào trận / Máu: 100`
- C. `Lỗi biên dịch`

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 3: ';' expected
```

Đáp án đúng: **C**.

Không chữ nào hiện, dù dòng hai đúng, vì sao?

### THÊM MỘT DẤU — Một dấu, cả bài chạy

Đó là vì biên dịch: Java soát cả bài trước khi chạy.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  System.out.println("Vào trận");
  System.out.println("Máu: 100");
}
```

Kết quả (máy đã chạy thật):

```text
Vào trận
Máu: 100
```

Thêm dấu chấm phẩy, cả hai dòng in. Java như thầy chấm bài, gạch đỏ đúng dòng sai.

### Ý chính — ĐỌC LỖI — Đọc lỗi theo thứ tự

Vậy thấy chữ error đừng hoảng, tìm số dòng trước. Còn expected nghĩa là Java đang chờ dấu ghi ngay trước chữ đó. Mẹo dân code: chục lỗi thì sửa lỗi đầu, biên dịch lại.

- **Số dòng** — chỗ bị gạch đỏ
- **';'** expected — thiếu chấm phẩy
- **')' or ','** expected — thiếu ngoặc đóng
- **Lỗi đầu tiên** — sửa trước, biên dịch lại

Ghi nhớ nhanh: Số dòng đọc trước · expected đang chờ · Lỗi đầu sửa trước

### LỖI HAY GẶP — Thiếu ngoặc nhọn đóng

File `Loi2.java` — chạy: `java Loi2.java`

```java
void main() {
  int mau = 100;
  mau = mau - 30;
  System.out.println("Máu: " + mau);
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 4: reached end of file while parsing
```

Khoan đã, thiếu ngoặc nhọn đóng thì thầy không ghi rõ, chỉ báo đọc hết file. Thấy báo vậy, bạn đếm lại ngoặc nhọn.

### ĐỦ NGOẶC — Đủ ngoặc, bài chạy

Giờ thêm ngoặc đó vào cuối, bài chạy ngay. Máu khởi đầu một trăm.

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  int mau = 100;
  mau = mau - 30;
  System.out.println("Máu: " + mau);
}
```

Kết quả (máy đã chạy thật):

```text
Máu: 70
```

Trúng đòn trừ ba mươi, còn bảy mươi. Cái giữ số máu là biến, ngày mai học kỹ.

## Tóm lại

Tóm lại: giờ bạn biết vì sao dòng đúng cũng không in.

## Câu đố hôm nay

Thừa một dấu: chạy hay lỗi? Đoán trước, rồi chạy thử. Đáp án ở Ngày 3.

```java
void main() {
  System.out.println("Máu: 100");;
}
```

## Bài tập

Cố ý xóa một dấu } rồi chép lại nguyên văn thông báo lỗi.
