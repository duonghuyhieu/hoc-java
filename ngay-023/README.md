# Ngày 23 · Mảng (2/2)

Java 100 ngày · 3. Lặp lại

## Bạn học gì

Mảng (2/2): duyệt, tổng, lớn nhất

## Code trong video

### NGÀY 23 · DUYỆT MẢNG

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int[] xu = {25, -10, 30, 15};
  int tong = xu[0] + xu[1] + xu[2];
  System.out.println(tong);
}
```

Kết quả (máy đã chạy thật):

```text
45
```

### VÒNG DUYỆT — Không sót ô nào

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  int[] xu = {25, -10, 30, 15};
  int tong = 0;
  for (int x : xu) {
    tong += x;
  }
  System.out.println(tong);
}
```

Kết quả (máy đã chạy thật):

```text
60
```

### LỚN NHẤT — Ai giữ kỷ lục?

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  int[] xu = {25, -10, 30, 15};
  int lonNhat = 0;
  for (int x : xu) {
    if (x > lonNhat) {
      lonNhat = x;
    }
  }
  System.out.println(lonNhat);
}
```

Kết quả (máy đã chạy thật):

```text
30
```

### LỖI HAY GẶP — Mốc bằng không là cái bẫy

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
void main() {
  int[] xu = {-20, -5, -40};
  int lonNhat = 0;
  for (int x : xu) {
    if (x > lonNhat) {
      lonNhat = x;
    }
  }
  System.out.println(lonNhat);
}
```

Kết quả (máy đã chạy thật):

```text
0
```

### ĐỔI MỘT CHỖ — Lấy ô đầu làm mốc

File `Buoc5.java` — chạy: `java Buoc5.java`

```java
void main() {
  int[] xu = {-20, -5, -40};
  int lonNhat = xu[0];
  for (int x : xu) {
    if (x > lonNhat) {
      lonNhat = x;
    }
  }
  System.out.println(lonNhat);
}
```

Kết quả (máy đã chạy thật):

```text
-5
```

## Đáp án câu đố Ngày 22

```java
void main() {
  int[] gia = {40000, 15000, 60000};
  gia[gia.length - 2] = 9000;
  System.out.println(gia[1] + gia[2]);
}
```

In ra: `69000`

## Câu đố hôm nay

In ra 30 hay 60? Đoán trước, rồi chạy thử. Đáp án ở Ngày 24.

```java
void main() {
  int[] xu = {10, 20};
  for (int x : xu) { x = x * 2; }
  System.out.println(xu[0] + xu[1]);
}
```

## Bài tập

Tìm khoản chi nhỏ nhất trong tuần.
