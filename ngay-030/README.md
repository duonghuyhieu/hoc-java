# Ngày 30 · ArrayList (1/2)

> Java 100 ngày · 4. Chia nhỏ chương trình · video 1 phút 6 giây

## Bạn học gì

ArrayList (1/2): thêm/xoá

## Đáp án câu đố Ngày 29

```java
void main() {
  var soMon = 7;
  var moiHop = soMon / 2;
  System.out.println(moiHop);
}
```

In ra: `3`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 30 · ARRAYLIST: THÊM/XÓA

Mỗi hộp ba món, số lẻ bị cắt.

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  var ghiBan = new ArrayList<int>();
  ghiBan.add(12);
  System.out.println(ghiBan);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 2: unexpected type
```

Còn danh sách phút ghi bàn này, Java từ chối. Một chữ sai, ba giây tìm ra không?

### ĐỔI MỘT CHỮ — int thành Integer

Vậy chữ sai là int: danh sách không nhận số trần.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  var ghiBan = new ArrayList<Integer>();
  ghiBan.add(12);
  System.out.println(ghiBan);
}
```

Kết quả (máy đã chạy thật):

```text
[12]
```

Đổi sang bản bọc Integer là chạy.

### Ý chính — VÌ SAO KHÔNG DÙNG MẢNG — Giỏ hàng co giãn

Thế còn mảng? Nó chốt số ô, mà trận chưa xong. Danh sách như giỏ hàng Shopee, thêm bớt thoải mái. Có điều giỏ chỉ nhận một kiểu.

- **Mảng** — chốt số ô từ đầu
- **ArrayList** — thêm bớt thoải mái
- **Một kiểu** — khai ngay lúc tạo

Ghi nhớ nhanh: add thêm cuối · remove xóa · size() đếm

### THÊM VÀ ĐẾM — Ba bàn, không cần khai ô

Quay lại trận: add nối phút mười hai vào cuối. Thêm hai bàn nữa, danh sách tự dài ra.

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  var ghiBan = new ArrayList<Integer>();
  ghiBan.add(12);
  ghiBan.add(45);
  ghiBan.add(90);
  System.out.println(ghiBan.size());
}
```

Kết quả (máy đã chạy thật):

```text
3
```

Lệnh size đếm hộ: ba bàn.

### XÓA MỘT BÀN — Xóa phút 45

Khoan đã, trọng tài hủy bàn bốn mươi lăm. Thêm lệnh xóa remove, bạn đoán hiện gì?

File `Loi2.java` — chạy: `java Loi2.java`

```java
void main() {
  var ghiBan = new ArrayList<Integer>();
  ghiBan.add(12);
  ghiBan.add(45);
  ghiBan.add(90);
  ghiBan.remove(45);
  System.out.println(ghiBan.size());
}
```

**Đoán trước khi chạy — Bạn đoán màn hình hiện gì?**

- A. `2`
- B. `3`
- C. `Lỗi khi chạy`

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
IndexOutOfBoundsException: Index 45 out of
bounds for length 3 (dòng 6)
```

Đáp án đúng: **C**.

Sập, vì Java hiểu số đó là vị trí.

### XÓA ĐÚNG GIÁ TRỊ — Bọc số bằng Integer

Hóa ra mẹo là bọc số bằng Integer, xóa đúng giá trị.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  var ghiBan = new ArrayList<Integer>();
  ghiBan.add(12);
  ghiBan.add(45);
  ghiBan.add(90);
  ghiBan.remove(Integer.valueOf(45));
  System.out.println(ghiBan);
}
```

Kết quả (máy đã chạy thật):

```text
[12, 90]
```

Phút chín mươi tự dồn lên chỗ trống.

## Tóm lại

Tóm lại: giờ bạn biết vì sao int cần bản bọc.

## Câu đố hôm nay

Bàn nào còn lại? Đoán trước, rồi chạy thử. Đáp án ở Ngày 31.

```java
void main() {
  var ban = new ArrayList<Integer>();
  ban.add(1); ban.add(7); ban.remove(1);
  System.out.println(ban);
}
```

## Bài tập

Muốn xem lại bàn thứ hai thì gọi lệnh nào?
