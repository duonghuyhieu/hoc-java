# Ngày 44 · static

Java 100 ngày · 5. Lớp & đối tượng

## Bạn học gì

static

## Code trong video

### NGÀY 44 · STATIC

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
class Ve { static int daBan = 3; }
void main() {
  System.out.println(Ve.daBan);
}
```

Kết quả (máy đã chạy thật):

```text
3
```

### BỎ STATIC — Ba vé, ba bộ đếm

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
class Ve {
  int daBan = 0;
  Ve() { daBan++; }
}
void main() {
  new Ve();
  new Ve();
  var veCuoi = new Ve();
  System.out.println(veCuoi.daBan);
}
```

Kết quả (máy đã chạy thật):

```text
1
```

### THÊM MỘT CHỮ — Thêm một chữ

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
class Ve {
  static int daBan = 0;
  Ve() { daBan++; }
}
void main() {
  new Ve();
  new Ve();
  var veCuoi = new Ve();
  System.out.println(veCuoi.daBan);
}
```

Kết quả (máy đã chạy thật):

```text
3
```

### MÃ VÉ RIÊNG — Chung một bảng, mỗi vé một mã

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
class Ve {
  static int daBan = 0;
  int ma;
  Ve() { daBan++; ma = daBan; }
}
void main() {
  int maVe = new Ve().ma;
  maVe = new Ve().ma;
  System.out.println(Ve.daBan);
}
```

Kết quả (máy đã chạy thật):

```text
2
```

### LỖI HAY GẶP — Hàm static đòi mã vé

File `Loi1.java` — chạy: `java Loi1.java`

```java
class Ve {
  static int daBan = 0;
  int ma;
  static void inMa() {
    System.out.println(ma);
  }
}
void main() {
  Ve.inMa();
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 5: non-static variable ma cannot be
referenced from a static context
```

### LẠM DỤNG STATIC — Vá bằng static?

File `Buoc5.java` — chạy: `java Buoc5.java`

```java
class Ve {
  static int daBan = 0;
  static int ma;
  static void inMa() {
    System.out.println(ma);
  }
}
void main() {
  Ve.inMa();
}
```

Kết quả (máy đã chạy thật):

```text
0
```

## Đáp án câu đố Ngày 43

```java
void main() {
  class Kho { private int vang = 7; }
  var kho = new Kho();
  System.out.println(kho.vang);
}
```

In ra: `7`

## Câu đố hôm nay

In ra mấy? Đoán trước, rồi chạy thử. Đáp án ở Ngày 45.

```java
void main() {
  class Ve { static int dem = 0; }
  new Ve().dem = 5;
  System.out.println(new Ve().dem);
}
```

## Bài tập

Thêm static int tongDoanhThu, cộng dồn mỗi khi tạo vé.
