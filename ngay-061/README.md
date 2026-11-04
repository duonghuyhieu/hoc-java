# Ngày 61 · Sắp xếp (Collections.sort, Comparator.reverseOrder)

Java 100 ngày · 7. Bộ sưu tập & lỗi

## Bạn học gì

Sắp xếp (Collections.sort, Comparator.reverseOrder)

## Code trong video

### NGÀY 61 · SẮP XẾP

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  var gia = List.of(250, 99, 120);
  Collections.sort(gia);
  System.out.println(gia);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
UnsupportedOperationException (dòng 3)
```

### SỬA LẠI — Chép sang danh sách mở

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  var bangGia = List.of(250, 99, 120);
  var gia = new ArrayList<>(bangGia);
  Collections.sort(gia);
  System.out.println(gia);
}
```

Kết quả (máy đã chạy thật):

```text
[99, 120, 250]
```

### ĐẢO NGƯỢC — Rẻ trước, rồi lật ngược

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  var bangGia = List.of(250, 99, 120);
  var gia = new ArrayList<>(bangGia);
  Collections.sort(gia);
  gia.sort(Comparator.reverseOrder());
  System.out.println(gia);
}
```

Kết quả (máy đã chạy thật):

```text
[250, 120, 99]
```

### LỖI HAY GẶP — sort không trả về gì

File `Loi2.java` — chạy: `java Loi2.java`

```java
void main() {
  var bangGia = List.of(250, 99, 120);
  var gia = new ArrayList<>(bangGia);
  gia = Collections.sort(gia);
  gia.sort(Comparator.reverseOrder());
  System.out.println(gia);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 4: incompatible types: void cannot be
converted to ArrayList<Integer>
```

## Đáp án câu đố Ngày 60

```java
void main() {
  enum Pin { DAY, YEU, CAN }
  var pin = Pin.YEU;
  System.out.println(pin.equals("YEU"));
}
```

In ra: `false`

## Câu đố hôm nay

Xếp xong, in ra gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 62.

```java
void main() {
  var maHang = Arrays.asList("9", "10");
  Collections.sort(maHang);
  System.out.println(maHang);
}
```

## Bài tập

Sắp xếp tên các món trong giỏ theo bảng chữ cái.
