# Ngày 21 · vòng lặp lồng

Java 100 ngày · 3. Lặp lại

## Bạn học gì

vòng lặp lồng

## Code trong video

### NGÀY 21 · VÒNG LẶP LỒNG

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  for (int ghe = 1; ghe <= 3; ghe++)
    System.out.print(ghe);
}
```

Kết quả (máy đã chạy thật):

```text
123
```

### VÒNG TRONG VÒNG — Bọc thêm một vòng

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  for (int day = 1; day <= 2; day++) {
    for (int ghe = 1; ghe <= 3; ghe++) {
      System.out.print(ghe);
    }
  }
}
```

Kết quả (máy đã chạy thật):

```text
123123
```

### TÁCH TỪNG DÃY — Mỗi dãy một dòng

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  for (int day = 1; day <= 2; day++) {
    for (int ghe = 1; ghe <= 3; ghe++) {
      System.out.print(ghe);
    }
    System.out.println();
  }
}
```

Kết quả (máy đã chạy thật):

```text
123
123
```

### LỖI HAY GẶP — Hai vòng chung một tên

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  for (int ghe = 1; ghe <= 2; ghe++) {
    for (int ghe = 1; ghe <= 3; ghe++) {
      System.out.print(ghe);
    }
    System.out.println();
  }
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 3: variable ghe is already defined in
method main()
```

## Đáp án câu đố Ngày 20

```java
void main() {
  for (int bai = 5; bai > 0; bai--) {
    if (bai % 2 == 0) break;
    System.out.println(bai); }
}
```

In ra: `5`

## Câu đố hôm nay

In ra mấy dòng? Đoán trước, rồi chạy thử. Đáp án ở Ngày 22.

```java
void main() {
  for (int day = 1; day <= 3; day++)
    for (int ghe = 1; ghe <= day; ghe++)
      System.out.println(ghe);
}
```

## Bài tập

In bảng cửu chương từ 2 đến 5.
