# Ngày 34 · DỰ ÁN CẤP 1 (2/3)

Java 100 ngày · 4. Chia nhỏ chương trình

## Bạn học gì

DỰ ÁN CẤP 1 (2/3): máy tính tiền cửa hàng tiện lợi

## Code trong video

### NGÀY 34 · DỰ ÁN CẤP 1 (2/3)

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int tong = 100000;
  System.out.println(tong > 100000);
}
```

Kết quả (máy đã chạy thật):

```text
false
```

### ĐỔI MỘT DẤU — Thêm dấu bằng

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  int tong = 100000;
  System.out.println(tong >= 100000);
}
```

Kết quả (máy đã chạy thật):

```text
true
```

### TẠM TÍNH — Cộng dồn giá × số lượng

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  int[] gia = {15000, 10000, 20000};
  int[] soLuong = {2, 1, 3};
  int tong = 0;
  for (int i = 0; i < gia.length; i++) {
    tong += gia[i] * soLuong[i];
  }
  System.out.println(tong);
}
```

Kết quả (máy đã chạy thật):

```text
100000
```

### TIỀN PHẢI TRẢ — Tổng trừ giảm

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
int giam(int tong) {
  if (tong >= 100000) {
    return tong * 10 / 100;
  }
  return 0;
}
void main() {
  int tong = 100000;
  System.out.println(tong - giam(tong));
}
```

Kết quả (máy đã chạy thật):

```text
90000
```

### LỖI HAY GẶP — Xóa dòng trả về không

File `Loi1.java` — chạy: `java Loi1.java`

```java
int giam(int tong) {
  if (tong >= 100000) {
    return tong * 10 / 100;
  }
}
void main() {
  int tong = 100000;
  System.out.println(tong - giam(tong));
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 5: missing return statement
```

## Đáp án câu đố Ngày 33

```java
void main() {
  int tong = 150;
  int giam = tong / 100 * 10;
  System.out.println(tong - giam);
}
```

In ra: `140`

## Câu đố hôm nay

Dừng ở số nào? Đoán trước, rồi chạy thử. Đáp án ở Ngày 35.

```java
void main() {
  int tong = 120000;
  while (tong >= 100000) tong -= 10000;
  System.out.println(tong);
}
```

## Bài tập

Tờ hóa đơn in từng món kèm tiền thì viết sao?
