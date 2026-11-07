# Ngày 31 · ArrayList (2/2)

> Java 100 ngày · 4. Chia nhỏ chương trình · video 1 phút 7 giây

## Bạn học gì

ArrayList (2/2): remove(int) vs remove(Object), Integer vs int

## Đáp án câu đố Ngày 30

```java
void main() {
  var ban = new ArrayList<Integer>();
  ban.add(1); ban.add(7); ban.remove(1);
  System.out.println(ban);
}
```

In ra: `[1]`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 31 · ARRAYLIST: REMOVE

Đáp án hôm qua: còn lại số một.

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

Túi đồ game này, ghi số một mà mất mã hai mươi. Giữ số một, đổi một chỗ, kết quả khác hẳn: đoán được không?

### ĐỔI MỘT CHỖ — Vẫn số 1 khác kiểu

Giờ gói số một vào Integer, bản bọc số nguyên, thì sao? Túi còn những mã nào?

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  var maDo = List.of(10, 20, 30);
  var tui = new ArrayList<>(maDo);
  tui.remove(Integer.valueOf(1));
  System.out.println(tui);
}
```

**Đoán trước khi chạy — Túi còn những mã nào?**

- A. `[10, 30]`
- B. `[10, 20, 30]`
- C. `Lỗi khi chạy`

Kết quả (máy đã chạy thật):

```text
[10, 20, 30]
```

Đáp án đúng: **B**.

Đủ cả ba, vì không có món mã một.

### Ý chính — HAI BẢN REMOVE — Một lệnh xóa hai cách hiểu

Vậy là lệnh xóa có hai bản, Java chọn theo kiểu đối số. Truyền số trần int là chọn vị trí. Truyền Integer là chọn giá trị, tìm đúng món. Như bỏ món số một khác bỏ món tên mười. Có điều người còn hỏi lại, Java thì không.

- **remove(int)** — xóa theo vị trí
- **remove(Object)** — xóa theo giá trị
- **Món số 1** — khác món tên 10

Ghi nhớ nhanh: int số trần · Integer bản bọc · valueOf bọc số

### DÙNG CẢ HAI — Vị trí trước giá trị sau

Thế thì dùng cả hai bản. Vị trí một là mã hai mươi, xóa xong ba mươi dồn lên.

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

Rồi tìm mã mười, túi còn ba mươi.

### LỖI HAY GẶP — Có mã 10 vẫn sập

Nhưng ghi thẳng mười thì túi có mã mười vẫn sập.

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

Java báo vượt giới hạn, mẹo là đọc hai số: vị trí mười, độ dài ba. Nên bọc mười vào Integer là hết.

## Tóm lại

Tóm lại: số trần là vị trí, Integer là giá trị. Giờ thì bạn biết vì sao mã hai mươi bay.

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
