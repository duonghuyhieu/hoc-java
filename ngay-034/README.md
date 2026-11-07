# Ngày 34 · DỰ ÁN CẤP 1 (2/3)

> Java 100 ngày · 4. Chia nhỏ chương trình · video 1 phút 42 giây

## Bạn học gì

DỰ ÁN CẤP 1 (2/3): máy tính tiền cửa hàng tiện lợi

## Đáp án câu đố Ngày 33

```java
void main() {
  int tong = 150;
  int giam = tong / 100 * 10;
  System.out.println(tong - giam);
}
```

In ra: `140`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 34 · DỰ ÁN CẤP 1 (2/3)

Hôm qua khách trả một trăm bốn mươi.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int tong = 100000;
  System.out.println(tong > 100000);
}
```

Kết quả (máy đã chạy thật):

```text
false
```

Cửa hàng hứa từ một trăm nghìn được giảm, mà hóa đơn đúng mức đó lại ra false, tức là không. Một ký tự đang nuốt tiền giảm của khách, bạn thấy nó không?

### ĐỔI MỘT DẤU — Thêm dấu bằng

Hóa ra dấu lớn hơn gạt luôn mốc, vì một trăm nghìn đâu có lớn hơn chính nó.

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  int tong = 100000;
  System.out.println(tong >= 100000);
}
```

Kết quả (máy đã chạy thật):

```text
true
```

Thêm dấu bằng vào sau, điều kiện thành lớn hơn hoặc bằng, máy in true, tức là được giảm.

### Ý chính — CÒN BA MẢNH — Máy tính tiền cần đủ bốn mảnh

Nhưng mốc giảm mới là một mảnh, máy tính tiền còn thiếu ba mảnh nữa. Số lượng nằm trong một mảng song song với mảng giá. Tạm tính là cộng dồn giá nhân số lượng qua từng món. Phải trả là tạm tính trừ tiền giảm, mà tiền giảm chỉ có khi đạt mốc.

- **Mốc giảm** — tong >= 100000
- **Số lượng** — mảng song song với giá
- **Tạm tính** — cộng dồn giá × số lượng
- **Phải trả** — tạm tính trừ tiền giảm

Ghi nhớ nhanh: soLuong mảng song song · tạm tính giá × số lượng · phải trả tổng − giảm

### TẠM TÍNH — Cộng dồn giá × số lượng

Vậy ráp hai mảnh đầu: ba món, mỗi món một số lượng riêng. Vòng một, hai món mười lăm nghìn đẩy tổng lên ba mươi nghìn. Vòng hai, thêm một món mười nghìn, tổng thành bốn mươi nghìn.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  int[] gia = {15000, 10000, 20000};
  int[] soLuong = {2, 1, 3};
  int tong = 0;
  for (int i = 0; i < gia.length; i++) {
    tong += gia[i] * soLuong[i];
  }
  System.out.println(tong);
}
```

Kết quả (máy đã chạy thật):

```text
100000
```

Vòng ba, ba món hai mươi nghìn, tổng chạm đúng một trăm nghìn.

### TIỀN PHẢI TRẢ — Tổng trừ giảm

Thế còn tiền giảm: tổng ấy đi vào phương thức giảm, nơi dòng điều kiện vừa sửa đứng gác. Đạt mốc thì trả về mười phần trăm, nhân trước chia sau để khỏi mất tiền. Chưa đạt thì rơi xuống dòng cuối, trả về không.

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
int giam(int tong) {
  if (tong >= 100000) {
    return tong * 10 / 100;
  }
  return 0;
}
void main() {
  int tong = 100000;
  System.out.println(tong - giam(tong));
}
```

Kết quả (máy đã chạy thật):

```text
90000
```

Lệnh in lấy tổng trừ tiền giảm, ra chín mươi nghìn. Mẹo dân code: gặp mốc thì thử ba số, ngay dưới, đúng mốc, ngay trên.

### LỖI HAY GẶP — Xóa dòng trả về không

Giờ thử liều: hóa đơn này đạt mốc, dòng trả về không đâu có chạy, xóa đi được chứ? Xóa xong, bạn nghĩ màn hình còn in chín mươi nghìn không?

File `Loi1.java` — chạy: `java Loi1.java`

```java
int giam(int tong) {
  if (tong >= 100000) {
    return tong * 10 / 100;
  }
}
void main() {
  int tong = 100000;
  System.out.println(tong - giam(tong));
}
```

**Đoán trước khi chạy — Xóa dòng đó, in ra gì?**

- A. `90000`
- B. `0`
- C. `Lỗi biên dịch`

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 5: missing return statement
```

Đáp án đúng: **C**.

Không chạy nổi: Java báo thiếu return ở dòng cuối phương thức. Java không nhìn số cụ thể, nó xét mọi đường đi, nên thêm lại dòng trả về không.

## Tóm lại

Tóm lại: đúng mốc mà mất giảm là do thiếu dấu bằng.

## Câu đố hôm nay

Dừng ở số nào? Đoán trước, rồi chạy thử. Đáp án ở Ngày 35.

```java
void main() {
  int tong = 120000;
  while (tong >= 100000) tong -= 10000;
  System.out.println(tong);
}
```

## Bài tập

Tờ hóa đơn in từng món kèm tiền thì viết sao?
