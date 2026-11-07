# Ngày 27 · Phương thức (3/3)

> Java 100 ngày · 4. Chia nhỏ chương trình · video 1 phút 7 giây

## Bạn học gì

Phương thức (3/3): tách bài toán

## Đáp án câu đố Ngày 26

```java
void main() {
  int pin = 70;
  Math.min(pin, 20);
  System.out.println(Math.max(pin, 35));
}
```

In ra: `70`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 27 · TÁCH BÀI TOÁN

Đố hôm qua ra bảy mươi, vì min chạy công cốc.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int tien = 2 * 120000 + 65000;
  System.out.println(tien - 20000);
}
```

Kết quả (máy đã chạy thật):

```text
285000
```

Hóa đơn rạp phim này in đúng tiền. Nhưng hai mươi nghìn kia là gì, bạn đọc ra không?

### Ý chính — TÁCH BÀI TOÁN — Mỗi trạm một việc

Đó là giảm giá, bị chôn vì main ôm ba khoản. Tách giống bếp chia trạm, mỗi trạm một việc. Chỉ khác, phương thức chạy lần lượt, không cùng lúc. Mỗi phương thức một việc, tên nói đúng việc đó, main chỉ gọi tên. Mẹo dân code: tả nó phải dùng chữ và thì tách tiếp.

- **Một việc** — mỗi phương thức một nhiệm vụ
- **Tên rõ việc** — tienVe, giamGia
- **main gọi tên** — đọc như mục lục
- **Chữ «và»** — tả mà có «và» là nên tách

Ghi nhớ nhanh: Một việc một tên · main như mục lục · Chữ «và» tách tiếp

### TÁCH TRẠM ĐẦU — Tiền vé ra phương thức

Vậy bê tiền vé ra ngoài: nhận số vé, trả về tiền. Cộng bắp, tiền lên ba trăm lẻ năm nghìn.

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
int tienVe(int soVe) {
  return soVe * 120000;
}
void main() {
  int tien = tienVe(2) + 65000;
  tien = tien - 20000;
  System.out.println(tien);
}
```

Kết quả (máy đã chạy thật):

```text
285000
```

Trừ khuyến mãi, còn hai trăm tám mươi lăm nghìn.

### TÁCH NỐT — Hai mươi nghìn có tên

Nhưng dòng trừ chưa có tên, nên tách nốt thành giảm giá. Main còn hai dòng, số in ra đổi không?

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
int tienVe(int soVe) {
  return soVe * 120000;
}
int giamGia(int tien) {
  return tien - 20000;
}
void main() {
  int tien = tienVe(2) + 65000;
  System.out.println(giamGia(tien));
}
```

**Đoán trước khi chạy — Main còn hai dòng, in ra gì?**

- A. `285000`
- B. `305000`
- C. `Lỗi biên dịch`

Kết quả (máy đã chạy thật):

```text
285000
```

Đáp án đúng: **A**.

Không đổi, mà đọc tên là biết hai mươi nghìn để làm gì.

### LỖI HAY GẶP — Main nhồi đầy trùng tên biến

Còn nhồi hết vào main năm mươi dòng, tên biến rất dễ trùng.

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  int tien = 2 * 120000;
  System.out.println(tien);
  int tien = 65000;
  System.out.println(tien);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 4: variable tien is already defined
in method main()
```

Khai báo tiền lần hai, máy báo biến này đã có. Cách sửa: mỗi khoản một phương thức riêng.

## Tóm lại

Tóm lại: mỗi việc một phương thức, hai mươi nghìn tự có tên.

## Câu đố hôm nay

Số cuối là gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 28.

```java
void main() {
  int veRe = Math.min(90000, 120000);
  int veDat = Math.max(veRe, 100000);
  System.out.println(veDat - veRe);
}
```

## Bài tập

Tách bài hóa đơn thành 3 phương thức.
