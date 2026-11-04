# Ngày 13 · && || !

Java 100 ngày · 2. Ra quyết định

## Bạn học gì

&& || !

## Code trong video

### NGÀY 13 · && || !

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  boolean coVe = true;
  int tuoi = 16;
  boolean vaoRap = coVe && tuoi >= 18;
  System.out.println(vaoRap);
}
```

Kết quả (máy đã chạy thật):

```text
false
```

### ĐỔI MỘT PHÉP — Đổi một phép

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  boolean coVe = true;
  int tuoi = 16;
  boolean vaoRap = coVe || tuoi >= 18;
  System.out.println(vaoRap);
}
```

Kết quả (máy đã chạy thật):

```text
true
```

### PHÉP ĐẢO — Đảo đúng sai

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  boolean hetVe = false;
  boolean datDuoc = !hetVe;
  hetVe = true;
  datDuoc = !hetVe;
  System.out.println(datDuoc);
}
```

Kết quả (máy đã chạy thật):

```text
false
```

### LỖI HAY GẶP — Thiếu một dấu sập lúc chạy

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  int soVe = 0;
  int tien = 0;
  if (soVe > 0 & tien / soVe < 90000) {
    System.out.println("Vé rẻ");
  } else {
    System.out.println("Chưa mua vé");
  }
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
ArithmeticException: / by zero (dòng 4)
```

### THÊM MỘT DẤU — Hai dấu là an toàn

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
void main() {
  int soVe = 0;
  int tien = 0;
  if (soVe > 0 && tien / soVe < 90000) {
    System.out.println("Vé rẻ");
  } else {
    System.out.println("Chưa mua vé");
  }
}
```

Kết quả (máy đã chạy thật):

```text
Chưa mua vé
```

## Đáp án câu đố Ngày 12

```java
void main() {
  int diem = 8; if (diem > 8) diem = 1;
  else if (diem > 5) diem = 2;
  System.out.println(diem);
}
```

In ra: `2`

## Câu đố hôm nay

Dòng cuối in ra gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 14.

```java
void main() {
  boolean coVe = true;
  boolean duTuoi = false;
  System.out.println(!(coVe && duTuoi));
}
```

## Bài tập

Giảm giá nếu là sinh viên HOẶC đơn trên 200.000, NHƯNG không phải ngày lễ. Nhớ đặt ngoặc.
