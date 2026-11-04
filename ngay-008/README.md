# Ngày 8 · String (2/2)

Java 100 ngày · 2. Ra quyết định

## Bạn học gì

String (2/2): phương thức, bất biến, charAt từ 0

## Code trong video

### NGÀY 8 · STRING BẤT BIẾN

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  String ten = "linh chi";
  ten.toUpperCase();
  System.out.println(ten);
}
```

Kết quả (máy đã chạy thật):

```text
linh chi
```

### ĐỔI MỘT CHỖ — Gán lại vào biến

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  String ten = "linh chi";
  ten = ten.toUpperCase();
  System.out.println(ten);
}
```

Kết quả (máy đã chạy thật):

```text
LINH CHI
```

### BẤT BIẾN — Tờ cũ vẫn y nguyên

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  String ten = "linh chi";
  String banCu = ten;
  ten = ten.toUpperCase();
  System.out.println(banCu);
  System.out.println(ten);
}
```

Kết quả (máy đã chạy thật):

```text
linh chi
LINH CHI
```

### ẢNH ĐẠI DIỆN — Lấy chữ cái đầu

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
void main() {
  String ten = "LINH CHI";
  System.out.println(ten.charAt(1));
  System.out.println(ten.charAt(0));
}
```

Kết quả (máy đã chạy thật):

```text
I
L
```

### LỖI HAY GẶP — Đi quá chữ cuối

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  String ten = "LINH CHI";
  int cuoi = ten.length();
  System.out.println(ten.charAt(cuoi));
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
StringIndexOutOfBoundsException: Index 8
out of bounds for length 8 (dòng 4)
```

## Đáp án câu đố Ngày 7

```java
void main() {
  int ly = 7;
  String ghi = "Còn " + ly / 2 + ly % 2;
  System.out.println(ghi);
}
```

In ra: `Còn 31`

## Câu đố hôm nay

Chữ nào hiện ra? Đoán trước, rồi chạy thử. Đáp án ở Ngày 9.

```java
void main() {
  String ten = "mai";
  ten.toUpperCase();
  System.out.println(ten.charAt(2));
}
```

## Bài tập

In ký tự cuối của một chuỗi bất kỳ bằng length() và charAt().
