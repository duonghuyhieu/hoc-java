# Ngày 20 · break/continue

Java 100 ngày · 3. Lặp lại

## Bạn học gì

break/continue

## Code trong video

### NGÀY 20 · BREAK/CONTINUE

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  for (int bai = 1; bai <= 5; bai++) {
    if (bai == 3) break;
    System.out.println(bai);
  }
}
```

Kết quả (máy đã chạy thật):

```text
1
2
```

### HAI ĐOẠN, MỘT CHỮ — Đổi đúng một chữ

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  for (int bai = 1; bai <= 5; bai++) {
    if (bai == 3) continue;
    System.out.println(bai);
  }
}
```

Kết quả (máy đã chạy thật):

```text
1
2
4
5
```

### ĐẾM BÀI ĐÃ NGHE — Vòng bị bỏ không được đếm

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  int daNghe = 0;
  for (int bai = 1; bai <= 5; bai++) {
    if (bai == 3) {
      continue;
    }
    daNghe = daNghe + 1;
  }
  System.out.println(daNghe);
}
```

Kết quả (máy đã chạy thật):

```text
4
```

### LỖI HAY GẶP — Sau continue là ngõ cụt

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  for (int bai = 1; bai <= 5; bai++) {
    if (bai == 3) {
      continue;
      System.out.println("Bỏ bài 3");
    }
    System.out.println(bai);
  }
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 5: unreachable statement
```

## Đáp án câu đố Ngày 19

```java
void main() {
  for (int qua = 1; qua < 6; qua += 2) {
    System.out.println(qua);
  }
}
```

In ra: `1` / `3` / `5`

## Câu đố hôm nay

Màn hình hiện gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 21.

```java
void main() {
  for (int bai = 5; bai > 0; bai--) {
    if (bai % 2 == 0) break;
    System.out.println(bai); }
}
```

## Bài tập

In các số 1–20, bỏ số chia hết cho 3, dừng khi gặp 17.
