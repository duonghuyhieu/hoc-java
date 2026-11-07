# Ngày 8 · String (2/2)

> Java 100 ngày · 2. Ra quyết định · video 1 phút 6 giây

## Bạn học gì

String (2/2): phương thức, bất biến, charAt từ 0

## Đáp án câu đố Ngày 7

```java
void main() {
  int ly = 7;
  String ghi = "Còn " + ly / 2 + ly % 2;
  System.out.println(ghi);
}
```

In ra: `Còn 31`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 8 · STRING BẤT BIẾN

Bảy ly hôm qua ra Còn ba mươi mốt. Tên này gọi lệnh viết hoa, màn hình hiện gì?

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  String ten = "linh chi";
  ten.toUpperCase();
  System.out.println(ten);
}
```

**Đoán trước khi chạy — Màn hình hiện gì?**

- A. `LINH CHI`
- B. `linh chi`
- C. `Lỗi biên dịch`

Kết quả (máy đã chạy thật):

```text
linh chi
```

Đáp án đúng: **B**.

Vẫn chữ thường, chữ hoa đi đâu?

### ĐỔI MỘT CHỖ — Gán lại vào biến

Giờ thử thêm phép gán.

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  String ten = "linh chi";
  ten = ten.toUpperCase();
  System.out.println(ten);
}
```

Kết quả (máy đã chạy thật):

```text
LINH CHI
```

Viết hoa liền, vì lệnh đó trả chuỗi mới.

### BẤT BIẾN — Tờ cũ vẫn y nguyên

Đó là vì chuỗi bất biến, như menu ép plastic: in hoa là in tờ mới.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  String ten = "linh chi";
  String banCu = ten;
  ten = ten.toUpperCase();
  System.out.println(banCu);
  System.out.println(ten);
}
```

Kết quả (máy đã chạy thật):

```text
linh chi
LINH CHI
```

Tên sang nhãn hai, bản cũ vẫn nhãn một. Khác menu: tờ hết biến giữ thì Java dọn.

### Ý chính — BA LỆNH CỦA CHUỖI — Phương thức của chuỗi

Vậy phương thức là lệnh gọi trên chuỗi, như viết hoa. Thêm length cho độ dài. Còn ký tự lấy theo vị trí.

- **toUpperCase()** — trả bản viết hoa
- **length()** — độ dài chuỗi
- **charAt(i)** — ký tự ở vị trí i

Ghi nhớ nhanh: Gọi sau dấu chấm · Bất biến chuỗi cũ giữ nguyên · Muốn giữ thì gán lại

### ẢNH ĐẠI DIỆN — Lấy chữ cái đầu

Thế ảnh đại diện cần chữ đầu, hai dòng in gì?

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
void main() {
  String ten = "LINH CHI";
  System.out.println(ten.charAt(1));
  System.out.println(ten.charAt(0));
}
```

**Đoán trước khi chạy — Hai dòng in gì?**

- A. `L / I`
- B. `I / L`
- C. `L / Lỗi khi chạy`

Kết quả (máy đã chạy thật):

```text
I
L
```

Đáp án đúng: **B**.

Ra chữ I trước: Java đếm từ số không. Chữ L ở vị trí không.

### LỖI HAY GẶP — Đi quá chữ cuối

Nhưng tên chỉ tới vị trí bảy, gọi tám là ngã.

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  String ten = "LINH CHI";
  int cuoi = ten.length();
  System.out.println(ten.charAt(cuoi));
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
StringIndexOutOfBoundsException: Index 8
out of bounds for length 8 (dòng 4)
```

Java báo chỉ số tám, độ dài tám. Mẹo: hai số bằng nhau thì trừ một.

## Tóm lại

Tóm lại: chữ hoa đi mất vì chưa gán lại.

## Câu đố hôm nay

Chữ nào hiện ra? Đoán trước, rồi chạy thử. Đáp án ở Ngày 9.

```java
void main() {
  String ten = "mai";
  ten.toUpperCase();
  System.out.println(ten.charAt(2));
}
```

## Bài tập

In ký tự cuối của một chuỗi bất kỳ bằng length() và charAt().
