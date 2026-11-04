# Ngày 17 · MINI

Java 100 ngày · 2. Ra quyết định

## Bạn học gì

MINI: máy tính phí ship

## Code trong video

### NGÀY 17 · MÁY TÍNH PHÍ SHIP

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int tienHang = 300000;
  int phi = 30000;
  if (tienHang > 300000) { phi = 0; }
  System.out.println(phi);
}
```

Kết quả (máy đã chạy thật):

```text
30000
```

### SỬA MỘT KÝ TỰ — Thiếu một dấu bằng

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  int tienHang = 300000;
  int phi = 30000;
  if (tienHang >= 300000) { phi = 0; }
  System.out.println(phi);
}
```

Kết quả (máy đã chạy thật):

```text
0
```

### LUẬT MỘT VÀ HAI — Phí km cộng hỏa tốc

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  int km = 8;
  boolean hoaToc = true;
  int phi = 15000 + km * 3000;
  if (hoaToc) {
    phi = phi + 20000;
  }
  System.out.println(phi);
}
```

Kết quả (máy đã chạy thật):

```text
59000
```

### GHÉP ĐỦ BA LUẬT — Thêm freeship xuống cuối

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
void main() {
  int km = 8;
  int tienHang = 300000;
  boolean hoaToc = true;
  int phi = 15000 + km * 3000;
  if (hoaToc) { phi = phi + 20000; }
  if (tienHang >= 300000) { phi = 0; }
  System.out.println(phi);
}
```

Kết quả (máy đã chạy thật):

```text
0
```

### ĐỔI THỨ TỰ — Đổi chỗ hai dòng

File `Buoc5.java` — chạy: `java Buoc5.java`

```java
void main() {
  int km = 8;
  int tienHang = 300000;
  boolean hoaToc = true;
  int phi = 15000 + km * 3000;
  if (tienHang >= 300000) { phi = 0; }
  if (hoaToc) { phi = phi + 20000; }
  System.out.println(phi);
}
```

Kết quả (máy đã chạy thật):

```text
20000
```

## Đáp án câu đố Ngày 16

```java
void main() {
  String ma = new String("2580");
  boolean khop = ma == "2580";
  System.out.println(!khop);
}
```

In ra: `true`

## Câu đố hôm nay

Phí cuối là bao nhiêu? Đoán trước, rồi chạy thử. Đáp án ở Ngày 18.

```java
void main() {
  int phi = 39000;
  if (phi > 39000) { phi = 0; }
  System.out.println(phi + 20000);
}
```

## Bài tập

Viết máy tính phí ship: theo km, hỏa tốc, freeship từ 300.000 đồng.
