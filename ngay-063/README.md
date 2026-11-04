# Ngày 63 · Exception (2/3)

Java 100 ngày · 7. Bộ sưu tập & lỗi

## Bạn học gì

Exception (2/3): finally

## Code trong video

### NGÀY 63 · FINALLY

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  try {
    System.out.println("Giữ ghế A5");
    int moiNguoi = 270 / 0;
  } catch (ArithmeticException e) {
    return;
  }
  System.out.println("Nhả ghế A5");
}
```

Kết quả (máy đã chạy thật):

```text
Giữ ghế A5
```

### SỬA MỘT CHỖ — Dời vào finally

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  try {
    System.out.println("Giữ ghế A5");
    int moiNguoi = 270 / 0;
  } catch (ArithmeticException e) {
    return;
  } finally {
    System.out.println("Nhả ghế A5");
  }
}
```

Kết quả (máy đã chạy thật):

```text
Giữ ghế A5
Nhả ghế A5
```

### TRY + FINALLY — Không cần catch

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  int gheTrong = 50;
  try {
    gheTrong = gheTrong - 2;
    System.out.println("Đã đặt 2 vé");
  } finally {
    System.out.println("Khóa quầy");
  }
  System.out.println(gheTrong);
}
```

Kết quả (máy đã chạy thật):

```text
Đã đặt 2 vé
Khóa quầy
48
```

### LỖI HAY GẶP — Dọn dẹp ngoài finally

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  int gheTrong = 50;
  try {
    gheTrong = gheTrong / 0;
    System.out.println("Đã đặt 2 vé");
  } finally {
    System.out.println("Khóa quầy");
  }
  System.out.println(gheTrong);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Khóa quầy
ArithmeticException: / by zero (dòng 4)
```

## Đáp án câu đố Ngày 62

```java
void main() {
  try { Integer.parseInt("+5"); }
  catch (Exception e) { return; }
  System.out.println("Hợp lệ");
}
```

In ra: `Hợp lệ`

## Câu đố hôm nay

In ra năm hay sáu? Đoán trước, rồi chạy thử. Đáp án ở Ngày 64.

```java
void main() {
  int soVe = 2;
  try { soVe += 3; } finally { soVe++; }
  System.out.println(soVe);
}
```

## Bài tập

Muốn tự ném lỗi khi khách đặt quá số ghế thì viết thế nào?
