# Ngày 70 · Generics (2/2)

> Java 100 ngày · 8. Java hiện đại · video 1 phút 44 giây

## Bạn học gì

Generics (2/2): lớp generic

## Đáp án câu đố Ngày 69

```java
void main() {
  var thu = List.of("50", "30");
  String s = thu.get(0) + thu.get(1);
  System.out.println(s);
}
```

In ra: `5030`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 70 · LỚP GENERIC

Hôm qua ra năm không ba không: chuỗi nối chuỗi. Hộp phần thưởng này chẳng hề biết bên trong là số, vậy lấy ra cộng một được gì, bạn đoán đi?

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
record Hop<T>(T qua) {}
void main() {
  var vang = new Hop<>(500);
  System.out.println(vang.qua() + 1);
}
```

**Đoán trước khi chạy — Cộng một ra gì?**

- A. `501`
- B. `5001`
- C. `Lỗi biên dịch`

Kết quả (máy đã chạy thật):

```text
501
```

Đáp án đúng: **A**.

Ra năm trăm lẻ một, cộng đúng kiểu số, vậy chữ T kia đã làm phép gì?

### MỞ HỘP RA — T là chỗ trống kiểu

Hóa ra T chỉ là một chỗ trống dành cho kiểu, gọi là tham số kiểu, đặt ngay sau tên lớp. Mở ra thành lớp đầy đủ, T đứng ba chỗ: món quà, tham số tạo hộp, giá trị trả về.

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
class Hop<T> {
  private T qua;
  Hop(T q) { qua = q; }
  T lay() { return qua; }
}
void main() {
  var vang = new Hop<>(500);
  System.out.println(vang.lay() + 1);
}
```

Kết quả (máy đã chạy thật):

```text
501
```

Lúc tạo hộp với năm trăm, Java tự điền T là số nguyên Integer, nên lấy ra cộng được ngay.

### Ý chính — LỚP GENERIC — Hộp quà dán nhãn kiểu

Vậy công thức có hai bước: đặt chỗ trống T sau tên lớp, rồi dùng T làm kiểu bên trong. Đến lúc tạo hộp mới điền kiểu vào, như dán nhãn loại hàng: nhãn String thì chỉ nhận chữ, nhét số là bị trả. Nhãn ấy chỉ trình biên dịch đọc, chạy rồi là bị bóc, nên đừng hỏi hộp lúc chạy xem nó dán nhãn gì. Cần hai ngăn thì khai hai chỗ trống; mẹo dân code: đặt tên một chữ hoa, T kiểu, K khóa, V giá trị.

- **Hop<T>** — khai báo chỗ trống kiểu
- **T bên trong** — kiểu cho trường, tham số, trả về
- **Hop<String>** — điền kiểu lúc tạo hộp
- **<K, V>** — nhiều chỗ trống cùng lúc

Ghi nhớ nhanh: T chỗ trống · Hop<String> chỉ đựng chữ · <A, B> hai ngăn

### HỘP ĐỰNG SỐ — Integer tự bóc vỏ

Quay lại hộp vàng: lấy món ra gán thẳng vào biến số nguyên, chẳng cần ép kiểu, số vàng là năm trăm. Đó là nhờ T đã thành Integer, số nguyên bọc vỏ đối tượng, và Java tự bóc vỏ khi gán.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
class Hop<T> {
  private T qua;
  Hop(T q) { qua = q; }
  T lay() { return qua; }
}
void main() {
  int vang = new Hop<>(500).lay();
  vang = vang + 250;
  System.out.println(vang);
}
```

Kết quả (máy đã chạy thật):

```text
750
```

Nhặt thêm rương hai trăm năm mươi, số vàng lên bảy trăm năm mươi.

### LỖI HAY GẶP — Nhãn không nhận int

Thế nếu ghi thẳng int lên nhãn cho gọn thì sao?

File `Loi1.java` — chạy: `java Loi1.java`

```java
class Hop<T> {
  private T qua;
  Hop(T q) { qua = q; }
  T lay() { return qua; }
}
void main() {
  int vang = new Hop<int>(500).lay();
  vang = vang + 250;
  System.out.println(vang);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 7: unexpected type
```

Java từ chối ngay lúc biên dịch: nhãn chỉ nhận kiểu đối tượng, còn int là kiểu nguyên thủy. Sửa bằng lớp bọc Integer; kiểu nguyên thủy nào cũng có một lớp bọc riêng như thế.

## Tóm lại

Tóm lại: lớp giữ chỗ trống T, lúc tạo mới dán nhãn.

## Câu đố hôm nay

In ra gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 71.

```java
void main() {
  record Hop<T>(T qua) {}
  var hop = new Hop<>('5');
  System.out.println(hop.qua() + 1);
}
```

## Bài tập

Viết Cap<A, B> chứa hai giá trị: vật phẩm và giá bán.
