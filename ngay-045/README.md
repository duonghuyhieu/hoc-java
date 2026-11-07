# Ngày 45 · final

> Java 100 ngày · 5. Lớp & đối tượng · video 1 phút 23 giây

## Bạn học gì

final

## Đáp án câu đố Ngày 44

```java
void main() {
  class Ve { static int dem = 0; }
  new Ve().dem = 5;
  System.out.println(new Ve().dem);
}
```

In ra: `5`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 45 · FINAL

Đáp án là năm, vì mọi vé chung một bộ đếm. Chữ final nghĩa là cấm đổi, xe này đã khóa bằng nó.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  final var xe = new ArrayList<>();
  xe.add("Áo");
  System.out.println(xe);
}
```

Kết quả (máy đã chạy thật):

```text
[Áo]
```

Thế mà áo vẫn lên xe, vậy final khóa cái gì?

### ĐỔI HẲN XE — Thêm đúng một dòng

Vậy thêm một dòng, đổi hẳn sang xe mới. Bạn đoán in ra danh sách rỗng, hay bị chặn?

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  final var xe = new ArrayList<>();
  xe.add("Áo");
  xe = new ArrayList<>();
  System.out.println(xe);
}
```

**Đoán trước khi chạy — Danh sách rỗng hay bị chặn?**

- A. `[Áo]`
- B. `[]`
- C. `Lỗi biên dịch`

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 4: cannot assign a value to final
variable xe
```

Đáp án đúng: **C**.

Bị chặn ngay lúc dịch: biến final không gán lại được.

### Ý chính — FINAL KHÓA GÌ — Khóa biển số, không khóa hàng

Đó là vì final giống biển số xe: gắn rồi không đổi, còn hàng chở trên xe thay thoải mái. Nên biến final chỉ gán đúng một lần. Danh sách final vẫn thêm xóa được, vì biến chỉ giữ địa chỉ. Số nguyên thì ẩn dụ gãy: không có hàng bên trong, final khóa luôn con số.

- **Biến final** — chỉ gán một lần
- **Danh sách final** — vẫn thêm, xóa được
- **Số nguyên final** — khóa luôn con số

Ghi nhớ nhanh: final gán một lần · biến giữ địa chỉ · hàng vẫn đổi được

### ĐỔI HÀNG TRÊN XE — Hàng đổi, xe vẫn một

Nhưng chuyến giao thật đổi hàng liên tục: áo lên, sách lên. Giao xong áo thì xóa ô đầu, xe vẫn mang nhãn một.

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  final var xe = new ArrayList<>();
  xe.add("Áo");
  xe.add("Sách");
  xe.remove(0);
  xe.add("Trà");
  System.out.println(xe);
}
```

Kết quả (máy đã chạy thật):

```text
[Sách, Trà]
```

Thêm trà cũng thế, suốt chuyến chưa hề đổi xe.

### TRƯỜNG FINAL & HẰNG — Biển riêng, hằng chung

Quay lại chiếc xe: biển số là trường final, gán một lần trong hàm tạo.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
class Xe {
  static final int SUC_CHUA = 30;
  final String bienSo;
  Xe(String so) { bienSo = so; }
}
void main() {
  var xe = new Xe("29A-123");
  System.out.println(xe.bienSo);
  System.out.println(Xe.SUC_CHUA);
}
```

Kết quả (máy đã chạy thật):

```text
29A-123
30
```

Thêm static nữa là thành hằng, cả đội xe chung sức chứa ba mươi. Mẹo dân code: tên hằng viết hoa, nối bằng gạch dưới.

### LỖI HAY GẶP — Danh sách cấm sửa

Hóa ra muốn khóa cả hàng, phải tạo danh sách cố định.

File `Loi2.java` — chạy: `java Loi2.java`

```java
void main() {
  final var xe = List.of("Áo");
  xe.add("Sách");
  System.out.println(xe);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
UnsupportedOperationException (dòng 3)
```

Thêm sách vẫn dịch qua, nhưng sập khi chạy vì danh sách cấm sửa. Cách sửa: hàng còn đổi thì dùng danh sách thường.

## Tóm lại

Tóm lại: final khóa biển số, nên áo vẫn lên xe.

## Câu đố hôm nay

In ra mấy hay lỗi? Đoán trước, rồi chạy thử. Đáp án ở Ngày 46.

```java
void main() {
  final int[] kien = {1, 2};
  kien[0] = 9;
  System.out.println(kien[0] + kien[1]);
}
```

## Bài tập

Khai báo hằng PHI_SHIP và cộng vào tiền một đơn hàng.
