# Ngày 35 · DỰ ÁN CẤP 1 (3/3): máy tính tiền cửa hàng tiện lợi

> Java 100 ngày · 4. Chia nhỏ chương trình · video 1 phút 31 giây

## Bạn học gì

DỰ ÁN CẤP 1 (3/3): máy tính tiền cửa hàng tiện lợi

## Đáp án câu đố Ngày 34

```java
void main() {
  int tong = 120000;
  while (tong >= 100000) tong -= 10000;
  System.out.println(tong);
}
```

In ra: `90000`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 35 · DỰ ÁN MÁY TÍNH TIỀN

Số cuối là chín mươi nghìn.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int mi = 36000, sua = 60000;
  System.out.println("Trả " + mi + sua);
}
```

Kết quả (máy đã chạy thật):

```text
Trả 3600060000
```

Còn đây, ba gói mì với hai hộp sữa chỉ chín mươi sáu nghìn mà máy đòi hơn ba tỉ. Ba tỉ ấy chui từ đâu ra?

### TÁCH PHÉP CỘNG — Cộng riêng rồi mới in

Đó là vì đứng sau chuỗi chữ, dấu cộng thôi tính toán mà dán hai số vào nhau. Nên cộng vào biến tổng trước, rồi mới đưa cho chuỗi.

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  int mi = 36000, sua = 60000;
  int tong = mi + sua;
  System.out.println("Trả " + tong);
}
```

Kết quả (máy đã chạy thật):

```text
Trả 96000
```

Giờ máy ra đúng chín mươi sáu nghìn.

### Ý chính — TỜ HÓA ĐƠN — Hóa đơn có ba phần

Nhưng một con số chưa phải hóa đơn. Tờ giấy có ba phần: từng món, tổng, rồi số khách trả. Toàn đồ cũ: mảng giữ món, vòng lặp in dòng, phương thức lo tiền giảm.

- **Từng món** — tên và thành tiền
- **Tổng** — cộng các thành tiền
- **Khách trả** — tổng trừ tiền giảm

Ghi nhớ nhanh: Mảng giữ món · Vòng lặp in từng dòng · Phương thức tính giảm

### IN TỪNG MÓN — Mỗi vòng một dòng

Vậy phần một: ba mảng song song, cùng chỉ số là cùng món. Vòng một, ba gói mì ra ba mươi sáu nghìn. Vòng hai, hai hộp sữa ra sáu mươi nghìn. Vòng ba, ba cái bánh ra hai mươi tư nghìn.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  String[] ten = {"Mì", "Sữa", "Bánh"};
  int[] gia = {12000, 30000, 8000};
  int[] soLuong = {3, 2, 3};
  for (int i = 0; i < ten.length; i++) {
    int tien = gia[i] * soLuong[i];
    String dong = ten[i] + ": " + tien;
    System.out.println(dong);
  }
}
```

Kết quả (máy đã chạy thật):

```text
Mì: 36000
Sữa: 60000
Bánh: 24000
```

Mỗi vòng ghép tên với tiền, nên hóa đơn dài theo số món.

### TIỀN GIẢM — Tổng đi qua phương thức giảm

Thế là ba dòng cộng lại một trăm hai mươi nghìn, qua mốc giảm. Phương thức trả về mười phần trăm, rồi lấy tổng trừ đi. Bạn đoán khách trả bao nhiêu?

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
int tinhGiam(int tong) {
  if (tong >= 100000)
    return tong * 10 / 100;
  return 0;
}
void main() {
  int tong = 36000 + 60000 + 24000;
  int tra = tong - tinhGiam(tong);
  System.out.println("Trả: " + tra);
}
```

**Đoán trước khi chạy — Khách trả bao nhiêu?**

- A. `Trả: 120000`
- B. `Trả: 108000`
- C. `Trả: 12000`

Kết quả (máy đã chạy thật):

```text
Trả: 108000
```

Đáp án đúng: **B**.

Một trăm linh tám nghìn, giảm đúng mười hai nghìn.

### LỖI HAY GẶP — Gộp phép trừ vào chuỗi

Nhưng gộp phép trừ vào thẳng chuỗi là dính lại bẫy đầu bài.

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  int tong = 120000;
  int giam = 12000;
  String dong = "Trả: " + tong - giam;
  System.out.println(dong);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 4: bad operand types for binary
operator '-'
```

Lần này Java từ chối luôn, vì chuỗi đâu trừ được số.

### SỬA MỘT DÒNG — Bọc ngoặc thêm dòng kẻ

Vậy bọc ngoặc quanh phép trừ, máy trừ xong mới ghép chuỗi. Mẹo của dân code: đừng gõ tay dòng kẻ, cho dấu gạch lặp hai mươi lần.

File `Buoc5.java` — chạy: `java Buoc5.java`

```java
void main() {
  int tong = 120000;
  int giam = 12000;
  String dong = "Trả: " + (tong - giam);
  System.out.println("-".repeat(20));
  System.out.println(dong);
}
```

Kết quả (máy đã chạy thật):

```text
--------------------
Trả: 108000
```

Hóa đơn khép lại bằng đường kẻ và số khách trả.

## Tóm lại

Tóm lại: ba tỉ kia sinh ra vì dấu cộng đứng sau chuỗi.

## Câu đố hôm nay

Không ngoặc thì in ra gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 36.

```java
void main() {
  int gia = 10000;
  String dong = "Tiền: " + gia * 3;
  System.out.println(dong);
}
```

## Bài tập

Ghép ba phần thành một chương trình in trọn hóa đơn.
