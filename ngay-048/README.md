# Ngày 48 · Kế thừa (2/2)

Java 100 ngày · 6. Kế thừa & đa hình

## Bạn học gì

Kế thừa (2/2): override, super, @Override

## Code trong video

### NGÀY 48 · KẾ THỪA: OVERRIDE, SUPER

File `Loi1.java` — chạy: `java Loi1.java`

```java
class Khach {
  String ten;
  Khach(String ten) { this.ten = ten; }
}
class Vip extends Khach {
}
void main() {
  System.out.println(new Vip().ten);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 5: constructor Khach in class Khach
cannot be applied to given types;
```

### SỬA BẰNG SUPER — super(...) gọi hàm tạo cha

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
class Khach {
  String ten;
  Khach(String ten) { this.ten = ten; }
}
class Vip extends Khach {
  Vip(String ten) { super(ten); }
}
void main() {
  System.out.println(new Vip("An").ten);
}
```

Kết quả (máy đã chạy thật):

```text
An
```

### GHI ĐÈ — Cùng tên hàm hai kết quả

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
class Khach { int bot() { return 5; } }
class Vip extends Khach {
  @Override
  int bot() { return 15; }
}
void main() {
  int phanTram = new Khach().bot();
  phanTram = new Vip().bot();
  System.out.println(phanTram);
}
```

Kết quả (máy đã chạy thật):

```text
15
```

### GỌI LẠI CHA — super.bot() thêm phần riêng

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
class Khach { int bot() { return 7; } }
class Vip extends Khach {
  @Override
  int bot() { return super.bot() + 10; }
}
void main() {
  int phanTram = new Khach().bot();
  phanTram = new Vip().bot();
  System.out.println(phanTram);
}
```

Kết quả (máy đã chạy thật):

```text
17
```

### LỖI HAY GẶP — Đảo hai chữ thành hàm mới

File `Loi2.java` — chạy: `java Loi2.java`

```java
class Khach { int bot() { return 7; } }
class Vip extends Khach {
  @Override
  int bto() { return super.bot() + 10; }
}
void main() {
  int phanTram = new Khach().bot();
  phanTram = new Vip().bot();
  System.out.println(phanTram);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 3: method does not override or
implement a method from a supertype
```

## Đáp án câu đố Ngày 47

```java
void main() {
  class Xe { int gia() { return 9; } }
  class Vip extends Xe { }
  System.out.println(new Vip().gia());
}
```

In ra: `9`

## Câu đố hôm nay

In ra gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 49.

```java
void main() {
  String ma = new String("VIP");
  String khac = new String("VIP");
  System.out.println(ma.equals(khac));
}
```

## Bài tập

Thêm lớp KhachVang ghi đè bot(), dùng super cộng thêm 20.
