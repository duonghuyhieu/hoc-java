# Ngày 52 · interface (1/2)

> Java 100 ngày · 6. Kế thừa & đa hình · video 1 phút 20 giây

## Bạn học gì

interface (1/2): hợp đồng

## Đáp án câu đố Ngày 51

```java
void main() {
  abstract class Ve { int gia = 90000; }
  class Vip extends Ve { }
  System.out.println(new Vip().gia);
}
```

In ra: `90000`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 52 · INTERFACE — Ký hợp đồng vẫn bị chặn

Chín mươi nghìn: lớp con nhận sẵn giá của cha.

File `Loi1.java` — chạy: `java Loi1.java`

```java
interface Giao { int phi(); }
class Shipper implements Giao {
  int phi() { return 15000; }
}
void main() {
  Giao nguoiGiao = new Shipper();
  System.out.println(nguoiGiao.phi());
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 3: phi() in Shipper cannot implement
phi() in Giao
```

Shipper ký hợp đồng giao, đủ việc báo phí, Java vẫn không dịch. Thiếu đúng một chữ, bạn tìm ra trước mình không?

### THÊM MỘT CHỮ — Thiếu chữ public

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
interface Giao { int phi(); }
class Shipper implements Giao {
  public int phi() { return 15000; }
}
void main() {
  Giao nguoiGiao = new Shipper();
  System.out.println(nguoiGiao.phi());
}
```

Kết quả (máy đã chạy thật):

```text
15000
```

Đó là public, tức công khai: thêm vào, máy in mười lăm nghìn. Vì việc trong interface, tức hợp đồng, luôn công khai; giấu đi là Java chặn. Mẹo: trong IntelliJ, bấm Control I, máy tự viết sẵn các hàm kèm public.

### Ý chính — HỢP ĐỒNG — Interface là hợp đồng

Vậy interface là hợp đồng: shipper hay drone, ai ký «có thể giao» là phải giao. Hợp đồng chỉ ghi tên việc, ruột do người ký viết. Ký bằng chữ implements; khác đời thật, thiếu một việc là Java không dịch. Hợp đồng không tự giao, nên không tạo đối tượng từ nó.

- **Người ký** — shipper, tài xế hay drone đều vừa
- **interface** — chỉ ghi tên việc, không ruột
- **implements** — ký là phải làm đủ mọi việc
- **new Giao()** — không được, hợp đồng không tự giao

Ghi nhớ nhanh: interface hợp đồng · implements ký là làm đủ · public bắt buộc ghi

### MỘT BIẾN, HAI ĐƠN — Một biến kiểu hợp đồng

Quay lại người giao: kiểu Giao, trỏ tới shipper thật, nhãn một. Đơn đầu, tổng phí mười lăm nghìn.

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
interface Giao { int phi(); }
class Shipper implements Giao {
  public int phi() { return 15000; }
}
void main() {
  Giao nguoiGiao = new Shipper();
  int tong = nguoiGiao.phi();
  tong = tong + nguoiGiao.phi();
  System.out.println(tong);
}
```

Kết quả (máy đã chạy thật):

```text
30000
```

Đơn hai, tổng lên ba mươi nghìn. Muốn đổi sang tài xế, chỉ sửa chữ sau new.

### BẪY NGƯỜI MỚI — Việc ngoài hợp đồng

Nhưng shipper có việc riêng: nhận tiền bo, hợp đồng không ghi. Gọi nó qua biến người giao, bạn đoán in gì?

File `Loi2.java` — chạy: `java Loi2.java`

```java
interface Giao { int phi(); }
class Shipper implements Giao {
  public int phi() { return 15000; }
  int tip() { return 5000; }
}
void main() {
  Giao nguoiGiao = new Shipper();
  System.out.println(nguoiGiao.tip());
}
```

**Đoán trước khi chạy — Gọi tiền bo qua biến Giao?**

- A. `5000`
- B. `15000`
- C. `Lỗi biên dịch`

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 8: cannot find symbol
```

Đáp án đúng: **C**.

Lỗi biên dịch: biến Giao chỉ thấy việc trong hợp đồng. Muốn gọi tiền bo, khai biến kiểu Shipper.

## Tóm lại

Tóm lại: shipper bị chặn vì hợp đồng đòi công khai.

## Câu đố hôm nay

In ra mấy? Đoán trước, rồi chạy thử. Đáp án ở Ngày 53.

```java
void main() {
  CharSequence diaChi = "Quận 1";
  System.out.println(diaChi.length());
}
```

## Bài tập

Thêm lớp Drone implements Giao, phí 30.000 đồng.
