# Ngày 16 · ÔN (5 câu đố output)

Java 100 ngày · 2. Ra quyết định

## Bạn học gì

ÔN (5 câu đố output)

## Code trong video

### NGÀY 16 · ÔN (5 CÂU ĐỐ OUTPUT)

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  String pin = "20";
  System.out.println(pin + 5);
}
```

Kết quả (máy đã chạy thật):

```text
205
```

### CÂU 1 · SỬA MỘT DÒNG — Bỏ cặp nháy

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  int pin = 20;
  System.out.println(pin + 5);
}
```

Kết quả (máy đã chạy thật):

```text
25
```

### CÂU 2 · ĐOÁN SỐ PIN

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  int pin = 80;
  if (pin < 20); {
    pin = pin + 10;
  }
  System.out.println(pin);
}
```

Kết quả (máy đã chạy thật):

```text
90
```

### CÂU 3 · IN DÒNG NÀO

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
void main() {
  int pin = 15;
  boolean dangSac = false;
  if (pin < 50) {
    System.out.println("Pin vừa");
  } else if (pin < 20 && !dangSac) {
    System.out.println("Cắm sạc");
  }
}
```

Kết quả (máy đã chạy thật):

```text
Pin vừa
```

### CÂU 4 · BẪY HAY GẶP

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  int pin = 15;
  if (pin = 20) {
    System.out.println("Tiết kiệm");
  }
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 3: incompatible types: int cannot be
converted to boolean
```

## Đáp án câu đố Ngày 15

```java
void main() {
  String ma = "sale";
  System.out.println(ma.equals("SALE"));
}
```

In ra: `false`

## Câu đố hôm nay

Câu 5: in ra gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 17.

```java
void main() {
  String ma = new String("2580");
  boolean khop = ma == "2580";
  System.out.println(!khop);
}
```

## Bài tập

Ghi đáp án 5 câu ra giấy, câu 5 đối chiếu ở đầu Ngày 18.
