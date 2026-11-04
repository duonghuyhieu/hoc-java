# Ngày 7 · ÔN + mini hoá đơn trà sữa

Java 100 ngày · 1. Dòng code đầu tiên

## Bạn học gì

ÔN + mini hoá đơn trà sữa

## Code trong video

### NGÀY 7 · ÔN + MINI HÓA ĐƠN TRÀ SỮA

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int traSua = 45000;
  int ship = 15000;
  String dong = "Tổng " + traSua + ship;
  System.out.println(dong + "đ");
}
```

Kết quả (máy đã chạy thật):

```text
Tổng 4500015000đ
```

### TÍNH TRƯỚC, GHÉP SAU — Tính riêng rồi mới ghép

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  int traSua = 45000;
  int ship = 15000;
  int tong = traSua + ship;
  String dong = "Tổng " + tong;
  System.out.println(dong + "đ");
}
```

Kết quả (máy đã chạy thật):

```text
Tổng 60000đ
```

### CỘNG DỒN — Cộng dồn từng khoản

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  int traSua = 45000;
  int traDao = 40000;
  int ship = 15000;
  int tong = traSua;
  tong = tong + traDao;
  tong = tong + ship;
  System.out.println(tong + "đ");
}
```

Kết quả (máy đã chạy thật):

```text
100000đ
```

### CHIA TIỀN — Ba người chia một đơn

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
void main() {
  int tong = 100000;
  int moiNguoi = tong / 3;
  int du = tong % 3;
  System.out.println(moiNguoi + "đ");
  System.out.println("Dư " + du + "đ");
}
```

Kết quả (máy đã chạy thật):

```text
33333đ
Dư 1đ
```

### LỖI HAY GẶP — Cất số lẻ vào int

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  int tong = 100000;
  int giam = tong * 0.1;
  System.out.println(giam + "đ");
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 3: incompatible types: possible lossy
conversion from double to int
```

## Đáp án câu đố Ngày 6

```java
void main() {
  String tiSo = 1 + 1 + " - " + 1 + 1;
  System.out.println(tiSo);
}
```

In ra: `2 - 11`

## Câu đố hôm nay

Màn hình hiện gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 8.

```java
void main() {
  int ly = 7;
  String ghi = "Còn " + ly / 2 + ly % 2;
  System.out.println(ghi);
}
```

## Bài tập

Viết hóa đơn 2 món + phí ship, in từng dòng có chữ «đ».
