# Ngày 51 · abstract class

Java 100 ngày · 6. Kế thừa & đa hình

## Bạn học gì

abstract class

## Code trong video

### NGÀY 51 · ABSTRACT CLASS

File `Loi1.java` — chạy: `java Loi1.java`

```java
class ThanhToan {
  int phi(int gia);
}
void main() { }
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 2: missing method body, or declare
abstract
```

### MỘT CHỮ CỨU HÀM — Chữ abstract

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
abstract class ThanhToan {
  abstract int phi(int gia);
}
void main() { }
```

Đoạn này không in ra gì.

### LỚP CON VIẾT NỐT — Thẻ tính phí

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
abstract class ThanhToan {
  abstract int phi(int gia);
}
class The extends ThanhToan {
  int phi(int gia) { return gia / 100; }
}
void main() {
  ThanhToan the = new The();
  System.out.println(the.phi(100000));
}
```

Kết quả (máy đã chạy thật):

```text
1000
```

### CỘNG VÀO TIỀN VÉ — Tổng tiền đổi

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
abstract class ThanhToan {
  abstract int phi(int gia);
}
class The extends ThanhToan {
  int phi(int gia) { return gia / 100; }
}
void main() {
  int tong = 100000;
  tong += new The().phi(tong);
}
```

Đoạn này không in ra gì — trên video, ô BIẾN cho thấy giá trị đổi qua từng dòng.

### LỖI HAY GẶP — new lớp cha

File `Loi2.java` — chạy: `java Loi2.java`

```java
abstract class ThanhToan {
  abstract int phi(int gia);
}
class The extends ThanhToan {
  int phi(int gia) { return gia / 100; }
}
void main() {
  int tong = 100000;
  tong += new ThanhToan().phi(tong);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 9: ThanhToan is abstract; cannot be
instantiated
```

## Đáp án câu đố Ngày 50

```java
void main() {
  Object tin = null;
  boolean laTin = tin instanceof Object;
  System.out.println(laTin);
}
```

In ra: `false`

## Câu đố hôm nay

In số hay báo lỗi? Đoán trước, rồi chạy thử. Đáp án ở Ngày 52.

```java
void main() {
  abstract class Ve { int gia = 90000; }
  class Vip extends Ve { }
  System.out.println(new Vip().gia);
}
```

## Bài tập

Thêm lớp TienMat có phí 0 đồng.
