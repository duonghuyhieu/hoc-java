# Ngày 67 · DỰ ÁN CẤP 2 (1/2)

Java 100 ngày · 7. Bộ sưu tập & lỗi

## Bạn học gì

DỰ ÁN CẤP 2 (1/2): Cửa hàng hướng đối tượng

## Code trong video

### NGÀY 67 · DỰ ÁN: CỬA HÀNG

File `Loi1.java` — chạy: `java Loi1.java`

```java
record Mon(String ten, int gia) {}
void main() {
  var ao = new Mon("Ao thun", 150);
  ao.gia = 0;
  System.out.println(ao.gia());
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 4: cannot assign a value to final
variable gia
```

### SỬA ĐÚNG — Muốn đổi giá? Tạo món mới

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
record Mon(String ten, int gia) {}
void main() {
  var ao = new Mon("Ao thun", 150);
  var sale = new Mon(ao.ten(), 120);
  System.out.println(sale.gia());
}
```

Kết quả (máy đã chạy thật):

```text
120
```

### DỰNG GIỎ HÀNG — Giỏ hai món cộng dồn

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
record Mon(String ten, int gia) {}
void main() {
  var ao = new Mon("Ao thun", 150);
  var mu = new Mon("Mu", 90);
  int tong = 0;
  for (var mon : List.of(ao, mu)) {
    tong = tong + mon.gia();
  }
  System.out.println(tong);
}
```

Kết quả (máy đã chạy thật):

```text
240
```

### MÃ GIẢM GIÁ — Mã giảm 10%

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
record Mon(String ten, int gia) {}
void main() {
  var ao = new Mon("Ao thun", 150);
  var mu = new Mon("Mu", 90);
  int tong = 0;
  for (var mon : List.of(ao, mu)) {
    tong = tong + mon.gia();
  }
  System.out.println(tong * (90 / 100));
}
```

Kết quả (máy đã chạy thật):

```text
0
```

### MẸO DÂN CODE — Nhân trước, chia sau

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
record Mon(String ten, int gia) {}
void main() {
  var ao = new Mon("Ao thun", 150);
  var mu = new Mon("Mu", 90);
  int tong = 0;
  for (var mon : List.of(ao, mu)) {
    tong = tong + mon.gia();
  }
  System.out.println(tong * 90 / 100);
}
```

Kết quả (máy đã chạy thật):

```text
216
```

## Đáp án câu đố Ngày 66

```java
void main() {
  var doi = new HashSet<String>();
  doi.add("Long"); doi.add("long");
  System.out.println(doi.size());
}
```

In ra: `2`

## Câu đố hôm nay

Còn bao nhiêu? Đoán trước, rồi chạy thử. Đáp án ở Ngày 68.

```java
void main() {
  int gia = 150;
  System.out.println(gia / 100 * 90);
}
```

## Bài tập

Nghĩ trước: khách thêm áo đã hết hàng, giỏ nên báo thế nào?
