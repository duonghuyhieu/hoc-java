# Ngày 52 · interface (1/2)

Java 100 ngày · 6. Kế thừa & đa hình

## Bạn học gì

interface (1/2): hợp đồng

## Code trong video

### NGÀY 52 · INTERFACE — Ký hợp đồng vẫn bị chặn

File `Loi1.java` — chạy: `java Loi1.java`

```java
interface Giao { int phi(); }
class Shipper implements Giao {
  int phi() { return 15000; }
}
void main() {
  Giao nguoiGiao = new Shipper();
  System.out.println(nguoiGiao.phi());
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 3: phi() in Shipper cannot implement
phi() in Giao
```

### THÊM MỘT CHỮ — Thiếu chữ public

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
interface Giao { int phi(); }
class Shipper implements Giao {
  public int phi() { return 15000; }
}
void main() {
  Giao nguoiGiao = new Shipper();
  System.out.println(nguoiGiao.phi());
}
```

Kết quả (máy đã chạy thật):

```text
15000
```

### MỘT BIẾN, HAI ĐƠN — Một biến kiểu hợp đồng

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
interface Giao { int phi(); }
class Shipper implements Giao {
  public int phi() { return 15000; }
}
void main() {
  Giao nguoiGiao = new Shipper();
  int tong = nguoiGiao.phi();
  tong = tong + nguoiGiao.phi();
  System.out.println(tong);
}
```

Kết quả (máy đã chạy thật):

```text
30000
```

### BẪY NGƯỜI MỚI — Việc ngoài hợp đồng

File `Loi2.java` — chạy: `java Loi2.java`

```java
interface Giao { int phi(); }
class Shipper implements Giao {
  public int phi() { return 15000; }
  int tip() { return 5000; }
}
void main() {
  Giao nguoiGiao = new Shipper();
  System.out.println(nguoiGiao.tip());
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 8: cannot find symbol
```

## Đáp án câu đố Ngày 51

```java
void main() {
  abstract class Ve { int gia = 90000; }
  class Vip extends Ve { }
  System.out.println(new Vip().gia);
}
```

In ra: `90000`

## Câu đố hôm nay

In ra mấy? Đoán trước, rồi chạy thử. Đáp án ở Ngày 53.

```java
void main() {
  CharSequence diaChi = "Quận 1";
  System.out.println(diaChi.length());
}
```

## Bài tập

Thêm lớp Drone implements Giao, phí 30.000 đồng.
