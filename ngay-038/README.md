# Ngày 38 · Constructor & this

Java 100 ngày · 5. Lớp & đối tượng

## Bạn học gì

Constructor & this

## Code trong video

### NGÀY 38 · CONSTRUCTOR & THIS

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
class Phim {
  String ten;
  Phim(String ten) { ten = ten; }
}
void main() {
  var phim = new Phim("Mai");
  System.out.println(phim.ten);
}
```

Kết quả (máy đã chạy thật):

```text
null
```

### THÊM MỘT CHỮ — Thêm this là có tên

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
class Phim {
  String ten;
  Phim(String ten) { this.ten = ten; }
}
void main() {
  var phim = new Phim("Mai");
  System.out.println(phim.ten);
}
```

Kết quả (máy đã chạy thật):

```text
Mai
```

### HAI ĐƠN — Mỗi new một đối tượng

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
class Phim {
  String ten;
  Phim(String ten) { this.ten = ten; }
}
void main() {
  var mai = new Phim("Mai");
  var dangXem = mai;
  dangXem = new Phim("Đào");
  System.out.println(dangXem.ten);
}
```

Kết quả (máy đã chạy thật):

```text
Đào
```

### LỖI HAY GẶP — Đơn thiếu tên phim

File `Loi1.java` — chạy: `java Loi1.java`

```java
class Phim {
  String ten;
  Phim(String ten) { this.ten = ten; }
}
void main() {
  var phim = new Phim();
  System.out.println(phim.ten);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 6: constructor Phim in class Phim
cannot be applied to given types;
```

## Đáp án câu đố Ngày 37

```java
void main() {
  class Rong { int mau = 100; }
  Rong lua = new Rong();
  System.out.println(lua == new Rong());
}
```

In ra: `false`

## Câu đố hôm nay

In ra số nào? Đoán trước, rồi chạy thử. Đáp án ở Ngày 39.

```java
void main() {
  class Phim { int sao = 3;
    Phim(int sao) { sao = 5; } }
  System.out.println(new Phim(9).sao);
}
```

## Bài tập

Thêm trường daXem (boolean) vào constructor của Phim.
