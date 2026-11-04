# Ngày 57 · HashMap (2/2)

Java 100 ngày · 7. Bộ sưu tập & lỗi

## Bạn học gì

HashMap (2/2): đếm tần suất

## Code trong video

### NGÀY 57 · HASHMAP: ĐẾM TẦN SUẤT

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  String[] ghiBan = {"An", "Huy", "An"};
  Map<String, Integer> dem =
      new HashMap<>();
  for (String ten : ghiBan) {
    dem.put(ten, dem.get(ten) + 1);
  }
  System.out.println(dem);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
NullPointerException: Cannot invoke
"java.lang.Integer.intValue()" because the
return value of
"java.util.Map.get(Object)" is null (dòng
6)
```

### SỬA CHỖ SẬP — Chưa có thì coi là 0

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  String[] ghiBan = {"An", "Huy", "An"};
  Map<String, Integer> dem =
      new HashMap<>();
  for (String ten : ghiBan) {
    int cu = dem.getOrDefault(ten, 0);
    dem.put(ten, cu + 1);
  }
  System.out.println(dem);
}
```

Kết quả (máy đã chạy thật):

```text
{An=2, Huy=1}
```

### BẪY THỨ TỰ — Đổi Huy thành Vũ

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  String[] ghiBan = {"An", "Vũ", "An"};
  Map<String, Integer> dem =
      new HashMap<>();
  for (String ten : ghiBan) {
    int cu = dem.getOrDefault(ten, 0);
    dem.put(ten, cu + 1);
  }
  System.out.println(dem);
}
```

Kết quả (máy đã chạy thật):

```text
{Vũ=1, An=2}
```

### MẸO DÂN CODE — Hai dòng gom thành một

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  String[] ghiBan = {"An", "Vũ", "An"};
  Map<String, Integer> dem =
      new HashMap<>();
  for (String ten : ghiBan) {
    dem.merge(ten, 1, Integer::sum);
  }
  System.out.println(dem);
}
```

Kết quả (máy đã chạy thật):

```text
{Vũ=1, An=2}
```

## Đáp án câu đố Ngày 56

```java
void main() {
  var kho = new HashMap<>();
  kho.put("Áo", 1);
  System.out.println(kho.put("Áo", 2));
}
```

In ra: `1`

## Câu đố hôm nay

In ra mấy? Đoán trước, rồi chạy thử. Đáp án ở Ngày 58.

```java
void main() {
  var dem = new HashMap<String, Long>();
  dem.getOrDefault("An", 5L);
  System.out.println(dem.size());
}
```

## Bài tập

Đếm số lần mỗi khách đặt hàng.
