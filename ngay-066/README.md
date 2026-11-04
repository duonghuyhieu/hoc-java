# Ngày 66 · ÔN CẤP 2

Java 100 ngày · 7. Bộ sưu tập & lỗi

## Bạn học gì

ÔN CẤP 2

## Code trong video

### NGÀY 66 · ÔN CẤP 2

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
record CauThu(String ten) {}
void main() {
  var doi = new HashSet<CauThu>();
  doi.add(new CauThu("Long"));
  doi.add(new CauThu("Long"));
  System.out.println(doi.size());
}
```

Kết quả (máy đã chạy thật):

```text
1
```

### ĐỔI KHUÔN — record đổi thành class

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
class CauThu {
  String ten;
  CauThu(String ten) { this.ten = ten; }
}
void main() {
  var doi = new HashSet<CauThu>();
  doi.add(new CauThu("Long"));
  doi.add(new CauThu("Long"));
  System.out.println(doi.size());
}
```

Kết quả (máy đã chạy thật):

```text
2
```

### THAM CHIẾU — Hai biến một danh sách

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
record CauThu(String ten) {}
void main() {
  var doiHinh = new ArrayList<CauThu>();
  doiHinh.add(new CauThu("Long"));
  var duBi = doiHinh;
  duBi.add(new CauThu("Huy"));
  System.out.println(doiHinh.size());
}
```

Kết quả (máy đã chạy thật):

```text
2
```

### LỖI HAY GẶP — Khóa vắng trong bản đồ

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  var banThang = Map.of("Long", 2);
  int banCuaHuy = banThang.get("Huy");
  System.out.println(banCuaHuy);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
NullPointerException: Cannot invoke
"java.lang.Integer.intValue()" because the
return value of
"java.util.Map.get(Object)" is null (dòng
3)
```

## Đáp án câu đố Ngày 65

```java
void main() {
  var nhac = new StringBuilder("Pop");
  var moi = nhac.append(" Rock");
  System.out.println(nhac + "/" + moi);
}
```

In ra: `Pop Rock/Pop Rock`

## Câu đố hôm nay

Tập đếm mấy người? Đoán trước, rồi chạy thử. Đáp án ở Ngày 67.

```java
void main() {
  var doi = new HashSet<String>();
  doi.add("Long"); doi.add("long");
  System.out.println(doi.size());
}
```

## Bài tập

Lưu bàn thắng 3 cầu thủ vào HashMap, in người ghi nhiều nhất.
