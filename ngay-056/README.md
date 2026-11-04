# Ngày 56 · HashMap (1/2)

Java 100 ngày · 7. Bộ sưu tập & lỗi

## Bạn học gì

HashMap (1/2): tra/ghi đè

## Code trong video

### NGÀY 56 · HASHMAP

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  var gia =
    new HashMap<String, Integer>();
  gia.put("Kiếm", 300);
  gia.put("Kiếm", 500);
  System.out.println(gia.get("Kiếm"));
}
```

Kết quả (máy đã chạy thật):

```text
500
```

### GHI ĐÈ — put trả về giá cũ

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  var gia =
    new HashMap<String, Integer>();
  gia.put("Kiếm", 300);
  gia.put("Khiên", 200);
  var giaCu = gia.put("Kiếm", 500);
  System.out.println(giaCu);
  System.out.println(gia.size());
}
```

Kết quả (máy đã chạy thật):

```text
300
2
```

### KHÓA KHÔNG CÓ — Tra món không bán

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  var gia =
    new HashMap<String, Integer>();
  gia.put("Kiếm", 300);
  gia.put("Khiên", 200);
  gia.put("Kiếm", 500);
  System.out.println(gia.get("Rìu"));
}
```

Kết quả (máy đã chạy thật):

```text
null
```

### LỖI HAY GẶP — Đem null đi cộng

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  var gia =
    new HashMap<String, Integer>();
  gia.put("Kiếm", 300);
  gia.put("Khiên", 200);
  gia.put("Kiếm", 500);
  int tong = gia.get("Kiếm");
  tong = tong + gia.get("Rìu");
  System.out.println(tong);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
NullPointerException: Cannot invoke
"java.lang.Integer.intValue()" because the
return value of
"java.util.HashMap.get(Object)" is null
(dòng 8)
```

## Đáp án câu đố Ngày 55

```java
void main() {
  Object phi = 1000;
  System.out.println(phi.equals(1000L));
}
```

In ra: `false`

## Câu đố hôm nay

Lần put thứ hai in ra gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 57.

```java
void main() {
  var kho = new HashMap<>();
  kho.put("Áo", 1);
  System.out.println(kho.put("Áo", 2));
}
```

## Bài tập

Dùng getOrDefault để món lạ có giá 0.
