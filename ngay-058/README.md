# Ngày 58 · HashSet

Java 100 ngày · 7. Bộ sưu tập & lỗi

## Bạn học gì

HashSet

## Code trong video

### NGÀY 58 · HASHSET

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  var daThich = new HashSet<String>();
  daThich.add("An");
  daThich.add("Bình");
  daThich.add("An");
  System.out.println(daThich.size());
}
```

Kết quả (máy đã chạy thật):

```text
2
```

### HÉ LỘ — add biết trả lời

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  var daThich = new HashSet<String>();
  daThich.add("An");
  daThich.add("Bình");
  boolean moi = daThich.add("An");
  System.out.println(moi);
  System.out.println(daThich.size());
}
```

Kết quả (máy đã chạy thật):

```text
false
2
```

### THÊM · HỎI · GỠ — Bỏ thích rồi thích lại

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  var daThich = new HashSet<String>();
  daThich.add("An");
  daThich.remove("An");
  boolean coAn = daThich.contains("An");
  System.out.println(coAn);
  if (daThich.add("An")) {
    System.out.println("Báo: An thích");
  }
}
```

Kết quả (máy đã chạy thật):

```text
false
Báo: An thích
```

### LỖI HAY GẶP — Đòi người đầu tiên

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  var daThich = new HashSet<String>();
  daThich.add("An");
  System.out.println(daThich.get(0));
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 4: cannot find symbol
```

## Đáp án câu đố Ngày 57

```java
void main() {
  var dem = new HashMap<String, Long>();
  dem.getOrDefault("An", 5L);
  System.out.println(dem.size());
}
```

In ra: `0`

## Câu đố hôm nay

Một người hay hai? Đoán trước, rồi chạy thử. Đáp án ở Ngày 59.

```java
void main() {
  var ten = new HashSet<String>();
  ten.add("an"); ten.add("An");
  System.out.println(ten.size());
}
```

## Bài tập

Đếm số khách khác nhau từ danh sách đơn.
