# Ngày 47 · Kế thừa (1/2)

Java 100 ngày · 6. Kế thừa & đa hình

## Bạn học gì

Kế thừa (1/2): extends

## Code trong video

### NGÀY 47 · KẾ THỪA

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
class TaiXe {
  String chao() { return "Chào"; } }
class Vip extends TaiXe { }
void main() {
  System.out.println(new Vip().chao());
}
```

Kết quả (máy đã chạy thật):

```text
Chào
```

### BỎ MỘT CỤM — Bỏ extends

File `Loi1.java` — chạy: `java Loi1.java`

```java
class TaiXe {
  String chao() { return "Chào"; } }
class Vip { }
void main() {
  System.out.println(new Vip().chao());
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 5: cannot find symbol
```

### NỐI TAY — Thêm lời mời bằng tay

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
class TaiXe {
  String chao() { return "Chào"; } }
class Vip extends TaiXe { }
void main() {
  Vip taiXe = new Vip();
  String loiChao = taiXe.chao();
  loiChao = loiChao + ", mời nước";
  System.out.println(loiChao);
}
```

Kết quả (máy đã chạy thật):

```text
Chào, mời nước
```

### GHI ĐÈ — Ghi đè, giữ lời cha

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
class TaiXe {
  String chao() { return "Chào"; } }
class Vip extends TaiXe {
  @Override String chao() {
    return super.chao() + ", mời nước";
  }
}
void main() {
  System.out.println(new Vip().chao());
}
```

Kết quả (máy đã chạy thật):

```text
Chào, mời nước
```

### GÕ NHẦM MỘT CHỮ — C hoa hay c thường

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
class TaiXe {
  String chao() { return "Chào"; } }
class Vip extends TaiXe {
  String Chao() {
    return super.chao() + ", mời nước";
  }
}
void main() {
  System.out.println(new Vip().chao());
}
```

Kết quả (máy đã chạy thật):

```text
Chào
```

### LỖI HAY GẶP — @Override bắt lỗi gõ sai

File `Loi2.java` — chạy: `java Loi2.java`

```java
class TaiXe {
  String chao() { return "Chào"; } }
class Vip extends TaiXe {
  @Override String Chao() {
    return super.chao() + ", mời nước";
  }
}
void main() {
  System.out.println(new Vip().chao());
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 4: method does not override or
implement a method from a supertype
```

## Đáp án câu đố Ngày 46

```java
void main() {
  int[] viGoc = {50000};
  int[] viPhu = {50000};
  System.out.println(viGoc == viPhu);
}
```

In ra: `false`

## Câu đố hôm nay

In ra số mấy? Đoán trước, rồi chạy thử. Đáp án ở Ngày 48.

```java
void main() {
  class Xe { int gia() { return 9; } }
  class Vip extends Xe { }
  System.out.println(new Vip().gia());
}
```

## Bài tập

Lớp cha có hàm tạo nhận tên, lớp VIP gọi thế nào?
