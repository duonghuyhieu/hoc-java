# Ngày 50 · instanceof có pattern

Java 100 ngày · 6. Kế thừa & đa hình

## Bạn học gì

instanceof có pattern

## Code trong video

### NGÀY 50 · INSTANCEOF CÓ PATTERN

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  Object tin = 99;
  String chu = (String) tin;
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
ClassCastException: class
java.lang.Integer cannot be cast to class
java.lang.String (java.lang.Integer and
java.lang.String are in module java.base
of loader 'bootstrap') (dòng 3)
```

### SỬA MỘT DÒNG — Hỏi kiểu trước

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  Object tin = 99;
  if (tin instanceof String chu) {
    System.out.println(chu.length());
  }
  System.out.println("Không sập");
}
```

Kết quả (máy đã chạy thật):

```text
Không sập
```

### CỘNG LƯỢT THÍCH — Chữ bỏ qua số cộng dồn

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  Object[] hopThu = {"Hay!", 5, 7};
  int tong = 0;
  for (Object tin : hopThu) {
    if (tin instanceof Integer luot) {
      tong = tong + luot;
    }
  }
  System.out.println(tong);
}
```

Kết quả (máy đã chạy thật):

```text
12
```

### LỌC GỌN — Dùng ngay trong điều kiện

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  Object tin = "Lan thích ảnh";
  if (tin instanceof String chu
      && chu.length() > 5) {
    System.out.println("Tin dài");
  }
}
```

Kết quả (máy đã chạy thật):

```text
Tin dài
```

### LỖI HAY GẶP — Đổi một phép là hết chạy

File `Loi2.java` — chạy: `java Loi2.java`

```java
void main() {
  Object tin = "Lan thích ảnh";
  if (tin instanceof String chu
      || chu.length() > 5) {
    System.out.println("Tin dài");
  }
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 4: cannot find symbol
```

## Đáp án câu đố Ngày 49

```java
void main() {
  Object kiem = "Kiếm rồng";
  System.out.println(kiem.toString());
}
```

In ra: `Kiếm rồng`

## Câu đố hôm nay

In true hay false? Đoán trước, rồi chạy thử. Đáp án ở Ngày 51.

```java
void main() {
  Object tin = null;
  boolean laTin = tin instanceof Object;
  System.out.println(laTin);
}
```

## Bài tập

Nếu tin là Integer thì in gấp đôi số đó.
