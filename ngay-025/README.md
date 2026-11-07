# Ngày 25 · Phương thức (1/3)

> Java 100 ngày · 4. Chia nhỏ chương trình · video 1 phút 12 giây

## Bạn học gì

Phương thức (1/3): định nghĩa & gọi

## Đáp án câu đố Ngày 24

```java
void main() {
  int mau = 7;
  while (mau < 20) mau = mau * 2;
  System.out.println(mau);
}
```

In ra: `28`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 25 · PHƯƠNG THỨC

Bình thuốc ra hai mươi tám.

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  int tinhCuoc(int km) {
    return km * 12000;
  }
  System.out.println(tinhCuoc(3));
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 2: ';' expected
```

Còn đoạn tính cước xe này, Java từ chối ngay dòng khai báo. Chỉ đặt sai một chỗ, bạn nhìn ra không?

### SỬA ĐÚNG CHỖ — Đứng ngoài main

Hóa ra phương thức, tức đoạn code có tên, không được nằm trong main.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
int tinhCuoc(int km) {
  return km * 12000;
}

void main() {
  System.out.println(tinhCuoc(3));
}
```

Kết quả (máy đã chạy thật):

```text
36000
```

Nhấc ra ngoài, ba cây số ra ba mươi sáu nghìn. Mẹo dân code: tên mở đầu bằng động từ.

### Ý chính — CẤU TẠO PHƯƠNG THỨC — Ghi một lần gọi nhiều lần

Nhờ tách ra, bạn có một công thức: ghi một lần, gọi bao nhiêu lần cũng được. Có điều công thức bớt muối được, còn tham số khai mấy truyền đủ mấy. Phần đầu ghi kiểu kết quả, tên, rồi tham số nhận vào. Còn return đưa kết quả về chỗ gọi.

- **int** — kiểu kết quả trả về
- **tinhCuoc** — tên phương thức
- **(int km)** — tham số nhận vào
- **return** — trả kết quả về chỗ gọi

Ghi nhớ nhanh: int kiểu trả về · tham số nhận vào · return trả kết quả

### GỌI NHIỀU LẦN — Một công thức hai cuốc xe

Nhưng viết xong chưa chạy, phải gọi tên kèm số cây số. Cuốc thứ hai gọi lại, cộng dồn. Bạn đoán tổng bao nhiêu?

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
int tinhCuoc(int km) {
  return km * 12000;
}

void main() {
  int tong = tinhCuoc(3);
  tong = tong + tinhCuoc(5);
  System.out.println(tong);
}
```

**Đoán trước khi chạy — Tổng in ra bao nhiêu?**

- A. `60000`
- B. `96000`
- C. `Lỗi biên dịch`

Kết quả (máy đã chạy thật):

```text
96000
```

Đáp án đúng: **B**.

Cuốc đầu ba mươi sáu nghìn. Thêm sáu mươi nghìn, thành chín mươi sáu nghìn.

### ĐỔI MỘT DÒNG — Sửa một chỗ đổi mọi cuốc

Giờ thử tăng giá lên mười lăm nghìn, chỉ sửa một dòng.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
int tinhCuoc(int km) {
  return km * 15000;
}

void main() {
  int tong = tinhCuoc(3);
  tong = tong + tinhCuoc(5);
  System.out.println(tong);
}
```

Kết quả (máy đã chạy thật):

```text
120000
```

Cả hai cuốc đổi theo, tổng thành một trăm hai mươi nghìn.

## Tóm lại

Tóm lại: Java từ chối vì phương thức phải đứng ngoài main.

## Câu đố hôm nay

Cước bao nhiêu? Đoán trước, rồi chạy thử. Đáp án ở Ngày 26.

```java
void main() {
  int km = Math.max(3, 7);
  int cuoc = km * 15000;
  System.out.println(cuoc);
}
```

## Bài tập

Còn chữ void đầu chương trình, vì sao không cần trả về gì?
