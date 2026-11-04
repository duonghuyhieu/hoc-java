# Ngày 35 · DỰ ÁN CẤP 1 (3/3)

Java 100 ngày · 4. Chia nhỏ chương trình

## Bạn học gì

DỰ ÁN CẤP 1 (3/3): máy tính tiền cửa hàng tiện lợi

## Code trong video

### NGÀY 35 · DỰ ÁN MÁY TÍNH TIỀN

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int mi = 36000, sua = 60000;
  System.out.println("Trả " + mi + sua);
}
```

Kết quả (máy đã chạy thật):

```text
Trả 3600060000
```

### TÁCH PHÉP CỘNG — Cộng riêng rồi mới in

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  int mi = 36000, sua = 60000;
  int tong = mi + sua;
  System.out.println("Trả " + tong);
}
```

Kết quả (máy đã chạy thật):

```text
Trả 96000
```

### IN TỪNG MÓN — Mỗi vòng một dòng

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  String[] ten = {"Mì", "Sữa", "Bánh"};
  int[] gia = {12000, 30000, 8000};
  int[] soLuong = {3, 2, 3};
  for (int i = 0; i < ten.length; i++) {
    int tien = gia[i] * soLuong[i];
    String dong = ten[i] + ": " + tien;
    System.out.println(dong);
  }
}
```

Kết quả (máy đã chạy thật):

```text
Mì: 36000
Sữa: 60000
Bánh: 24000
```

### TIỀN GIẢM — Tổng đi qua phương thức giảm

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
int tinhGiam(int tong) {
  if (tong >= 100000)
    return tong * 10 / 100;
  return 0;
}
void main() {
  int tong = 36000 + 60000 + 24000;
  int tra = tong - tinhGiam(tong);
  System.out.println("Trả: " + tra);
}
```

Kết quả (máy đã chạy thật):

```text
Trả: 108000
```

### LỖI HAY GẶP — Gộp phép trừ vào chuỗi

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  int tong = 120000;
  int giam = 12000;
  String dong = "Trả: " + tong - giam;
  System.out.println(dong);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 4: bad operand types for binary
operator '-'
```

### SỬA MỘT DÒNG — Bọc ngoặc thêm dòng kẻ

File `Buoc5.java` — chạy: `java Buoc5.java`

```java
void main() {
  int tong = 120000;
  int giam = 12000;
  String dong = "Trả: " + (tong - giam);
  System.out.println("-".repeat(20));
  System.out.println(dong);
}
```

Kết quả (máy đã chạy thật):

```text
--------------------
Trả: 108000
```

## Đáp án câu đố Ngày 34

```java
void main() {
  int tong = 120000;
  while (tong >= 100000) tong -= 10000;
  System.out.println(tong);
}
```

In ra: `90000`

## Câu đố hôm nay

Không ngoặc thì in ra gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 36.

```java
void main() {
  int gia = 10000;
  String dong = "Tiền: " + gia * 3;
  System.out.println(dong);
}
```

## Bài tập

Ghép ba phần thành một chương trình in trọn hóa đơn.
