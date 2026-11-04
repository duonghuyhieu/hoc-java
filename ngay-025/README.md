# Ngày 25 · Phương thức (1/3)

Java 100 ngày · 4. Chia nhỏ chương trình

## Bạn học gì

Phương thức (1/3): định nghĩa & gọi

## Code trong video

### NGÀY 25 · PHƯƠNG THỨC

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  int tinhCuoc(int km) {
    return km * 12000;
  }
  System.out.println(tinhCuoc(3));
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 2: ';' expected
```

### SỬA ĐÚNG CHỖ — Đứng ngoài main

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
int tinhCuoc(int km) {
  return km * 12000;
}

void main() {
  System.out.println(tinhCuoc(3));
}
```

Kết quả (máy đã chạy thật):

```text
36000
```

### GỌI NHIỀU LẦN — Một công thức hai cuốc xe

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
int tinhCuoc(int km) {
  return km * 12000;
}

void main() {
  int tong = tinhCuoc(3);
  tong = tong + tinhCuoc(5);
  System.out.println(tong);
}
```

Kết quả (máy đã chạy thật):

```text
96000
```

### ĐỔI MỘT DÒNG — Sửa một chỗ đổi mọi cuốc

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
int tinhCuoc(int km) {
  return km * 15000;
}

void main() {
  int tong = tinhCuoc(3);
  tong = tong + tinhCuoc(5);
  System.out.println(tong);
}
```

Kết quả (máy đã chạy thật):

```text
120000
```

## Đáp án câu đố Ngày 24

```java
void main() {
  int mau = 7;
  while (mau < 20) mau = mau * 2;
  System.out.println(mau);
}
```

In ra: `28`

## Câu đố hôm nay

Cước bao nhiêu? Đoán trước, rồi chạy thử. Đáp án ở Ngày 26.

```java
void main() {
  int km = Math.max(3, 7);
  int cuoc = km * 15000;
  System.out.println(cuoc);
}
```

## Bài tập

Còn chữ void đầu chương trình, vì sao không cần trả về gì?
