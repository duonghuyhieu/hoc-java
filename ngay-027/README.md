# Ngày 27 · Phương thức (3/3)

Java 100 ngày · 4. Chia nhỏ chương trình

## Bạn học gì

Phương thức (3/3): tách bài toán

## Code trong video

### NGÀY 27 · TÁCH BÀI TOÁN

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int tien = 2 * 120000 + 65000;
  System.out.println(tien - 20000);
}
```

Kết quả (máy đã chạy thật):

```text
285000
```

### TÁCH TRẠM ĐẦU — Tiền vé ra phương thức

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
int tienVe(int soVe) {
  return soVe * 120000;
}
void main() {
  int tien = tienVe(2) + 65000;
  tien = tien - 20000;
  System.out.println(tien);
}
```

Kết quả (máy đã chạy thật):

```text
285000
```

### TÁCH NỐT — Hai mươi nghìn có tên

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
int tienVe(int soVe) {
  return soVe * 120000;
}
int giamGia(int tien) {
  return tien - 20000;
}
void main() {
  int tien = tienVe(2) + 65000;
  System.out.println(giamGia(tien));
}
```

Kết quả (máy đã chạy thật):

```text
285000
```

### LỖI HAY GẶP — Main nhồi đầy trùng tên biến

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  int tien = 2 * 120000;
  System.out.println(tien);
  int tien = 65000;
  System.out.println(tien);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 4: variable tien is already defined
in method main()
```

## Đáp án câu đố Ngày 26

```java
void main() {
  int pin = 70;
  Math.min(pin, 20);
  System.out.println(Math.max(pin, 35));
}
```

In ra: `70`

## Câu đố hôm nay

Số cuối là gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 28.

```java
void main() {
  int veRe = Math.min(90000, 120000);
  int veDat = Math.max(veRe, 100000);
  System.out.println(veDat - veRe);
}
```

## Bài tập

Tách bài hoá đơn N7 thành 3 phương thức.
