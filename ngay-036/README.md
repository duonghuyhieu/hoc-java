# Ngày 36 · Class & object (1/2)

Java 100 ngày · 5. Lớp & đối tượng

## Bạn học gì

Class & object (1/2): khuôn & bánh

## Code trong video

### NGÀY 36 · CLASS & OBJECT

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
class ThuCung { String ten = "Miu"; }
void main() {
  System.out.println(new ThuCung().ten);
}
```

Kết quả (máy đã chạy thật):

```text
Miu
```

### KHÁC MỘT CHỖ — Bỏ new đi

File `Loi1.java` — chạy: `java Loi1.java`

```java
class ThuCung { String ten = "Miu"; }
void main() {
  System.out.println(ThuCung.ten);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 3: non-static variable ten cannot be
referenced from a static context
```

### KHÔNG CÓ KHUÔN — Một ô tên, hai bé

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  String ten = "Miu";
  ten = "Vàng";
  System.out.println(ten);
}
```

Kết quả (máy đã chạy thật):

```text
Vàng
```

### MỖI BÉ MỘT NHÂN — Hai bé, hai nhân riêng

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
class ThuCung { String ten; int tuoi; }
void main() {
  ThuCung miu = new ThuCung();
  ThuCung vang = new ThuCung();
  miu.ten = "Miu";
  miu.tuoi = 2;
  vang.ten = "Vàng";
  vang.tuoi = 5;
  System.out.println(miu.ten);
}
```

Kết quả (máy đã chạy thật):

```text
Miu
```

### LỖI HAY GẶP — Có tên, chưa có bé

File `Loi2.java` — chạy: `java Loi2.java`

```java
class ThuCung { String ten; int tuoi; }
void main() {
  ThuCung miu;
  miu.ten = "Miu";
  System.out.println(miu.ten);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 4: variable miu might not have been
initialized
```

## Đáp án câu đố Ngày 35

```java
void main() {
  int gia = 10000;
  String dong = "Tiền: " + gia * 3;
  System.out.println(dong);
}
```

In ra: `Tiền: 30000`

## Câu đố hôm nay

Hiện số nào? Đoán trước, rồi chạy thử. Đáp án ở Ngày 37.

```java
void main() {
  class Meo { int tuoi = 1; }
  new Meo().tuoi = 9;
  System.out.println(new Meo().tuoi);
}
```

## Bài tập

Câu hỏi cho phần sau: mỗi bé gán tay từng ô, có cách nào gọn hơn?
