# Ngày 59 · record

Java 100 ngày · 7. Bộ sưu tập & lỗi

## Bạn học gì

record

## Code trong video

### NGÀY 59 · RECORD — Hạ giá cuốc xe?

File `Loi1.java` — chạy: `java Loi1.java`

```java
record Cuoc(String den, int gia) {}
void main() {
  var sang = new Cuoc("Hồ Tây", 90000);
  sang.setGia(70000);
  System.out.println(sang);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 4: cannot find symbol
```

### GIÁ MỚI, PHIẾU MỚI — Không sửa, tạo cuốc mới

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
record Cuoc(String den, int gia) {}
void main() {
  var sang = new Cuoc("Hồ Tây", 90000);
  var giam = new Cuoc("Hồ Tây", 70000);
  System.out.println(giam);
}
```

Kết quả (máy đã chạy thật):

```text
Cuoc[den=Hồ Tây, gia=70000]
```

### SO HAI CUỐC — Giống hệt có là một?

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
record Cuoc(String den, int gia) {}
void main() {
  var sang = new Cuoc("Hồ Tây", 90000);
  var toi = new Cuoc("Hồ Tây", 90000);
  System.out.println(sang == toi);
  System.out.println(sang.equals(toi));
  System.out.println(toi.gia());
}
```

Kết quả (máy đã chạy thật):

```text
false
true
90000
```

## Đáp án câu đố Ngày 58

```java
void main() {
  var ten = new HashSet<String>();
  ten.add("an"); ten.add("An");
  System.out.println(ten.size());
}
```

In ra: `2`

## Câu đố hôm nay

Dòng in ra trông thế nào? Đoán trước, rồi chạy thử. Đáp án ở Ngày 60.

```java
void main() {
  record Xe(String bien, int cho) {}
  var xe = new Xe("29A", 7);
  System.out.println(xe);
}
```

## Bài tập

Tạo record Khach(String ten, String sdt) và so sánh hai khách.
