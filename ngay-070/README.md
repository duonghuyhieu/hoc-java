# Ngày 70 · Generics (2/2)

Java 100 ngày · 8. Java hiện đại

## Bạn học gì

Generics (2/2): lớp generic

## Code trong video

### NGÀY 70 · LỚP GENERIC

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
record Hop<T>(T qua) {}
void main() {
  var vang = new Hop<>(500);
  System.out.println(vang.qua() + 1);
}
```

Kết quả (máy đã chạy thật):

```text
501
```

### MỞ HỘP RA — T là chỗ trống kiểu

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
class Hop<T> {
  private T qua;
  Hop(T q) { qua = q; }
  T lay() { return qua; }
}
void main() {
  var vang = new Hop<>(500);
  System.out.println(vang.lay() + 1);
}
```

Kết quả (máy đã chạy thật):

```text
501
```

### HỘP ĐỰNG SỐ — Integer tự bóc vỏ

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
class Hop<T> {
  private T qua;
  Hop(T q) { qua = q; }
  T lay() { return qua; }
}
void main() {
  int vang = new Hop<>(500).lay();
  vang = vang + 250;
  System.out.println(vang);
}
```

Kết quả (máy đã chạy thật):

```text
750
```

### LỖI HAY GẶP — Nhãn không nhận int

File `Loi1.java` — chạy: `java Loi1.java`

```java
class Hop<T> {
  private T qua;
  Hop(T q) { qua = q; }
  T lay() { return qua; }
}
void main() {
  int vang = new Hop<int>(500).lay();
  vang = vang + 250;
  System.out.println(vang);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 7: unexpected type
```

## Đáp án câu đố Ngày 69

```java
void main() {
  var thu = List.of("50", "30");
  String s = thu.get(0) + thu.get(1);
  System.out.println(s);
}
```

In ra: `5030`

## Câu đố hôm nay

In ra gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 71.

```java
void main() {
  record Hop<T>(T qua) {}
  var hop = new Hop<>('5');
  System.out.println(hop.qua() + 1);
}
```

## Bài tập

Viết Cap<A, B> chứa hai giá trị: vật phẩm và giá bán.
