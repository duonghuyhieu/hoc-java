# Ngày 67 · DỰ ÁN CẤP 2 (1/2): Cửa hàng hướng đối tượng

> Java 100 ngày · 7. Bộ sưu tập & lỗi · video 1 phút 35 giây

## Bạn học gì

DỰ ÁN CẤP 2 (1/2): Cửa hàng hướng đối tượng

## Đáp án câu đố Ngày 66

```java
void main() {
  var doi = new HashSet<String>();
  doi.add("Long"); doi.add("long");
  System.out.println(doi.size());
}
```

In ra: `2`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 67 · DỰ ÁN: CỬA HÀNG

Đố hôm qua ra hai: Long hoa, long thường là hai tên. Shop áo online: ai đó lén gán giá áo thun về không — in ra gì?

File `Loi1.java` — chạy: `java Loi1.java`

```java
record Mon(String ten, int gia) {}
void main() {
  var ao = new Mon("Ao thun", 150);
  ao.gia = 0;
  System.out.println(ao.gia());
}
```

**Đoán trước khi chạy — Giá áo in ra mấy?**

- A. `0`
- B. `150`
- C. `Lỗi biên dịch`

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 4: cannot assign a value to final
variable gia
```

Đáp án đúng: **C**.

Java chặn ngay, dù chưa viết chữ khóa nào — khóa ở đâu?

### SỬA ĐÚNG — Muốn đổi giá? Tạo món mới

Hóa ra khóa nằm ở chữ record: tạo xong là mọi trường đóng băng. Nên muốn đổi giá, tạo món mới lấy tên áo cũ, giá một trăm hai mươi.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
record Mon(String ten, int gia) {}
void main() {
  var ao = new Mon("Ao thun", 150);
  var sale = new Mon(ao.ten(), 120);
  System.out.println(sale.gia());
}
```

Kết quả (máy đã chạy thật):

```text
120
```

Áo gốc vẫn giữ giá cũ, đơn cũ không ai sửa lén được.

### Ý chính — BẢN THIẾT KẾ — Cửa hàng dựng từ khối

Vậy cửa hàng bắt đầu từ món hàng viết bằng record, niêm yết rồi thì không tự đổi. Giỏ là danh sách List, khách thêm bớt món tùy ý. Tổng tiền là vòng lặp đi qua giỏ, cộng giá từng món. Còn lớp class giỏ hàng gói tất cả lại, ngày mai mình dựng.

- **record Mon** — món hàng, không tự đổi
- **List** — giỏ chứa nhiều món
- **Vòng for** — cộng giá thành tổng
- **class GioHang** — gói giỏ lại (ngày mai)

Ghi nhớ nhanh: record món bất biến · List giỏ hàng · tổng cộng dồn

### DỰNG GIỎ HÀNG — Giỏ hai món cộng dồn

Giờ bỏ vào giỏ áo thun một trăm năm mươi nghìn và mũ chín mươi nghìn. Tổng bắt đầu từ không, vòng lặp bốc từng món trong giỏ. Vòng một, biến món mang cùng nhãn với áo, tổng lên một trăm năm mươi.

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
record Mon(String ten, int gia) {}
void main() {
  var ao = new Mon("Ao thun", 150);
  var mu = new Mon("Mu", 90);
  int tong = 0;
  for (var mon : List.of(ao, mu)) {
    tong = tong + mon.gia();
  }
  System.out.println(tong);
}
```

Kết quả (máy đã chạy thật):

```text
240
```

Vòng hai, món sang nhãn của mũ, tổng thành hai trăm bốn mươi nghìn.

### MÃ GIẢM GIÁ — Mã giảm 10%

Khoan đã, khách nhập mã giảm mười phần trăm: nhân tổng với chín mươi chia một trăm. Bạn đoán: hai trăm bốn mươi nghìn giảm xong còn bao nhiêu?

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
record Mon(String ten, int gia) {}
void main() {
  var ao = new Mon("Ao thun", 150);
  var mu = new Mon("Mu", 90);
  int tong = 0;
  for (var mon : List.of(ao, mu)) {
    tong = tong + mon.gia();
  }
  System.out.println(tong * (90 / 100));
}
```

**Đoán trước khi chạy — Giảm 10% còn bao nhiêu?**

- A. `216`
- B. `0`
- C. `240`

Kết quả (máy đã chạy thật):

```text
0
```

Đáp án đúng: **B**.

Ra không đồng: chín mươi chia một trăm là chia nguyên, thành không trước khi nhân.

### MẸO DÂN CODE — Nhân trước, chia sau

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
record Mon(String ten, int gia) {}
void main() {
  var ao = new Mon("Ao thun", 150);
  var mu = new Mon("Mu", 90);
  int tong = 0;
  for (var mon : List.of(ao, mu)) {
    tong = tong + mon.gia();
  }
  System.out.println(tong * 90 / 100);
}
```

Kết quả (máy đã chạy thật):

```text
216
```

Vậy bỏ cặp ngoặc: nhân trước chia sau, máy ra hai trăm mười sáu nghìn. Mẹo dân code: giữ tiền bằng số nguyên, đừng dùng double kẻo lệch vài đồng.

## Tóm lại

Tóm lại: món là record khóa giá, giỏ cộng tiền bằng số nguyên. Giờ thì bạn biết vì sao giá áo đầu bài không gán về không được.

## Câu đố hôm nay

Còn bao nhiêu? Đoán trước, rồi chạy thử. Đáp án ở Ngày 68.

```java
void main() {
  int gia = 150;
  System.out.println(gia / 100 * 90);
}
```

## Bài tập

Nghĩ trước: khách thêm áo đã hết hàng, giỏ nên báo thế nào?
