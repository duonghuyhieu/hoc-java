# Ngày 43 · Đóng gói

Java 100 ngày · 5. Lớp & đối tượng

## Bạn học gì

Đóng gói: private, getter, kiểm tra dữ liệu (dựng 2 file)

## Code trong video

### NGÀY 43 · ĐÓNG GÓI

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
class NhanVat { int mau = 100; }
void main() {
  var nhanVat = new NhanVat();
  nhanVat.mau = -500;
  System.out.println(nhanVat.mau);
}
```

Kết quả (máy đã chạy thật):

```text
-500
```

### SỬA NGAY — Thêm một chữ private

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
class NhanVat { private int mau = 100; }
void main() {
  var nhanVat = new NhanVat();
  nhanVat.mau = -500;
  System.out.println(nhanVat.mau);
}
```

Kết quả (máy đã chạy thật):

```text
-500
```

### GETTER — Getter chỉ cho xem

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
class NhanVat {
  private int mau = 100;
  int getMau() { return mau; }
}
void main() {
  var nhanVat = new NhanVat();
  int banChep = nhanVat.getMau();
  banChep = -500;
  System.out.println(nhanVat.getMau());
}
```

Kết quả (máy đã chạy thật):

```text
100
```

### KIỂM TRA DỮ LIỆU — Quầy kiểm tra

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
class NhanVat {
  private int mau = 100;
  void hoiMau(int luong) {
    if (luong > 0) mau += luong;
    System.out.println(mau);
  }
}
void main() {
  new NhanVat().hoiMau(-500);
}
```

Kết quả (máy đã chạy thật):

```text
100
```

## Đáp án câu đố Ngày 42

```java
void main() {
  String maGiam = null;
  System.out.println(maGiam + "!");
}
```

In ra: `null!`

## Câu đố hôm nay

Ra 7 hay lỗi? Đoán trước, rồi chạy thử. Đáp án ở Ngày 44.

```java
void main() {
  class Kho { private int vang = 7; }
  var kho = new Kho();
  System.out.println(kho.vang);
}
```

## Bài tập

Thêm hàm truMau(int) không cho máu tụt dưới 0.
