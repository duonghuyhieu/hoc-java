# Ngày 6 · String (1/2)

Java 100 ngày · 1. Dòng code đầu tiên

## Bạn học gì

String (1/2): nối chuỗi

## Code trong video

### NGÀY 6 · STRING: NỐI CHUỖI

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

### XÂU DẦN — Xâu bảng tỉ số

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

### BẪY TRÁI → PHẢI — Số áo là chuỗi

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
void main() {
  String soAo = "1";
  System.out.println(soAo + 1);
  System.out.println(1 + 1 + soAo);
}
```

Kết quả (máy đã chạy thật):

```text
11
21
```

## Đáp án câu đố Ngày 5

```java
void main() {
  int ngoc = 9;
  System.out.println(ngoc / 2 * 2);
  System.out.println(ngoc % 2);
}
```

In ra: `8` / `1`

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
