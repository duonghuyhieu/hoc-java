# Ngày 3 · Biến (1/2)

Java 100 ngày · 1. Dòng code đầu tiên

## Bạn học gì

Biến (1/2): khai báo & dùng

## Code trong video

### NGÀY 3 · BIẾN

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int mau = 100;
  System.out.println(mau - 35);
}
```

Kết quả (máy đã chạy thật):

```text
65
```

### DÙNG BIẾN — Nhãn lấy từ nhãn khác

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  int mau = 100;
  int satThuong = 35;
  int mauCon = mau - satThuong;
  System.out.println("Máu: " + mauCon);
}
```

Kết quả (máy đã chạy thật):

```text
Máu: 65
```

### SỬA MỘT SỐ — Đổi một chỗ

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  int mau = 100;
  int satThuong = 50;
  int mauCon = mau - satThuong;
  System.out.println("Máu: " + mauCon);
}
```

Kết quả (máy đã chạy thật):

```text
Máu: 50
```

### LỖI HAY GẶP — Dùng trước khi khai báo

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  System.out.println(mau);
  int mau = 100;
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 2: cannot find symbol
```

## Đáp án câu đố Ngày 2

```java
void main() {
  System.out.println("Máu: 100");;
}
```

In ra: `Máu: 100`

## Câu đố hôm nay

Số cuối là bao nhiêu? Đoán trước, rồi chạy thử. Đáp án ở Ngày 4.

```java
void main() {
  int xu = 20;
  int thuong = xu * 3;
  System.out.println(xu + thuong);
}
```

## Bài tập

Nhãn đã dán, bóc sang số khác được không?
