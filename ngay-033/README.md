# Ngày 33 · DỰ ÁN CẤP 1 (1/3): máy tính tiền cửa hàng tiện lợi

> Java 100 ngày · 4. Chia nhỏ chương trình · video 1 phút 34 giây

## Bạn học gì

DỰ ÁN CẤP 1 (1/3): máy tính tiền cửa hàng tiện lợi

## Đáp án câu đố Ngày 32

```java
void main() {
  int[] luot = {2, 4};
  var tong = luot[0] + luot[1];
  System.out.println(tong + 1 + " lần");
}
```

In ra: `7 lần`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 33 · DỰ ÁN CẤP 1

Bài đố hôm qua ra bảy lần. Giờ vào dự án: máy tính tiền cửa hàng tiện lợi, hóa đơn tám mươi lăm nghìn, giảm mười phần trăm.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int tong = 85000;
  int giam = tong * (10 / 100);
  System.out.println(tong - giam);
}
```

Kết quả (máy đã chạy thật):

```text
85000
```

Màn hình vẫn in đủ tám mươi lăm nghìn, vậy tiền giảm đã biến đi đâu?

### ĐỔI THỨ TỰ — Nhân trước, chia sau

Chính chỗ này là thủ phạm: mười chia một trăm đều là số nguyên, nên ra không. Đổi thứ tự: lấy tổng nhân mười trước, rồi mới chia một trăm. Bạn đoán lần này khách trả bao nhiêu?

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  int tong = 85000;
  int giam = tong * 10 / 100;
  System.out.println(tong - giam);
}
```

**Đoán trước khi chạy — Khách trả bao nhiêu?**

- A. `76500`
- B. `85000`
- C. `8500`

Kết quả (máy đã chạy thật):

```text
76500
```

Đáp án đúng: **A**.

Bảy mươi sáu nghìn năm trăm, tiền giảm tám nghìn rưỡi đã quay về.

### Ý chính — BA VIỆC CỦA DỰ ÁN — Máy tính tiền chia ba việc

Khoan đã, con số tám mươi lăm nghìn còn đang gõ tay, máy thật phải tự tính. Nên dự án chia ba việc, việc đầu là dữ liệu: một mảng giá, một mảng số lượng. Việc hai là vòng lặp nhân giá với số lượng rồi cộng dồn vào tổng. Việc ba là giảm giá, tách hẳn ra một phương thức để main chỉ còn gọi tên.

- **Dữ liệu** — mảng giá, mảng số lượng
- **Tính tổng** — vòng lặp cộng dồn
- **Giảm giá** — phương thức riêng

Ghi nhớ nhanh: Mảng giá, số lượng · Vòng lặp cộng dồn · Phương thức giamGia

### CỘNG HÓA ĐƠN — Giá nhân số lượng

Vậy đặt ba món lên quầy: cùng vị trí ở hai mảng là cùng một món. Vòng một, hai món mười lăm nghìn, tổng lên ba mươi nghìn. Vòng hai, thêm một món hai mươi lăm nghìn, thành năm mươi lăm nghìn. Vòng ba, ba món mười nghìn, tổng chạm đúng tám mươi lăm nghìn.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  int[] gia = {15000, 25000, 10000};
  int[] soLuong = {2, 1, 3};
  int tong = 0;
  for (int i = 0; i < gia.length; i++) {
    tong = tong + gia[i] * soLuong[i];
  }
  System.out.println(tong);
}
```

Kết quả (máy đã chạy thật):

```text
85000
```

Con số gõ tay lúc nãy giờ do máy tự cộng, thêm món chỉ cần thêm vào mảng.

### TÁCH GIẢM GIÁ — Một việc, một phương thức

Quay lại công thức giảm giá: gói vào một phương thức, nhận tổng, trả về tiền được giảm. Main chỉ việc gọi tên, nên sau này đổi khuyến mãi, bạn sửa đúng một chỗ. Mẹo của dân code: tiền Việt lưu bằng số nguyên, vì số thập phân dễ lệch lẻ.

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
int giamGia(int tong) {
  return tong * 10 / 100;
}
void main() {
  int tong = 85000;
  int giam = giamGia(tong);
  System.out.println(tong - giam);
}
```

Kết quả (máy đã chạy thật):

```text
76500
```

Kết quả vẫn bảy mươi sáu nghìn năm trăm, mà main đọc lên như một câu tiếng Việt.

## Tóm lại

Tóm lại: tiền giảm từng biến mất vì chia trước, nhân sau.

## Câu đố hôm nay

Khách trả bao nhiêu? Đoán trước, rồi chạy thử. Đáp án ở Ngày 34.

```java
void main() {
  int tong = 150;
  int giam = tong / 100 * 10;
  System.out.println(tong - giam);
}
```

## Bài tập

Chỉ hóa đơn từ 100.000 đồng mới được giảm thì sửa chỗ nào?
