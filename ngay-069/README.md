# Ngày 69 · Generics (1/2)

> Java 100 ngày · 8. Java hiện đại · video 1 phút 32 giây

## Bạn học gì

Generics (1/2): vì sao cần (lỗi lúc chạy → lỗi lúc biên dịch)

## Đáp án câu đố Ngày 68

```java
void main() {
  record Gio(List<String> ds) {}
  var gio = new Gio(List.of("Pate"));
  System.out.println(gio);
}
```

In ra: `Gio[ds=[Pate]]`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 69 · GENERICS

Đố hôm qua: record tự in tên giỏ kèm danh sách Pate.

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  List tui = new ArrayList();
  tui.add("DH01");
  tui.add(50000);
  String ma = (String) tui.get(1);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
ClassCastException: class
java.lang.Integer cannot be cast to class
java.lang.String (java.lang.Integer and
java.lang.String are in module java.base
of loader 'bootstrap') (dòng 5)
```

Còn túi hàng của shipper này biên dịch êm ru, vừa chạy đã sập. Java đọc hết từng dòng, sao không chặn từ sớm?

### DÁN NHÃN KIỂU — Dán nhãn cho túi

Vậy dán nhãn cho túi: ghi rõ nó chỉ chứa String, tức chuỗi chữ, rồi bỏ luôn phần ép kiểu. Bạn đoán xem lần này Java dừng ở đâu?

File `Loi2.java` — chạy: `java Loi2.java`

```java
void main() {
  List<String> tui = new ArrayList<>();
  tui.add("DH01");
  tui.add(50000);
  String ma = tui.get(1);
}
```

**Đoán trước khi chạy — Lần này Java dừng ở đâu?**

- A. `Lỗi biên dịch`
- B. `Lỗi khi chạy`
- C. `DH01`

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 4: incompatible types: int cannot be
converted to String
```

Đáp án đúng: **A**.

Lỗi biên dịch, ngay dòng bỏ năm mươi nghìn vào túi chữ, chưa dòng nào kịp chạy. Lỗi lộ lúc gõ code thay vì lúc khách đang chờ hàng, và Generics sinh ra chính vì vậy.

### Ý chính — VÌ SAO TÚI TRẦN SẬP — Giỏ không dán nhãn

Thế túi trần giống gì? Giống giỏ không dán nhãn: bỏ cả áo lẫn tiền vào, lấy ra mới biết cầm nhầm. Danh sách trần cất mọi thứ thành kiểu chung Object, nên lúc lấy ra bạn phải tự ép kiểu. Mà ép kiểu chỉ là lời hứa với trình biên dịch, hứa sai thì nổ lỗi ép kiểu ngay khi chạy. Ẩn dụ gãy ở chỗ giỏ thật liếc là thấy món, còn máy chỉ biết đúng lúc dòng ép kiểu chạy. Còn có nhãn String thì máy kiểm ngay lúc thêm, lấy ra khỏi cần ép.

- **List trần** — nhận mọi kiểu, lấy ra là Object
- **Ép kiểu** — đoán bừa, sai thì nổ lúc chạy
- **List<String>** — chỉ nhận chuỗi, kiểm lúc biên dịch
- **Không cần ép** — lấy ra đã là String

Ghi nhớ nhanh: List trần · ClassCast Exception · <String> nhãn kiểu

### TÚI ĐÚNG KIỂU — Túi đúng kiểu

Giờ dựng lại túi cho đúng: vế phải để trống kiểu, Java tự suy ra String từ vế trái. Bỏ vào đơn một, túi có một mã. Thêm đơn hai, túi lên hai mã, mà ô biến vẫn giữ nhãn một: vẫn đúng cái túi cũ.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  List<String> tui = new ArrayList<>();
  tui.add("DH01");
  tui.add("DH02");
  String dau = tui.get(0);
  int soDon = tui.size();
  System.out.println(dau + " " + soDon);
}
```

Kết quả (máy đã chạy thật):

```text
DH01 2
```

Lấy món đầu ra là có ngay chuỗi, không cần ép, rồi đếm được hai đơn. Mẹo dân code: biên dịch mà hiện dòng cảnh báo chữ unchecked là còn sót một danh sách trần.

## Tóm lại

Tóm lại: dán nhãn kiểu, lỗi lộ lúc biên dịch thay vì lúc chạy.

## Câu đố hôm nay

Màn hình hiện gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 70.

```java
void main() {
  var thu = List.of("50", "30");
  String s = thu.get(0) + thu.get(1);
  System.out.println(s);
}
```

## Bài tập

Tự viết lớp Túi riêng: làm sao một lớp dán được đủ loại nhãn?
