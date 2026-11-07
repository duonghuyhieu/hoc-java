# Ngày 16 · ÔN (5 câu đố output)

> Java 100 ngày · 2. Ra quyết định · video 1 phút 52 giây

## Bạn học gì

ÔN (5 câu đố output)

## Đáp án câu đố Ngày 15

```java
void main() {
  String ma = "sale";
  System.out.println(ma.equals("SALE"));
}
```

In ra: `false`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 16 · ÔN (5 CÂU ĐỐ OUTPUT)

Đáp án hôm qua là false, vì lệch chữ hoa. Giờ năm câu đố gói cả chặng, mở màn: pin hai mươi, sạc thêm năm, bạn đoán in gì?

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  String pin = "20";
  System.out.println(pin + 5);
}
```

**Đoán trước khi chạy — Bạn đoán in ra gì?**

- A. `25`
- B. `205`
- C. `Lỗi biên dịch`

Kết quả (máy đã chạy thật):

```text
205
```

Đáp án đúng: **B**.

Ra hai trăm linh năm, vậy phép cộng đi đâu mất?

### CÂU 1 · SỬA MỘT DÒNG — Bỏ cặp nháy

Đó là vì cặp nháy biến hai mươi thành chuỗi, nên dấu cộng chỉ nối chữ.

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  int pin = 20;
  System.out.println(pin + 5);
}
```

Kết quả (máy đã chạy thật):

```text
25
```

Bỏ nháy, khai báo kiểu số nguyên int, máy ra hai mươi lăm. Bàn phím cũng trả chuỗi, nên số nhập vào phải đổi trước khi tính.

### CÂU 2 · ĐOÁN SỐ PIN

Vậy pin đã là số, câu hai: dưới hai mươi mới sạc thêm mười. Pin đang tám mươi, soi kỹ rồi chọn đi, in ra bao nhiêu?

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  int pin = 80;
  if (pin < 20); {
    pin = pin + 10;
  }
  System.out.println(pin);
}
```

**Đoán trước khi chạy — Pin in ra bao nhiêu?**

- A. `80`
- B. `90`
- C. `Lỗi biên dịch`

Kết quả (máy đã chạy thật):

```text
90
```

Đáp án đúng: **B**.

Ra chín mươi, vì dấu thừa đang đóng khung đã kết thúc lệnh if. Khối bên dưới mất điều kiện nên luôn chạy, pin được cộng oan mười.

### CÂU 3 · IN DÒNG NÀO

Nhưng code sạch dấu vẫn sai được: pin mười lăm, chưa cắm sạc. Nhánh dưới khớp cả hai vế, bạn cược máy in dòng nào?

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
void main() {
  int pin = 15;
  boolean dangSac = false;
  if (pin < 50) {
    System.out.println("Pin vừa");
  } else if (pin < 20 && !dangSac) {
    System.out.println("Cắm sạc");
  }
}
```

**Đoán trước khi chạy — Máy in dòng nào?**

- A. `Pin vừa`
- B. `Cắm sạc`
- C. `Pin vừa / Cắm sạc`

Kết quả (máy đã chạy thật):

```text
Pin vừa
```

Đáp án đúng: **A**.

Chỉ in Pin vừa, vì mười lăm đã lọt điều kiện rộng ở trên. Java gặp nhánh đúng đầu tiên là dừng, nên điều kiện hẹp phải đứng trước.

### CÂU 4 · BẪY HAY GẶP

Quay lại một điều kiện đơn: pin có đúng bằng hai mươi không? Đoán nhanh: in chữ, im lặng, hay Java không cho chạy?

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  int pin = 15;
  if (pin = 20) {
    System.out.println("Tiết kiệm");
  }
}
```

**Đoán trước khi chạy — Câu này in ra gì?**

- A. `Tiết kiệm`
- B. `Không in gì`
- C. `Lỗi biên dịch`

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 3: incompatible types: int cannot be
converted to boolean
```

Đáp án đúng: **C**.

Không cho chạy, vì một dấu bằng là gán, mà if cần đúng hoặc sai. Java báo không đổi số nguyên sang đúng sai được, thêm một dấu bằng là xong. Mẹo dân code: đọc lỗi đầu tiên trước, số cạnh tên file là dòng sai.

### TỔNG KẾT CHẶNG: RA QUYẾT ĐỊNH

Chính bốn bẫy đó là cả chặng ra quyết định thu nhỏ. Còn hai bài chưa vào đề: chuỗi không tự đổi nếu chưa gán lại, switch mũi tên chỉ chạy một nhánh. Lưu thẻ này lại, làm bài nhỏ ngày mai thì mở ra ôn.

- Ngày 8 · String — Chữ hoa đi mất vì chưa gán lại.
- Ngày 9 · Nhập từ bàn phím (IO.readln) — Giờ bạn biết cước sai vì bàn phím trả chuỗi.
- Ngày 10 · boolean & so sánh — Java từ chối vì một dấu là gán, hai dấu là hỏi.
- Ngày 11 · if/else — Ba mươi vàng mua được kiếm vì một dấu thừa.
- Ngày 12 · else if & thứ tự điều kiện — Điều kiện hẹp đứng trước thì chín điểm mới ra Giỏi.
- Ngày 13 · && || ! — Rạp cần phép và, đủ hai vế mới vào.
- Ngày 14 · switch kiểu mới (->) — Kiểu cũ lọt xuống tay, mũi tên dừng ở vai.
- Ngày 15 · So sánh String — Mã bị chặn vì hai dấu bằng so đối tượng.

## Tóm lại

Tóm lại: pin thành hai trăm linh năm vì máy đọc đúng từng dấu.

## Câu đố hôm nay

Câu 5: in ra gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 17.

```java
void main() {
  String ma = new String("2580");
  boolean khop = ma == "2580";
  System.out.println(!khop);
}
```

## Bài tập

Ghi đáp án 5 câu ra giấy, câu 5 đối chiếu ở đầu Ngày 17.
