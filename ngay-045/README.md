# Ngày 45 · final

Java 100 ngày · 5. Lớp & đối tượng

## Bạn học gì

final

## Code trong video

### NGÀY 45 · FINAL

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  final var xe = new ArrayList<>();
  xe.add("Áo");
  System.out.println(xe);
}
```

Kết quả (máy đã chạy thật):

```text
[Áo]
```

### ĐỔI HẲN XE — Thêm đúng một dòng

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  final var xe = new ArrayList<>();
  xe.add("Áo");
  xe = new ArrayList<>();
  System.out.println(xe);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 4: cannot assign a value to final
variable xe
```

### ĐỔI HÀNG TRÊN XE — Hàng đổi, xe vẫn một

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  final var xe = new ArrayList<>();
  xe.add("Áo");
  xe.add("Sách");
  xe.remove(0);
  xe.add("Trà");
  System.out.println(xe);
}
```

Kết quả (máy đã chạy thật):

```text
[Sách, Trà]
```

### TRƯỜNG FINAL & HẰNG — Biển riêng, hằng chung

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
class Xe {
  static final int SUC_CHUA = 30;
  final String bienSo;
  Xe(String so) { bienSo = so; }
}
void main() {
  var xe = new Xe("29A-123");
  System.out.println(xe.bienSo);
  System.out.println(Xe.SUC_CHUA);
}
```

Kết quả (máy đã chạy thật):

```text
29A-123
30
```

### LỖI HAY GẶP — Danh sách cấm sửa

File `Loi2.java` — chạy: `java Loi2.java`

```java
void main() {
  final var xe = List.of("Áo");
  xe.add("Sách");
  System.out.println(xe);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
UnsupportedOperationException (dòng 3)
```

## Đáp án câu đố Ngày 44

```java
void main() {
  class Ve { static int dem = 0; }
  new Ve().dem = 5;
  System.out.println(new Ve().dem);
}
```

In ra: `5`

## Câu đố hôm nay

In ra mấy hay lỗi? Đoán trước, rồi chạy thử. Đáp án ở Ngày 46.

```java
void main() {
  final int[] kien = {1, 2};
  kien[0] = 9;
  System.out.println(kien[0] + kien[1]);
}
```

## Bài tập

Khai báo hằng PHI_SHIP và cộng vào tiền một đơn hàng.
