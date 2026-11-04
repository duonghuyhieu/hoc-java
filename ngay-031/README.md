# Ngày 31 · ArrayList (2/2)

Java 100 ngày · 4. Chia nhỏ chương trình

## Bạn học gì

ArrayList (2/2): remove(int) vs remove(Object), Integer vs int

## Code trong video

### NGÀY 31 · ARRAYLIST: REMOVE

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  var maDo = List.of(10, 20, 30);
  var tui = new ArrayList<>(maDo);
  tui.remove(1);
  System.out.println(tui);
}
```

Kết quả (máy đã chạy thật):

```text
[10, 30]
```

### ĐỔI MỘT CHỖ — Vẫn số 1 khác kiểu

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  var maDo = List.of(10, 20, 30);
  var tui = new ArrayList<>(maDo);
  tui.remove(Integer.valueOf(1));
  System.out.println(tui);
}
```

Kết quả (máy đã chạy thật):

```text
[10, 20, 30]
```

### DÙNG CẢ HAI — Vị trí trước giá trị sau

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  var maDo = List.of(10, 20, 30);
  var tui = new ArrayList<>(maDo);
  tui.remove(1);
  tui.remove(Integer.valueOf(10));
  System.out.println(tui);
}
```

Kết quả (máy đã chạy thật):

```text
[30]
```

### LỖI HAY GẶP — Có mã 10 vẫn sập

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  var maDo = List.of(10, 20, 30);
  var tui = new ArrayList<>(maDo);
  tui.remove(10);
  System.out.println(tui);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
IndexOutOfBoundsException: Index 10 out of
bounds for length 3 (dòng 4)
```

## Đáp án câu đố Ngày 30

```java
void main() {
  var ban = new ArrayList<Integer>();
  ban.add(1); ban.add(7); ban.remove(1);
  System.out.println(ban);
}
```

In ra: `[1]`

## Câu đố hôm nay

Túi còn gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 32.

```java
void main() {
  var tui = new ArrayList<>(List.of(1));
  Integer ma = 1; tui.remove(ma);
  System.out.println(tui);
}
```

## Bài tập

Xóa đúng giá trị 30 khỏi danh sách [30, 10, 20].
