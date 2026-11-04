# Ngày 29 · var

Java 100 ngày · 4. Chia nhỏ chương trình

## Bạn học gì

var

## Code trong video

### NGÀY 29 · VAR

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  var giaBan = 250000;
  giaBan = 199000;
  System.out.println(giaBan);
}
```

Kết quả (máy đã chạy thật):

```text
199000
```

### ĐỔI MỘT DÒNG — Số thành chữ

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  var giaBan = 250000;
  giaBan = "hết hàng";
  System.out.println(giaBan);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 3: incompatible types: String cannot
be converted to int
```

### TỰ SUY KIỂU — Java đọc vế phải

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  var soLuong = 2;
  var giaBan = 199000;
  var tiLe = 0.5;
  var canTra = soLuong * giaBan * tiLe;
  canTra = canTra - 99000;
  System.out.println(canTra);
}
```

Kết quả (máy đã chạy thật):

```text
100000.0
```

### LỖI HAY GẶP — Khai trống không suy được

File `Loi2.java` — chạy: `java Loi2.java`

```java
void main() {
  var maGiam;
  maGiam = "GIAM50";
  System.out.println(maGiam);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 2: cannot infer type for local
variable maGiam
```

## Đáp án câu đố Ngày 28

```java
void main() {
  int buoc = 6000;
  if (buoc > 5000) { int them = 500; }
  System.out.println(buoc);
}
```

In ra: `6000`

## Câu đố hôm nay

Màn hình hiện số mấy? Đoán trước, rồi chạy thử. Đáp án ở Ngày 30.

```java
void main() {
  var soMon = 7;
  var moiHop = soMon / 2;
  System.out.println(moiHop);
}
```

## Bài tập

Viết lại bài Ngày 3 bằng var, gán thử chuỗi vào biến số rồi đọc lỗi.
