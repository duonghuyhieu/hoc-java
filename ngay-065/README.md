# Ngày 65 · StringBuilder & text block

Java 100 ngày · 7. Bộ sưu tập & lỗi

## Bạn học gì

StringBuilder & text block

## Code trong video

### NGÀY 65 · STRINGBUILDER & TEXT BLOCK

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  String nhac = "Lofi";
  nhac.concat(" Chill");
  System.out.println(nhac);
}
```

Kết quả (máy đã chạy thật):

```text
Lofi
```

### ĐỔI HAI CHỮ — Đổi hai chữ, kết quả đổi

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  var nhac = new StringBuilder("Lofi");
  nhac.append(" Chill");
  System.out.println(nhac);
}
```

Kết quả (máy đã chạy thật):

```text
Lofi Chill
```

### NỐI TRONG VÒNG LẶP — Ba vòng, một tờ nháp

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  var nhac = new StringBuilder("Lofi");
  nhac.append(" Chill");
  for (int i = 1; i <= 3; i++) {
    nhac.append(" | Bài ").append(i);
  }
  System.out.println(nhac);
}
```

Kết quả (máy đã chạy thật):

```text
Lofi Chill | Bài 1 | Bài 2 | Bài 3
```

### TEXT BLOCK — Text block giữ nguyên dòng

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
void main() {
  int luotNghe = 1200;
  String theNhac = """
      Lofi Chill
      Lượt nghe: %d
      """.formatted(luotNghe);
  System.out.println(theNhac);
}
```

Kết quả (máy đã chạy thật):

```text
Lofi Chill
Lượt nghe: 1200
```

### LỖI HAY GẶP — Chữ dính dấu mở

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  int luotNghe = 1200;
  String theNhac = """Lofi Chill
      Lượt nghe: %d
      """.formatted(luotNghe);
  System.out.println(theNhac);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 3: illegal text block open delimiter
sequence, missing line terminator
```

## Đáp án câu đố Ngày 64

```java
void main() {
  int xu = 0; try { xu = 9 / xu; }
  catch (Exception e) { xu = 5; }
  System.out.println(xu);
}
```

In ra: `5`

## Câu đố hôm nay

In ra gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 66.

```java
void main() {
  var nhac = new StringBuilder("Pop");
  var moi = nhac.append(" Rock");
  System.out.println(nhac + "/" + moi);
}
```

## Bài tập

In danh sách 5 bài hát bằng StringBuilder, mỗi bài một dòng.
