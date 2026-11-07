# Ngày 32 · ÔN CẤP 1 (10 câu đố)

> Java 100 ngày · 4. Chia nhỏ chương trình · video 1 phút 57 giây

## Bạn học gì

ÔN CẤP 1 (10 câu đố)

## Đáp án câu đố Ngày 31

```java
void main() {
  var tui = new ArrayList<>(List.of(1));
  Integer ma = 1; tui.remove(ma);
  System.out.println(tui);
}
```

In ra: `[]`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 32 · ÔN CẤP 1

Hôm qua túi trống trơn, vì Integer xóa theo giá trị. Mười câu đố, câu một có bẫy: dòng này in gì?

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  System.out.println("Nghe " + 1 + 2);
}
```

**Đoán trước khi chạy — Câu 1: dòng này in gì?**

- A. `Nghe 3`
- B. `Nghe 12`
- C. `Lỗi biên dịch`

Kết quả (máy đã chạy thật):

```text
Nghe 12
```

Đáp án đúng: **B**.

Ra mười hai, không phải ba, vì sao?

### CÂU 1 · LỜI GIẢI — Chuỗi đứng trước là nối chữ

Đó là vì máy đọc trái sang phải, gặp chuỗi thì nối chữ.

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  System.out.println("Nghe " + (1 + 2));
}
```

Kết quả (máy đã chạy thật):

```text
Nghe 3
```

Gói hai số lại thì ra ba.

### CÂU 2 · SO SÁNH — Giống chữ khác nhãn

Thế còn chữ giống nhau: câu hai, hai dòng này in gì?

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  String goc = "Mua";
  String sao = new String(goc);
  System.out.println(goc == sao);
  System.out.println(goc.equals(sao));
}
```

**Đoán trước khi chạy — Câu 2: hai dòng in gì?**

- A. `true / true`
- B. `false / true`
- C. `Lỗi biên dịch`

Kết quả (máy đã chạy thật):

```text
false
true
```

Đáp án đúng: **B**.

Dòng đầu sai, dòng sau đúng, vì gốc nhãn một, bản sao nhãn hai. Còn equals mới so từng chữ.

### Ý chính — CÂU 3–6 · TỐC ĐỘ — Bốn câu tốc độ

Giờ tăng tốc, câu ba: gõ số năm, readln vẫn trả chuỗi. Câu bốn: var nhận số rồi gán chuỗi thì sao, lỗi ngay. Câu năm: danh sách số nguyên phải dùng bản bọc Integer. Câu sáu: continue chỉ bỏ vòng này, không thoát vòng lặp.

- **Câu 3: readln** — luôn trả String
- **Câu 4: var** — chốt kiểu từ đầu
- **Câu 5: ArrayList** — dùng Integer, không int
- **Câu 6: continue** — bỏ vòng này, không thoát

Ghi nhớ nhanh: readln ra chuỗi · var chốt kiểu · continue bỏ một vòng

### CÂU 7 · VÒNG LẶP — Tổng lượt nghe ba bài

Quay về playlist, câu bảy: tổng lượt nghe bao nhiêu?

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
void main() {
  int[] luot = {3, 5, 4};
  int tong = 0;
  for (int i = 1; i < 3; i++) {
    tong = tong + luot[i];
  }
  System.out.println(tong);
}
```

**Đoán trước khi chạy — Câu 7: tổng bằng bao nhiêu?**

- A. `12`
- B. `9`
- C. `Lỗi khi chạy`

Kết quả (máy đã chạy thật):

```text
9
```

Đáp án đúng: **B**.

Vòng đầu lấy ô số một, tổng lên năm. Vòng sau cộng bốn, thành chín. Bài đầu bị sót, vì mảng đếm từ số không.

### CÂU 8 · LỖI KHI CHẠY — Mẹo dân code: luot.length

Vậy sửa về không, chạy tới bằng ba: câu tám, sống nổi không?

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  int[] luot = {3, 5, 4};
  int tong = 0;
  for (int i = 0; i <= 3; i++) {
    tong = tong + luot[i];
  }
  System.out.println(tong);
}
```

**Đoán trước khi chạy — Câu 8: chạy nổi không?**

- A. `12`
- B. `Lỗi khi chạy`
- C. `Lỗi biên dịch`

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
ArrayIndexOutOfBoundsException: Index 3
out of bounds for length 3 (dòng 5)
```

Đáp án đúng: **B**.

Sập ở vòng cuối, vì mảng chỉ có ô không, một, hai. Mẹo dân code: viết nhỏ hơn length, playlist dài ngắn đều đúng.

### CÂU 9 · LỖI HAY GẶP — Biến ở đâu sống ở đó

Nhưng biến có biên: câu chín, main in được không?

File `Loi2.java` — chạy: `java Loi2.java`

```java
int tangLuot(int luot) {
  int moi = luot + 1;
  return moi;
}
void main() {
  tangLuot(5);
  System.out.println(moi);
}
```

**Đoán trước khi chạy — Câu 9: main in được không?**

- A. `6`
- B. `Lỗi biên dịch`
- C. `Lỗi khi chạy`

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 7: cannot find symbol
```

Đáp án đúng: **B**.

Java báo không tìm thấy tên, vì biến chết theo phương thức. Muốn dùng thì hứng giá trị trả về.

### TỔNG KẾT CHẶNG: CHIA NHỎ CHƯƠNG TRÌNH

Vậy chín câu đi từ lệnh in tới phương thức. Sai vòng lặp thì xem lại ngày mười tám. Lưu thẻ này lại để ôn.

- Ngày 1 · Dòng code đầu tiên — Chương trình đầu tiên…, Đọc lỗi biên dịch (thiếu……
- Ngày 9 · Ra quyết định — Nhập từ bàn phím (IO.readln), boolean & so sánh…
- Ngày 18 · Lặp lại — while, for, break/continue, vòng lặp lồng, Mảng
- Ngày 25 · Chia nhỏ chương trình — Phương thức, Phạm vi biến, var, ArrayList

## Tóm lại

Tóm lại: máy đọc trái sang phải, nên mới ra mười hai.

## Câu đố hôm nay

Dòng cuối in gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 33.

```java
void main() {
  int[] luot = {2, 4};
  var tong = luot[0] + luot[1];
  System.out.println(tong + 1 + " lần");
}
```

## Bài tập

Cộng lượt nghe playlist 5 bài, dùng length làm điều kiện lặp.
