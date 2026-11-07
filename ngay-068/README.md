# Ngày 68 · DỰ ÁN CẤP 2 (2/2)

> Java 100 ngày · 7. Bộ sưu tập & lỗi · video 1 phút 43 giây

## Bạn học gì

DỰ ÁN CẤP 2 (2/2): Cửa hàng hướng đối tượng

## Đáp án câu đố Ngày 67

```java
void main() {
  int gia = 150;
  System.out.println(gia / 100 * 90);
}
```

In ra: `90`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 68 · DỰ ÁN: CỬA HÀNG (2/2) — Hết hàng vẫn vào giỏ

Đố hôm qua ra chín mươi: chia nguyên trước nên còn một.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int ton = 0;
  var gio = new ArrayList<String>();
  gio.add("Pate meo");
  System.out.println(gio);
}
```

Kết quả (máy đã chạy thật):

```text
[Pate meo]
```

Kho pate mèo còn không hộp, vậy mà giỏ vẫn nhận và in ra pate mèo. Làm sao để giỏ tự biết từ chối, không cần ai đứng canh?

### Ý chính — GIỎ TỰ GIỮ LUẬT — Giỏ tự giữ luật

Đó là vì luật hết thì thôi nằm ngoài danh sách, ai cầm nó cũng thêm bừa được. Hướng đối tượng giải bằng cách bọc danh sách vào kiểu giỏ riêng, luật kiểm tồn nằm trong phương thức thêm.

- **List trần** — ai cũng thêm bừa
- **Giỏ riêng** — bọc danh sách bên trong
- **them()** — cửa duy nhất để thêm
- **Kiểm tồn** — luật nằm trong lớp

Ghi nhớ nhanh: List bên trong · them() cửa duy nhất · kiểm tồn trước khi thêm

### BỌC VÀO GIỎ — Luật nằm trong giỏ

Vậy bọc thật: giỏ viết bằng record, bên trong giữ danh sách tên món. Phương thức thêm chỉ nhận món khi số tồn còn lớn hơn không.

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
record Gio(List<String> ds) {
  void them(String ten, int ton) {
    if (ton > 0) ds.add(ten);
  }
}
void main() {
  var gio = new Gio(new ArrayList<>());
  gio.them("Pate meo", 0);
  System.out.println(gio.ds());
}
```

Kết quả (máy đã chạy thật):

```text
[]
```

Thử lại pate mèo với kho bằng không: giỏ in ngoặc rỗng, tự từ chối rồi.

### ĐỔI MỘT SỐ — Record mà vẫn thêm được?

Nhưng đổi tồn thành ba thì sao, khi record vốn khóa mọi trường? Bạn đoán: giỏ nhận pate mèo, hay Java chặn lại?

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
record Gio(List<String> ds) {
  void them(String ten, int ton) {
    if (ton > 0) ds.add(ten);
  }
}
void main() {
  var gio = new Gio(new ArrayList<>());
  gio.them("Pate meo", 3);
  System.out.println(gio.ds());
}
```

**Đoán trước khi chạy — Record khóa trường — in ra gì?**

- A. `[Pate meo]`
- B. `Lỗi biên dịch`
- C. `[]`

Kết quả (máy đã chạy thật):

```text
[Pate meo]
```

Đáp án đúng: **A**.

Giỏ nhận, vẫn nhãn một, vì record chỉ khóa chỗ trỏ tới, đồ bên trong vẫn thêm được.

### Ý chính — BÁO CHO KHÁCH — Báo hết hàng bằng ngoại lệ

Thế còn khách: giỏ lặng lẽ từ chối thì họ đâu biết vì sao. Muốn báo rõ, phương thức thêm ném ngoại lệ bằng từ khóa throw. Ngoại lệ gốc Exception buộc khai báo ở đầu phương thức, còn ngoại lệ lúc chạy thì không. Nơi gọi bọc trong cặp try catch, bắt lỗi rồi báo khách thay vì sập.

- **throw** — ném lỗi ra ngoài
- **Exception** — buộc khai báo throws
- **RuntimeException** — lỗi lúc chạy, không buộc
- **try / catch** — bắt lỗi, báo khách

Ghi nhớ nhanh: throw ném lỗi · throws khai báo trước · try / catch bắt lại

### LỖI HAY GẶP — Ném mà không khai báo

Chính chỗ này dễ vấp: ném ngoại lệ gốc mà đầu phương thức không khai báo gì.

File `Loi1.java` — chạy: `java Loi1.java`

```java
record Gio(List<String> ds) {
  void them(String ten, int ton) {
    if (ton == 0)
      throw new Exception("Het hang");
    ds.add(ten);
  }
}
void main() {
  var gio = new Gio(new ArrayList<>());
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 4: unreported exception Exception;
must be caught or declared to be thrown
```

Java dừng ngay khi biên dịch, báo ngoại lệ này chưa được bắt hay khai báo. Sửa bằng chữ throws ở đầu phương thức, hoặc đổi sang ngoại lệ lúc chạy. Mẹo dân code: trong IntelliJ, đứng ở dòng đỏ bấm Alt Enter, nó gợi ý sẵn cả hai cách.

## Tóm lại

Tóm lại: giỏ tự giữ luật, hết hàng thì từ chối hoặc ném lỗi.

## Câu đố hôm nay

Tự in ra gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 69.

```java
void main() {
  record Gio(List<String> ds) {}
  var gio = new Gio(List.of("Pate"));
  System.out.println(gio);
}
```

## Bài tập

Viết lớp Kho: bán thì trừ tồn, hết thì ném lỗi, main bắt và in «Het hang».
