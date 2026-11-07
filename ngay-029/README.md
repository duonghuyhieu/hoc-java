# Ngày 29 · var

> Java 100 ngày · 4. Chia nhỏ chương trình · video 1 phút 8 giây

## Bạn học gì

var

## Đáp án câu đố Ngày 28

```java
void main() {
  int buoc = 6000;
  if (buoc > 5000) { int them = 500; }
  System.out.println(buoc);
}
```

In ra: `6000`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 29 · VAR

Sáu nghìn nhé, số thêm kẹt trong ngoặc.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  var giaBan = 250000;
  giaBan = 199000;
  System.out.println(giaBan);
}
```

Kết quả (máy đã chạy thật):

```text
199000
```

Giá tai nghe khai bằng var, đổi vẫn chạy. Vậy gán chữ hết hàng, Java chịu không?

### ĐỔI MỘT DÒNG — Số thành chữ

Giờ thử đổi đúng dòng gán. Bạn đoán Java phản ứng sao?

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  var giaBan = 250000;
  giaBan = "hết hàng";
  System.out.println(giaBan);
}
```

**Đoán trước khi chạy — Java phản ứng ra sao?**

- A. `hết hàng`
- B. `Lỗi khi chạy`
- C. `Lỗi biên dịch`

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 3: incompatible types: String cannot
be converted to int
```

Đáp án đúng: **C**.

Lỗi biên dịch, vì giá bán đã là số nguyên.

### Ý chính — VAR LÀ GÌ — var vẫn có kiểu

Hóa ra var vẫn có kiểu: Java nhìn vế phải tự điền. Như nhân viên kho: đã ghi tai nghe, không thành áo thun. Chỉ khác, Java ghi lúc biên dịch, JavaScript đợi lúc chạy.

- **var** — Java tự suy kiểu
- **Kiểu đã ghi** — không đổi được nữa
- **Lúc biên dịch** — chốt kiểu, khác JavaScript

Ghi nhớ nhanh: var tự suy kiểu · kiểu đã khóa · biên dịch chốt trước

### TỰ SUY KIỂU — Java đọc vế phải

Vậy thấy hai, Java ghi int, số nguyên. Thấy không phẩy năm, ghi double, số thập phân. Nhân với số thập phân, cần trả cũng double.

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  var soLuong = 2;
  var giaBan = 199000;
  var tiLe = 0.5;
  var canTra = soLuong * giaBan * tiLe;
  canTra = canTra - 99000;
  System.out.println(canTra);
}
```

Kết quả (máy đã chạy thật):

```text
100000.0
```

Trừ xu, còn một trăm nghìn chấm không.

### Ý chính — LUẬT DÙNG VAR — var dùng đúng chỗ

Nhưng var chỉ dùng trong phương thức, tham số phải ghi kiểu. Mẹo dân code: vế phải lộ kiểu mới dùng var.

- **Biến cục bộ** — chỉ trong thân phương thức
- **Tham số** — vẫn phải ghi kiểu
- **Vế phải rõ** — mới nên dùng var

Ghi nhớ nhanh: biến cục bộ · tham số ghi kiểu · vế phải lộ kiểu

### LỖI HAY GẶP — Khai trống không suy được

File `Loi2.java` — chạy: `java Loi2.java`

```java
void main() {
  var maGiam;
  maGiam = "GIAM50";
  System.out.println(maGiam);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 2: cannot infer type for local
variable maGiam
```

Còn khai trống, Java báo không suy được kiểu. Gán ngay dòng khai là xong.

## Tóm lại

Tóm lại: hết hàng bị chặn vì var khóa kiểu.

## Câu đố hôm nay

Màn hình hiện số mấy? Đoán trước, rồi chạy thử. Đáp án ở Ngày 30.

```java
void main() {
  var soMon = 7;
  var moiHop = soMon / 2;
  System.out.println(moiHop);
}
```

## Bài tập

Viết lại bài Ngày 3 bằng var, gán thử chuỗi vào biến số rồi đọc lỗi.
