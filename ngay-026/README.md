# Ngày 26 · Phương thức (2/3)

Java 100 ngày · 4. Chia nhỏ chương trình

## Bạn học gì

Phương thức (2/3): tham số & giá trị trả về

## Code trong video

### NGÀY 26 · THAM SỐ & GIÁ TRỊ TRẢ VỀ

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
int sacPin(int pin) {
  return pin + 20;
}
void main() {
  int pin = 30;
  sacPin(pin);
  System.out.println(pin);
}
```

Kết quả (máy đã chạy thật):

```text
30
```

### ĐỔI MỘT DÒNG — Có chỗ nhận pin lên 50

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
int sacPin(int pin) {
  return pin + 20;
}
void main() {
  int pin = 30;
  pin = sacPin(pin);
  System.out.println(pin);
}
```

Kết quả (máy đã chạy thật):

```text
50
```

### HAI THAM SỐ — Thêm số phút nối kết quả

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
int sacPin(int pin, int phut) {
  return pin + phut * 2;
}
void main() {
  int pin = 30;
  pin = sacPin(pin, 10);
  pin = sacPin(pin, 15);
  System.out.println(sacPin(pin, 5));
}
```

Kết quả (máy đã chạy thật):

```text
90
```

### LỖI HAY GẶP — Tính xong quên trả về

File `Loi1.java` — chạy: `java Loi1.java`

```java
int sacPin(int pin, int phut) {
  int pinMoi = pin + phut * 2;
}
void main() {
  int pin = 30;
  pin = sacPin(pin, 10);
  System.out.println(pin);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 3: missing return statement
```

## Đáp án câu đố Ngày 25

```java
void main() {
  int km = Math.max(3, 7);
  int cuoc = km * 15000;
  System.out.println(cuoc);
}
```

In ra: `105000`

## Câu đố hôm nay

In ra số mấy? Đoán trước, rồi chạy thử. Đáp án ở Ngày 27.

```java
void main() {
  int pin = 70;
  Math.min(pin, 20);
  System.out.println(Math.max(pin, 35));
}
```

## Bài tập

Hai biến pin cùng tên, sao không đụng nhau?
