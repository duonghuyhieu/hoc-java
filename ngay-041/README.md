# Ngày 41 · Tham chiếu (2/2)

Java 100 ngày · 5. Lớp & đối tượng

## Bạn học gì

Tham chiếu (2/2): truyền vào phương thức

## Code trong video

### NGÀY 41 · TRUYỀN VÀO PHƯƠNG THỨC

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
class GioHang { int tong = 200000; }
void giam(int tong) { tong -= 30000; }
void main() {
  var gio = new GioHang();
  giam(gio.tong);
  System.out.println(gio.tong);
}
```

Kết quả (máy đã chạy thật):

```text
200000
```

### ĐỔI THỨ ĐƯA VÀO HÀM — Đưa cả giỏ vào hàm

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
class GioHang { int tong = 200000; }
void giam(GioHang gio) {
  gio.tong -= 30000;
}
void main() {
  var gio = new GioHang();
  giam(gio);
  System.out.println(gio.tong);
}
```

Kết quả (máy đã chạy thật):

```text
170000
```

### TỰ TAY CHÉP — Chép số chép tham chiếu

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
class GioHang { int tong = 200000; }
void main() {
  var gio = new GioHang();
  int tien = gio.tong;
  tien -= 30000;
  System.out.println(gio.tong);
  var thamSo = gio;
  thamSo.tong -= 30000;
  System.out.println(gio.tong);
}
```

Kết quả (máy đã chạy thật):

```text
200000
170000
```

### BẪY GIỎ MỚI — Giỏ mới trong hàm

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
class GioHang { int tong = 200000; }
void giam(GioHang gio) {
  gio = new GioHang();
  gio.tong -= 30000;
}
void main() {
  var gio = new GioHang();
  giam(gio);
  System.out.println(gio.tong);
}
```

Kết quả (máy đã chạy thật):

```text
200000
```

## Đáp án câu đố Ngày 40

```java
void main() {
  String maVi = "AN01";
  String maBan = maVi; maBan = "BI02";
  System.out.println(maVi);
}
```

In ra: `AN01`

## Câu đố hôm nay

In ra hai trăm hay số khác? Đoán trước, rồi chạy thử. Đáp án ở Ngày 42.

```java
void main() {
  int[] tong = {200};
  int[] banSao = tong; banSao[0] = 0;
  System.out.println(tong[0]);
}
```

## Bài tập

Viết giam(GioHang gio, int tien) rồi in tổng sau khi gọi.
