# Ngày 22 · Mảng (1/2)

Java 100 ngày · 3. Lặp lại

## Bạn học gì

Mảng (1/2): tạo, chỉ số, length, lỗi ngoài biên

## Code trong video

### NGÀY 22 · MẢNG

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  int[] gia = {50000, 35000, 20000};
  System.out.println(gia[3]);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
ArrayIndexOutOfBoundsException: Index 3
out of bounds for length 3 (dòng 3)
```

### SỬA MỘT SỐ — Đổi 3 thành 2

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int[] gia = {50000, 35000, 20000};
  System.out.println(gia[2]);
}
```

Kết quả (máy đã chạy thật):

```text
20000
```

### TẠO VÀ ĐẾM Ô — new và length

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  int[] gia = {50000, 35000, 20000};
  int[] giaMoi = new int[3];
  System.out.println(gia.length);
  System.out.println(giaMoi[0]);
}
```

Kết quả (máy đã chạy thật):

```text
3
0
```

### Ô CUỐI — Gán ô và tìm ô cuối

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  int[] gia = {50000, 35000, 20000};
  gia[1] = 30000;
  int cuoi = gia.length - 1;
  System.out.println(gia[cuoi]);
}
```

Kết quả (máy đã chạy thật):

```text
20000
```

## Đáp án câu đố Ngày 21

```java
void main() {
  for (int day = 1; day <= 3; day++)
    for (int ghe = 1; ghe <= day; ghe++)
      System.out.println(ghe);
}
```

In ra: `1` / `1` / `2` / `1` / `2` / `3`

## Câu đố hôm nay

Hai ô cuối cộng lại? Đoán trước, rồi chạy thử. Đáp án ở Ngày 23.

```java
void main() {
  int[] gia = {40000, 15000, 60000};
  gia[gia.length - 2] = 9000;
  System.out.println(gia[1] + gia[2]);
}
```

## Bài tập

Mảng trăm món, chẳng lẽ gõ trăm dòng in?
