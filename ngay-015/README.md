# Ngày 15 · So sánh String

Java 100 ngày · 2. Ra quyết định

## Bạn học gì

So sánh String: equals vs ==

## Code trong video

### NGÀY 15 · SO SÁNH STRING

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  String ma = new String("SALE");
  System.out.println(ma == "SALE");
}
```

Kết quả (máy đã chạy thật):

```text
false
```

### ĐỔI MỘT CHỖ — Cùng mã khác cách hỏi

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  String ma = new String("SALE");
  System.out.println(ma.equals("SALE"));
}
```

Kết quả (máy đã chạy thật):

```text
true
```

### BẪY TRÙNG HỢP — Ba mã cùng bốn chữ

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  String ma = new String("SALE");
  String maShop = "SALE";
  String maApp = "SALE";
  System.out.println(ma == maShop);
  System.out.println(maShop == maApp);
}
```

Kết quả (máy đã chạy thật):

```text
false
true
```

### LỖI HAY GẶP — Chưa nhập mã đã so

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  String ma = null;
  System.out.println(ma.equals("SALE"));
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
NullPointerException: Cannot invoke
"String.equals(Object)" because "ma" is
null (dòng 3)
```

### MẸO DÂN CODE — Chuỗi cố định đứng trước

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
void main() {
  String ma = null;
  System.out.println("SALE".equals(ma));
}
```

Kết quả (máy đã chạy thật):

```text
false
```

## Đáp án câu đố Ngày 14

```java
void main() {
  int calo = 300 + switch (8) {
    case 7, 8 -> 200; default -> 0; };
  System.out.println(calo);
}
```

In ra: `500`

## Câu đố hôm nay

In ra gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 16.

```java
void main() {
  String ma = "sale";
  System.out.println(ma.equals("SALE"));
}
```

## Bài tập

Hỏi mật khẩu, so với "123" bằng equals, in đúng hoặc sai.
