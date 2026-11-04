# Ngày 1 · Chương trình đầu tiên (void main, System.out.println), chạy java Hello.java

Java 100 ngày · 1. Dòng code đầu tiên

## Bạn học gì

Chương trình đầu tiên (void main, System.out.println), chạy java Hello.java

## Code trong video

### NGÀY 1 · CHƯƠNG TRÌNH ĐẦU TIÊN

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  System.out.Println("Pin yếu!");
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 2: cannot find symbol
```

### SỬA MỘT CHỮ — Trong IntelliJ: sout + Tab

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  System.out.println("Pin yếu!");
}
```

Kết quả (máy đã chạy thật):

```text
Pin yếu!
```

### LỖI HAY GẶP — Quên nháy kép

File `Loi2.java` — chạy: `java Loi2.java`

```java
void main() {
  System.out.println("Pin yếu!");
  System.out.println(Cắm sạc đi);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 3: ')' or ',' expected
```

### TỪ TRÊN XUỐNG — Cùng một lệnh, hai kết quả

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  int pin = 20;
  System.out.println(pin);
  pin = pin - 5;
  System.out.println(pin);
}
```

Kết quả (máy đã chạy thật):

```text
20
15
```

## Câu đố hôm nay

Mỗi dòng in gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 2.

```java
void main() {
  System.out.println(20 + 5);
  System.out.println("20 + 5");
}
```

## Bài tập

Sửa chương trình để in tên bạn và tên điện thoại bạn đang dùng trên 2 dòng.
