# Ngày 3 · Biến (1/2)

> Java 100 ngày · 1. Dòng code đầu tiên · video 1 phút 6 giây

## Bạn học gì

Biến (1/2): khai báo & dùng

## Đáp án câu đố Ngày 2

```java
void main() {
  System.out.println("Máu: 100");;
}
```

In ra: `Máu: 100`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 3 · BIẾN

Đố hôm qua: thừa chấm phẩy vẫn chạy, in một dòng Máu một trăm. Tên máu trừ ba mươi lăm, bạn đoán in ra gì?

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int mau = 100;
  System.out.println(mau - 35);
}
```

**Đoán trước khi chạy — Bạn đoán in ra gì?**

- A. `65`
- B. `mau - 35`
- C. `Lỗi biên dịch`

Kết quả (máy đã chạy thật):

```text
65
```

Đáp án đúng: **A**.

Ra sáu mươi lăm, máy trừ tên kiểu gì?

### Ý chính — KHAI BÁO BIẾN — Biến là cái nhãn

Hóa ra máu là nhãn dán lên số một trăm. Nhưng khác nhãn thật, kiểu int chỉ dán lên số nguyên. Dấu bằng là dán nhãn, không phải so sánh.

- **int** — kiểu: số nguyên
- **mau** — tên, tức cái nhãn
- **=** — dán nhãn lên giá trị
- **100** — giá trị

Ghi nhớ nhanh: int mau = 100; khai báo · = dán nhãn · mau - 35 dùng bằng tên

### DÙNG BIẾN — Nhãn lấy từ nhãn khác

Giờ thêm sát thương ba mươi lăm. Máu còn lại là nhãn thứ ba, trừ xong mới dán.

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  int mau = 100;
  int satThuong = 35;
  int mauCon = mau - satThuong;
  System.out.println("Máu: " + mauCon);
}
```

Kết quả (máy đã chạy thật):

```text
Máu: 65
```

Còn dấu cộng nối chữ với số.

### SỬA MỘT SỐ — Đổi một chỗ

Thế còn quái mạnh hơn, sửa số đó thành năm mươi.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  int mau = 100;
  int satThuong = 50;
  int mauCon = mau - satThuong;
  System.out.println("Máu: " + mauCon);
}
```

Kết quả (máy đã chạy thật):

```text
Máu: 50
```

Máu còn lại tự xuống năm mươi, khỏi sửa chỗ khác.

### Ý chính — LUẬT ĐẶT TÊN — Đặt tên đúng luật

Vậy tên có luật: không dấu cách, không mở đầu số, không trùng từ khóa. Mẹo dân code: bỏ dấu, viết liền, viết hoa chữ đầu từ sau.

- **Dấu cách** — cấm, sat thuong là lỗi
- **Số đầu tên** — cấm, 2mau là lỗi
- **Từ khóa** — cấm đặt tên là int, void
- **camelCase** — satThuong, mauCon

Ghi nhớ nhanh: satThuong tên chuẩn · mau ≠ Mau hai tên khác · có dấu chạy được, nên bỏ

### LỖI HAY GẶP — Dùng trước khi khai báo

Nhưng in máu trước khi khai báo thì hỏng.

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  System.out.println(mau);
  int mau = 100;
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 2: cannot find symbol
```

Java báo không thấy tên, vì nhãn chưa dán. Sửa: đưa khai báo lên trước.

## Tóm lại

Tóm lại: tên trừ được vì nó là nhãn.

## Câu đố hôm nay

Số cuối là bao nhiêu? Đoán trước, rồi chạy thử. Đáp án ở Ngày 4.

```java
void main() {
  int xu = 20;
  int thuong = xu * 3;
  System.out.println(xu + thuong);
}
```

## Bài tập

Nhãn đã dán, bóc sang số khác được không?
