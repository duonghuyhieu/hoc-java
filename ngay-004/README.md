# Ngày 4 · Biến (2/2)

Java 100 ngày · 1. Dòng code đầu tiên

## Bạn học gì

Biến (2/2): gán lại, = không phải «bằng»

## Code trong video

### NGÀY 4 · GÁN LẠI BIẾN

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  int soDu = 100000;
  100000 - 35000 = soDu;
  System.out.println(soDu);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 3: unexpected type
```

### SỬA MỘT DÒNG — Đưa tên biến sang trái

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int soDu = 100000;
  soDu = soDu - 35000;
  System.out.println(soDu);
}
```

Kết quả (máy đã chạy thật):

```text
65000
```

### GÁN LẠI — Ví chỉ nhớ số mới nhất

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  int soDu = 100000;
  soDu = soDu - 35000;
  soDu = soDu + 20000;
  System.out.println(soDu);
}
```

Kết quả (máy đã chạy thật):

```text
85000
```

## Đáp án câu đố Ngày 3

```java
void main() {
  int xu = 20;
  int thuong = xu * 3;
  System.out.println(xu + thuong);
}
```

In ra: `80`

## Câu đố hôm nay

Màn hình hiện số nào? Đoán trước, rồi chạy thử. Đáp án ở Ngày 5.

```java
void main() {
  int soDu = 50000;
  soDu = soDu + soDu;
  System.out.println(soDu + soDu);
}
```

## Bài tập

Ví có 200000đ, mua 2 món 45000đ, rồi được hoàn 10000đ — in số dư sau mỗi bước.
