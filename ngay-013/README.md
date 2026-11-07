# Ngày 13 · && || !

> Java 100 ngày · 2. Ra quyết định · video 1 phút 8 giây

## Bạn học gì

&& || !

## Đáp án câu đố Ngày 12

```java
void main() {
  int diem = 8; if (diem > 8) diem = 1;
  else if (diem > 5) diem = 2;
  System.out.println(diem);
}
```

In ra: `2`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 13 · && || !

Đáp án hôm qua: hai.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  boolean coVe = true;
  int tuoi = 16;
  boolean vaoRap = coVe && tuoi >= 18;
  System.out.println(vaoRap);
}
```

Kết quả (máy đã chạy thật):

```text
false
```

Có vé phim mười tám cộng, mới mười sáu tuổi, ra false. Đổi một ký hiệu là được vào, ký hiệu nào?

### ĐỔI MỘT PHÉP — Đổi một phép

Giờ đổi phép và thành hoặc. Bạn đoán in gì?

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  boolean coVe = true;
  int tuoi = 16;
  boolean vaoRap = coVe || tuoi >= 18;
  System.out.println(vaoRap);
}
```

**Đoán trước khi chạy — Vẫn 16 tuổi, máy in gì?**

- A. `true`
- B. `false`
- C. `Lỗi biên dịch`

Kết quả (máy đã chạy thật):

```text
true
```

Đáp án đúng: **A**.

Ra true: một vế đúng là đủ, trẻ con lọt.

### Ý chính — BA PHÉP LOGIC — Ba phép ghép điều kiện

Vậy nhớ ATM: cần thẻ và đủ tiền, còn trả tiền mặt hoặc chuyển khoản. Nhưng đời thường chọn một, phép hoặc cả hai đúng vẫn true. Phép thứ ba là không: đúng thành sai, sai thành đúng.

- **&&** — và: cả hai vế đúng mới true
- **||** — hoặc: một vế đúng là true
- **!** — không: đảo đúng thành sai

Ghi nhớ nhanh: && đủ cả hai · || một là đủ · ! đảo ngược

### PHÉP ĐẢO — Đảo đúng sai

Thế còn quầy vé: chưa hết, đảo thành đặt được. Bán sạch, hết vé thành true.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  boolean hetVe = false;
  boolean datDuoc = !hetVe;
  hetVe = true;
  datDuoc = !hetVe;
  System.out.println(datDuoc);
}
```

Kết quả (máy đã chạy thật):

```text
false
```

Đảo lại, đặt được thành false.

### LỖI HAY GẶP — Thiếu một dấu sập lúc chạy

Khoan đã, thiếu một dấu, Java tính đủ hai vế.

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  int soVe = 0;
  int tien = 0;
  if (soVe > 0 & tien / soVe < 90000) {
    System.out.println("Vé rẻ");
  } else {
    System.out.println("Chưa mua vé");
  }
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
ArithmeticException: / by zero (dòng 4)
```

Vế sau vẫn chạy nên báo lỗi chia cho không.

### THÊM MỘT DẤU — Hai dấu là an toàn

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
void main() {
  int soVe = 0;
  int tien = 0;
  if (soVe > 0 && tien / soVe < 90000) {
    System.out.println("Vé rẻ");
  } else {
    System.out.println("Chưa mua vé");
  }
}
```

Kết quả (máy đã chạy thật):

```text
Chưa mua vé
```

Hóa ra thêm một dấu: vế đầu sai, Java dừng. Mẹo dân code: vế kiểm tra đứng trước.

## Tóm lại

Tóm lại: rạp cần phép và, đủ hai vế mới vào.

## Câu đố hôm nay

Dòng cuối in ra gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 14.

```java
void main() {
  boolean coVe = true;
  boolean duTuoi = false;
  System.out.println(!(coVe && duTuoi));
}
```

## Bài tập

Giảm giá nếu là sinh viên HOẶC đơn trên 200.000, NHƯNG không phải ngày lễ. Nhớ đặt ngoặc.
