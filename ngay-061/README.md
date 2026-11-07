# Ngày 61 · Sắp xếp (Collections.sort, Comparator.reverseOrder)

> Java 100 ngày · 7. Bộ sưu tập & lỗi · video 1 phút 23 giây

## Bạn học gì

Sắp xếp (Collections.sort, Comparator.reverseOrder)

## Đáp án câu đố Ngày 60

```java
void main() {
  enum Pin { DAY, YEU, CAN }
  var pin = Pin.YEU;
  System.out.println(pin.equals("YEU"));
}
```

In ra: `false`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 61 · SẮP XẾP

Đố hôm qua ra false: hằng enum không bằng chuỗi. Giỏ hàng ba món, xếp giá từ rẻ đến đắt — bạn đoán in ra gì?

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  var gia = List.of(250, 99, 120);
  Collections.sort(gia);
  System.out.println(gia);
}
```

**Đoán trước khi chạy — Bạn đoán in ra gì?**

- A. `[99, 120, 250]`
- B. `Lỗi khi chạy`
- C. `[250, 99, 120]`

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
UnsupportedOperationException (dòng 3)
```

Đáp án đúng: **B**.

Java sập ngay dòng sắp xếp, dù code trông chẳng sai — vì sao?

### SỬA LẠI — Chép sang danh sách mở

Thủ phạm là List.of: nó tạo danh sách khóa cứng, cấm cả đổi thứ tự. Nên chép sang một danh sách mới sửa được, rồi mới sắp xếp.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  var bangGia = List.of(250, 99, 120);
  var gia = new ArrayList<>(bangGia);
  Collections.sort(gia);
  System.out.println(gia);
}
```

Kết quả (máy đã chạy thật):

```text
[99, 120, 250]
```

Giờ ra chín mươi chín, một trăm hai mươi, hai trăm năm mươi.

### Ý chính — SẮP XẾP — Xếp tại chỗ, xếp ngược

Còn bản thân sort thì giống nút lọc giá thấp đến cao trên Shopee, bấm lần nữa là đảo ngược. Chỉ khác: Shopee mở trang mới, còn sort xáo thẳng danh sách gốc, không trả về gì. Muốn đắt trước, đưa thêm bộ so sánh theo thứ tự ngược. Chuỗi thì xếp theo bảng chữ cái, chữ hoa trước chữ thường.

- **Collections.sort** — xếp tăng dần
- **Sửa tại chỗ** — không trả về list mới
- **reverseOrder()** — lật thành giảm dần
- **Chuỗi** — theo bảng chữ cái, hoa trước

Ghi nhớ nhanh: sort tăng dần · reverseOrder giảm dần · List.of khóa cứng

### ĐẢO NGƯỢC — Rẻ trước, rồi lật ngược

Quay lại giỏ hàng, giờ bật ô biến: sort xếp xong, giá rẻ nhất đứng đầu.

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  var bangGia = List.of(250, 99, 120);
  var gia = new ArrayList<>(bangGia);
  Collections.sort(gia);
  gia.sort(Comparator.reverseOrder());
  System.out.println(gia);
}
```

Kết quả (máy đã chạy thật):

```text
[250, 120, 99]
```

Thêm thứ tự ngược, cùng danh sách đó lật lại, hai trăm năm mươi lên đầu. Nhãn của giá không đổi suốt bài, vì sort chỉ đảo chỗ bên trong một đối tượng.

### LỖI HAY GẶP — sort không trả về gì

Thế còn thêm phép gán để cất kết quả sort vào giá?

File `Loi2.java` — chạy: `java Loi2.java`

```java
void main() {
  var bangGia = List.of(250, 99, 120);
  var gia = new ArrayList<>(bangGia);
  gia = Collections.sort(gia);
  gia.sort(Comparator.reverseOrder());
  System.out.println(gia);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 4: incompatible types: void cannot be
converted to ArrayList<Integer>
```

Java từ chối biên dịch: kiểu void không đổi được thành danh sách. Mẹo đọc lỗi: thấy chữ void là lệnh không trả gì, xóa phép gán đi.

## Tóm lại

Tóm lại: sort xếp tại chỗ, thêm thứ tự ngược để giảm dần.

## Câu đố hôm nay

Xếp xong, in ra gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 62.

```java
void main() {
  var maHang = Arrays.asList("9", "10");
  Collections.sort(maHang);
  System.out.println(maHang);
}
```

## Bài tập

Sắp xếp tên các món trong giỏ theo bảng chữ cái.
