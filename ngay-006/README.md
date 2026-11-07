# Ngày 6 · String (1/2)

> Java 100 ngày · 1. Dòng code đầu tiên · video 1 phút 5 giây

## Bạn học gì

String (1/2): nối chuỗi

## Đáp án câu đố Ngày 5

```java
void main() {
  int ngoc = 9;
  System.out.println(ngoc / 2 * 2);
  System.out.println(ngoc % 2);
}
```

In ra: `8` / `1`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 6 · STRING: NỐI CHUỖI

Đố hôm qua ra tám, rồi một.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int ban1 = 2;
  int ban2 = 3;
  String tong = "Tổng " + ban1 + ban2;
  System.out.println(tong);
}
```

Kết quả (máy đã chạy thật):

```text
Tổng 23
```

Hiệp một hai bàn, hiệp hai ba bàn, mà bảng in tổng hai mươi ba. Java sai, hay dấu cộng đang làm việc khác?

### SỬA MỘT CHỖ — Thêm đôi ngoặc

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  int ban1 = 2;
  int ban2 = 3;
  String tong = "Tổng " + (ban1 + ban2);
  System.out.println(tong);
}
```

Kết quả (máy đã chạy thật):

```text
Tổng 5
```

Nhưng bọc ngoặc quanh hai số, bảng liền in đúng năm. Mẹo dân code: có phép tính trong chuỗi thì cứ bọc ngoặc.

### Ý chính — KHÁI NIỆM — Dấu cộng có hai nghề

Còn thiếu ngoặc, chữ Tổng trong nháy kép là chuỗi, kiểu String. Dấu cộng giữa hai số thì tính, gặp chuỗi thì xâu như xâu hạt. Máy đi từ trái sang phải, nên hai và ba dính vào chữ.

- **String** — chuỗi chữ trong nháy kép
- **số + số** — tính như toán
- **chuỗi + số** — xâu nối, ra chuỗi
- **trái → phải** — làm lần lượt từng dấu +

Ghi nhớ nhanh: String chuỗi chữ · + xâu nối · trái → phải từng bước

### XÂU DẦN — Xâu bảng tỉ số

Giờ dựng bảng tỉ số từng bước, từ chuỗi đội nhà. Số hai nối vào, bảng thành đội nhà hai. Thêm đoạn cuối, đủ tỉ số.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  int ban1 = 2;
  String bang = "Đội nhà ";
  bang = bang + ban1;
  bang = bang + " - 1";
  System.out.println(bang);
}
```

Kết quả (máy đã chạy thật):

```text
Đội nhà 2 - 1
```

Khác hạt thật: mỗi lần nối, Java tạo hẳn chuỗi mới.

### BẪY TRÁI → PHẢI — Số áo là chuỗi

Chính chỗ này có bẫy: số áo là chuỗi, hai dòng in gì?

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
void main() {
  String soAo = "1";
  System.out.println(soAo + 1);
  System.out.println(1 + 1 + soAo);
}
```

**Đoán trước khi chạy — Hai dòng này in gì?**

- A. `2 / 3`
- B. `11 / 111`
- C. `11 / 21`

Kết quả (máy đã chạy thật):

```text
11
21
```

Đáp án đúng: **C**.

Dòng đầu chuỗi đứng trước, nên xâu thành mười một. Dòng sau, một cộng một ra hai trước rồi mới xâu, thành hai mươi mốt.

## Tóm lại

Tóm lại: hai mươi ba bàn ảo sinh ra vì dấu cộng gặp chữ.

## Câu đố hôm nay

Bảng hiện gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 7.

```java
void main() {
  String tiSo = 1 + 1 + " - " + 1 + 1;
  System.out.println(tiSo);
}
```

## Bài tập

Hóa đơn trà sữa: tổng tiền nối sao cho khỏi dính số?
