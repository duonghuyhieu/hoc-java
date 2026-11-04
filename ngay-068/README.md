# Ngày 68 · DỰ ÁN CẤP 2 (2/2)

Java 100 ngày · 7. Bộ sưu tập & lỗi

## Bạn học gì

DỰ ÁN CẤP 2 (2/2): Cửa hàng hướng đối tượng

## Code trong video

### NGÀY 68 · DỰ ÁN: CỬA HÀNG (2/2) — Hết hàng vẫn vào giỏ

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int ton = 0;
  var gio = new ArrayList<String>();
  gio.add("Pate meo");
  System.out.println(gio);
}
```

Kết quả (máy đã chạy thật):

```text
[Pate meo]
```

### BỌC VÀO GIỎ — Luật nằm trong giỏ

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
record Gio(List<String> ds) {
  void them(String ten, int ton) {
    if (ton > 0) ds.add(ten);
  }
}
void main() {
  var gio = new Gio(new ArrayList<>());
  gio.them("Pate meo", 0);
  System.out.println(gio.ds());
}
```

Kết quả (máy đã chạy thật):

```text
[]
```

### ĐỔI MỘT SỐ — Record mà vẫn thêm được?

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
record Gio(List<String> ds) {
  void them(String ten, int ton) {
    if (ton > 0) ds.add(ten);
  }
}
void main() {
  var gio = new Gio(new ArrayList<>());
  gio.them("Pate meo", 3);
  System.out.println(gio.ds());
}
```

Kết quả (máy đã chạy thật):

```text
[Pate meo]
```

### LỖI HAY GẶP — Ném mà không khai báo

File `Loi1.java` — chạy: `java Loi1.java`

```java
record Gio(List<String> ds) {
  void them(String ten, int ton) {
    if (ton == 0)
      throw new Exception("Het hang");
    ds.add(ten);
  }
}
void main() {
  var gio = new Gio(new ArrayList<>());
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 4: unreported exception Exception;
must be caught or declared to be thrown
```

## Đáp án câu đố Ngày 67

```java
void main() {
  int gia = 150;
  System.out.println(gia / 100 * 90);
}
```

In ra: `90`

## Câu đố hôm nay

Tự in ra gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 69.

```java
void main() {
  record Gio(List<String> ds) {}
  var gio = new Gio(List.of("Pate"));
  System.out.println(gio);
}
```

## Bài tập

Viết lớp Kho: bán thì trừ tồn, hết thì ném lỗi, main bắt và in «Het hang».
