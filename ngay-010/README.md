# Ngày 10 · boolean & so sánh

Java 100 ngày · 2. Ra quyết định

## Bạn học gì

boolean & so sánh

## Code trong video

### NGÀY 10 · BOOLEAN & SO SÁNH

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

### SỬA MỘT DẤU — Một dấu gán hai dấu hỏi

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int soDu = 50000;
  boolean vuaDu = soDu == 45000;
  System.out.println(vuaDu);
}
```

Kết quả (máy đã chạy thật):

```text
false
```

### SO LẠI MỚI ĐỔI — Ví đổi công tắc đứng yên

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

## Đáp án câu đố Ngày 9

```java
void main() {
  String soGhe = "4";
  System.out.println(1 + 1 + soGhe);
}
```

In ra: `24`

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
