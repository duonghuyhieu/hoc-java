# Ngày 33 · DỰ ÁN CẤP 1 (1/3)

Java 100 ngày · 4. Chia nhỏ chương trình

## Bạn học gì

DỰ ÁN CẤP 1 (1/3): máy tính tiền cửa hàng tiện lợi

## Code trong video

### NGÀY 33 · DỰ ÁN CẤP 1

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int tong = 85000;
  int giam = tong * (10 / 100);
  System.out.println(tong - giam);
}
```

Kết quả (máy đã chạy thật):

```text
85000
```

### ĐỔI THỨ TỰ — Nhân trước, chia sau

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  int tong = 85000;
  int giam = tong * 10 / 100;
  System.out.println(tong - giam);
}
```

Kết quả (máy đã chạy thật):

```text
76500
```

### CỘNG HÓA ĐƠN — Giá nhân số lượng

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  int[] gia = {15000, 25000, 10000};
  int[] soLuong = {2, 1, 3};
  int tong = 0;
  for (int i = 0; i < gia.length; i++) {
    tong = tong + gia[i] * soLuong[i];
  }
  System.out.println(tong);
}
```

Kết quả (máy đã chạy thật):

```text
85000
```

### TÁCH GIẢM GIÁ — Một việc, một phương thức

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
int giamGia(int tong) {
  return tong * 10 / 100;
}
void main() {
  int tong = 85000;
  int giam = giamGia(tong);
  System.out.println(tong - giam);
}
```

Kết quả (máy đã chạy thật):

```text
76500
```

## Đáp án câu đố Ngày 32

```java
void main() {
  int[] luot = {2, 4};
  var tong = luot[0] + luot[1];
  System.out.println(tong + 1 + " lần");
}
```

In ra: `7 lần`

## Câu đố hôm nay

Khách trả bao nhiêu? Đoán trước, rồi chạy thử. Đáp án ở Ngày 34.

```java
void main() {
  int tong = 150;
  int giam = tong / 100 * 10;
  System.out.println(tong - giam);
}
```

## Bài tập

Chỉ hóa đơn từ 100.000 đồng mới được giảm thì sửa chỗ nào?
