# Ngày 49 · Đa hình

Java 100 ngày · 6. Kế thừa & đa hình

## Bạn học gì

Đa hình

## Code trong video

### NGÀY 49 · ĐA HÌNH

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
class Quai { int dame() { return 10; } }
class Rong extends Quai {
  int dame() { return 50; }
}
void main() {
  Rong dich = new Rong();
  System.out.println(dich.dame());
}
```

Kết quả (máy đã chạy thật):

```text
50
```

### ĐỔI MỘT CHỮ — Cùng con rồng khác kiểu biến

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
class Quai { int dame() { return 10; } }
class Rong extends Quai {
  int dame() { return 50; }
}
void main() {
  Quai dich = new Rong();
  System.out.println(dich.dame());
}
```

Kết quả (máy đã chạy thật):

```text
50
```

### CẢ ĐÀN QUÁI — Một vòng lặp đủ mọi loại quái

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
class Quai { int dame() { return 10; } }
class Rong extends Quai {
  int dame() { return 50; } }
void main() {
  Quai[] dan = {new Quai(), new Rong()};
  for (Quai con : dan) {
    int sat = con.dame();
    System.out.println(sat);
  }
}
```

Kết quả (máy đã chạy thật):

```text
10
50
```

### LỖI HAY GẶP — Biến kiểu cha không gọi được

File `Loi1.java` — chạy: `java Loi1.java`

```java
class Quai { int dame() { return 10; } }
class Rong extends Quai {
  int dame() { return 50; }
  int phunLua() { return 90; }
}
void main() {
  Quai dich = new Rong();
  System.out.println(dich.phunLua());
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 8: cannot find symbol
```

## Đáp án câu đố Ngày 48

```java
void main() {
  String ma = new String("VIP");
  String khac = new String("VIP");
  System.out.println(ma.equals(khac));
}
```

In ra: `true`

## Câu đố hôm nay

Bạn cược in ra gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 50.

```java
void main() {
  Object kiem = "Kiếm rồng";
  System.out.println(kiem.toString());
}
```

## Bài tập

Thêm lớp QuaiBang sát thương 40 vào mảng.
