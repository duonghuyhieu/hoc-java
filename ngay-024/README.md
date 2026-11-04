# Ngày 24 · Ôn tập chặng Lặp lại

Java 100 ngày · 3. Lặp lại

## Bạn học gì

Ôn tập chặng Lặp lại

## Code trong video

### NGÀY 24 · ÔN TẬP CHẶNG LẶP LẠI

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int mau = 100;
  while (mau > 0) mau -= 30;
  System.out.println(mau);
}
```

Kết quả (máy đã chạy thật):

```text
-20
```

### WHILE — While chỉ hỏi ở đầu vòng

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  int mau = 100;
  while (mau > 0) {
    mau = mau - 30;
  }
  System.out.println(mau);
}
```

Kết quả (máy đã chạy thật):

```text
-20
```

### GHÉP CẢ BỐN — Một trận đủ mọi lệnh

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  int[] cacDon = {20, 0, 35, 50};
  int mau = 50;
  for (int don : cacDon) {
    if (don == 0) continue;
    mau = mau - don;
    if (mau <= 0) break;
  }
  System.out.println(mau);
}
```

Kết quả (máy đã chạy thật):

```text
-5
```

### ĐỔI MỘT CHỮ — break thành continue

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
void main() {
  int[] cacDon = {20, 0, 35, 50};
  int mau = 50;
  for (int don : cacDon) {
    if (don == 0) continue;
    mau = mau - don;
    if (mau <= 0) continue;
  }
  System.out.println(mau);
}
```

Kết quả (máy đã chạy thật):

```text
-55
```

### VÒNG LỒNG — break thoát mấy tầng?

File `Buoc5.java` — chạy: `java Buoc5.java`

```java
void main() {
  for (int dot = 1; dot <= 2; dot++) {
    for (int con = 1; con <= 3; con++) {
      if (con == 2) break;
      System.out.println(dot);
    }
  }
}
```

Kết quả (máy đã chạy thật):

```text
1
2
```

### LỖI HAY GẶP — Dùng .length, đừng gõ số

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  int[] cacDon = {20, 35, 50};
  int tong = 0;
  for (int i = 0; i <= 3; i++) {
    tong = tong + cacDon[i];
  }
  System.out.println(tong);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
ArrayIndexOutOfBoundsException: Index 3
out of bounds for length 3 (dòng 5)
```

## Đáp án câu đố Ngày 23

```java
void main() {
  int[] xu = {10, 20};
  for (int x : xu) { x = x * 2; }
  System.out.println(xu[0] + xu[1]);
}
```

In ra: `30`

## Câu đố hôm nay

Dừng ở số mấy? Đoán trước, rồi chạy thử. Đáp án ở Ngày 25.

```java
void main() {
  int mau = 7;
  while (mau < 20) mau = mau * 2;
  System.out.println(mau);
}
```

## Bài tập

Đếm số đòn trúng trong mảng 5 đòn, gặp đòn trên 100 thì dừng.
