# Ngày 18 · while

Java 100 ngày · 3. Lặp lại

## Bạn học gì

while

## Code trong video

### NGÀY 18 · WHILE

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int soDu = 100000;
  if (soDu >= 30000) soDu -= 30000;
  System.out.println(soDu);
}
```

Kết quả (máy đã chạy thật):

```text
70000
```

### ĐỔI MỘT CHỮ — Đổi if thành while

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  int soDu = 100000;
  while (soDu >= 30000) soDu -= 30000;
  System.out.println(soDu);
}
```

Kết quả (máy đã chạy thật):

```text
10000
```

### SOI TỪNG VÒNG — Hỏi lại mỗi vòng

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  int soDu = 100000;
  int ly = 0;
  while (soDu >= 30000) {
    soDu -= 30000;
    ly++;
  }
  System.out.println(ly + " ly");
}
```

Kết quả (máy đã chạy thật):

```text
3 ly
```

### LỖI HAY GẶP — Quên trừ tiền lặp không dừng

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  int soDu = 100000;
  int ly = 3;
  while (soDu >= 30000) {
    System.out.println(soDu / ly);
    ly--;
  }
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
33333
50000
100000
ArithmeticException: / by zero (dòng 5)
```

## Đáp án câu đố Ngày 17

```java
void main() {
  int phi = 39000;
  if (phi > 39000) { phi = 0; }
  System.out.println(phi + 20000);
}
```

In ra: `59000`

## Câu đố hôm nay

Máy dừng ở số nào? Đoán trước, rồi chạy thử. Đáp án ở Ngày 19.

```java
void main() {
  int soDu = 90000;
  while (soDu > 30000) soDu -= 30000;
  System.out.println(soDu);
}
```

## Bài tập

Gửi tiết kiệm 1 triệu, lãi 5%/năm — bao nhiêu năm thì vượt 2 triệu?
