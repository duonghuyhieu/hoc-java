# Ngày 59 · record

> Java 100 ngày · 7. Bộ sưu tập & lỗi · video 1 phút 23 giây

## Bạn học gì

record

## Đáp án câu đố Ngày 58

```java
void main() {
  var ten = new HashSet<String>();
  ten.add("an"); ten.add("An");
  System.out.println(ten.size());
}
```

In ra: `2`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 59 · RECORD — Hạ giá cuốc xe?

Đố hôm qua ra hai, vì chữ hoa khác chữ thường.

File `Loi1.java` — chạy: `java Loi1.java`

```java
record Cuoc(String den, int gia) {}
void main() {
  var sang = new Cuoc("Hồ Tây", 90000);
  sang.setGia(70000);
  System.out.println(sang);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 4: cannot find symbol
```

Còn đây: tài xế hạ giá cuốc Hồ Tây xuống bảy mươi nghìn, Java chặn luôn. Một dòng khai báo, Java viết giùm đủ thứ — sao thiếu đúng lệnh đổi giá?

### GIÁ MỚI, PHIẾU MỚI — Không sửa, tạo cuốc mới

Đó là vì record là kiểu ghi một lần: muốn giá mới, tạo cuốc mới. Giống phiếu in sẵn: điền xong là cố định. Có điều phiếu giấy còn tẩy được, record thì khóa chặt mọi trường.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
record Cuoc(String den, int gia) {}
void main() {
  var sang = new Cuoc("Hồ Tây", 90000);
  var giam = new Cuoc("Hồ Tây", 70000);
  System.out.println(giam);
}
```

Kết quả (máy đã chạy thật):

```text
Cuoc[den=Hồ Tây, gia=70000]
```

Lệnh in tự ra tên kiểu, kèm từng trường và giá trị.

### Ý chính — RECORD TỰ CÓ GÌ — Một dòng, bốn thứ sẵn

Khoan đã, chỉ một dòng khai báo, Java viết sẵn bốn thứ. Hàm tạo constructor nhận đủ trường, đúng thứ tự khai báo. Mỗi trường có hàm lấy cùng tên, gọi kèm ngoặc, nhưng không có hàm đổi. Hàm đổi ra chữ được viết sẵn, nên mới có dòng in đẹp lúc nãy. Còn equals so từng trường, không cần cùng một phiếu.

- **new Cuoc(…)** — hàm tạo nhận đủ trường
- **gia()** — hàm lấy, không có hàm đổi
- **toString** — tự in đẹp
- **equals** — so từng trường

Ghi nhớ nhanh: final không đổi · toString in đẹp · equals so giá trị

### SO HAI CUỐC — Giống hệt có là một?

Chính chỗ đó đáng thử: hai cuốc y hệt, cùng Hồ Tây, chín mươi nghìn. Dòng đầu so cùng phiếu, dòng sau so equals — ba dòng in gì?

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
record Cuoc(String den, int gia) {}
void main() {
  var sang = new Cuoc("Hồ Tây", 90000);
  var toi = new Cuoc("Hồ Tây", 90000);
  System.out.println(sang == toi);
  System.out.println(sang.equals(toi));
  System.out.println(toi.gia());
}
```

**Đoán trước khi chạy — Ba dòng in ra gì?**

- A. `true / true / 90000`
- B. `false / true / 90000`
- C. `false / false / 90000`

Kết quả (máy đã chạy thật):

```text
false
true
90000
```

Đáp án đúng: **B**.

Ô biến gắn nhãn một, nhãn hai: hai phiếu riêng, nên dòng đầu ra false. Còn equals thấy trường trùng hết nên ra true, hàm lấy giá trả chín mươi nghìn. Mẹo dân code: dùng kiểu này làm khóa HashMap, hai cuốc trùng trường chung một khóa.

## Tóm lại

Tóm lại: không có lệnh đổi giá, vì record là phiếu ghi một lần.

## Câu đố hôm nay

Dòng in ra trông thế nào? Đoán trước, rồi chạy thử. Đáp án ở Ngày 60.

```java
void main() {
  record Xe(String bien, int cho) {}
  var xe = new Xe("29A", 7);
  System.out.println(xe);
}
```

## Bài tập

Tạo record Khach(String ten, String sdt) và so sánh hai khách.
