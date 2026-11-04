# Ngày 19 · for

Java 100 ngày · 3. Lặp lại

## Bạn học gì

for

## Code trong video

### NGÀY 19 · FOR

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  for (int qua = 1; qua < 5; qua++)
    System.out.println(qua);
}
```

Kết quả (máy đã chạy thật):

```text
1
2
3
4
```

### THÊM MỘT DẤU — Thêm một dấu bằng

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  for (int qua = 1; qua <= 5; qua++)
    System.out.println(qua);
}
```

Kết quả (máy đã chạy thật):

```text
1
2
3
4
5
```

### SOI TỪNG VÒNG — Thưởng mỗi quả mười triệu

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  int thuong = 0;
  for (int qua = 1; qua <= 3; qua++) {
    thuong = thuong + 10;
  }
  System.out.println(thuong);
}
```

Kết quả (máy đã chạy thật):

```text
30
```

### BẪY LỆCH MỘT — Đếm từ 0 thừa một vòng

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
void main() {
  int thuong = 0;
  for (int qua = 0; qua <= 3; qua++) {
    thuong = thuong + 10;
  }
  System.out.println(thuong);
}
```

Kết quả (máy đã chạy thật):

```text
40
```

## Đáp án câu đố Ngày 18

```java
void main() {
  int soDu = 90000;
  while (soDu > 30000) soDu -= 30000;
  System.out.println(soDu);
}
```

In ra: `30000`

## Câu đố hôm nay

Hiện mấy số? Đoán trước, rồi chạy thử. Đáp án ở Ngày 20.

```java
void main() {
  for (int qua = 1; qua < 6; qua += 2) {
    System.out.println(qua);
  }
}
```

## Bài tập

In bảng giá 1 đến 5 vé xem bóng đá, mỗi vé 80.000 đồng.
