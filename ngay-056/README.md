# Ngày 56 · HashMap (1/2)

> Java 100 ngày · 7. Bộ sưu tập & lỗi · video 1 phút 18 giây

## Bạn học gì

HashMap (1/2): tra/ghi đè

## Đáp án câu đố Ngày 55

```java
void main() {
  Object phi = 1000;
  System.out.println(phi.equals(1000L));
}
```

In ra: `false`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 56 · HASHMAP

Cửa hàng game ghi kiếm ba trăm xu, rồi ghi lại năm trăm. Tra kiếm, bạn đoán máy in gì?

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

**Đoán trước khi chạy — Tra kiếm, in ra gì?**

- A. `300 / 500`
- B. `500`
- C. `Lỗi biên dịch`

Kết quả (máy đã chạy thật):

```text
500
```

Đáp án đúng: **B**.

Năm trăm — ba trăm biến mất không lời báo. Vì sao?

### Ý chính — HASHMAP LÀ GÌ — Bảng giá dán tường

Hóa ra HashMap là bảng giá dán tường: tên đồ là khóa, kèm một giá. Lệnh put, tức ghi, dán tên kèm giá. Còn get, tức tra, đọc tên ra giá. Mỗi tên một dòng, nên ghi lại kiếm là xóa giá cũ. Ẩn dụ gãy ở chỗ: bảng thật có thứ tự, HashMap thì không.

- **Khóa** — tên đồ, không trùng
- **put** — ghi tên kèm giá
- **get** — tra tên ra giá
- **Trùng khóa** — giá cũ bị đè

Ghi nhớ nhanh: HashMap khóa → giá trị · put ghi / ghi đè · get tra giá

### GHI ĐÈ — put trả về giá cũ

Giờ thêm khiên hai trăm, ô biến hiện hai dòng. Ghi kiếm năm trăm thì dòng kiếm đổi giá, không thêm dòng.

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

Mẹo dân code: put trả về giá bị đè, nên biết ngay mất ba trăm. Ghi ba lần, bảng vẫn hai dòng vì khóa không trùng.

### KHÓA KHÔNG CÓ — Tra món không bán

Thế còn tra rìu, món cửa hàng không bán? Số không, null, hay sập — bạn chọn đi.

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

**Đoán trước khi chạy — Rìu không bán — in gì?**

- A. `0`
- B. `null`
- C. `Lỗi khi chạy`

Kết quả (máy đã chạy thật):

```text
null
```

Đáp án đúng: **B**.

Ra null, tức chẳng có gì, máy không báo lỗi.

### LỖI HAY GẶP — Đem null đi cộng

Chính sự im lặng đó gài bẫy khi đem rìu cộng vào tổng.

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

Chương trình sập ở dòng cộng, báo lỗi con trỏ rỗng vì null không cộng được. Sửa bằng cách cho món lạ giá mặc định thay vì null.

## Tóm lại

Tóm lại: một khóa một giá, ghi lại là đè.

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
