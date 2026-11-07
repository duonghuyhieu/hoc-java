# Ngày 60 · enum

> Java 100 ngày · 7. Bộ sưu tập & lỗi · video 1 phút 25 giây

## Bạn học gì

enum

## Đáp án câu đố Ngày 59

```java
void main() {
  record Xe(String bien, int cho) {}
  var xe = new Xe("29A", 7);
  System.out.println(xe);
}
```

In ra: `Xe[bien=29A, cho=7]`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 60 · ENUM

Đố hôm qua in Xe kèm biển hai chín A, bảy chỗ. Máy đang để rung, hỏi có rung không — true hay false?

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  String cheDo = "Rung";
  boolean rung = cheDo.equals("RUNG");
  System.out.println(rung);
}
```

**Đoán trước khi chạy — Đang rung — true hay false?**

- A. `true`
- B. `false`
- C. `Lỗi biên dịch`

Kết quả (máy đã chạy thật):

```text
false
```

Đáp án đúng: **B**.

Ra false, mà Java chẳng báo gì — làm sao bắt nó lên tiếng?

### ĐỔI SANG ENUM — Đổi chuỗi thành enum

Vậy thay chuỗi bằng kiểu enum: chỉ có đúng ba chế độ. Gõ lệch hoa thường, Java chặn ngay lúc biên dịch.

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
enum CheDo { CHUONG, RUNG, IM_LANG }
void main() {
  CheDo cheDo = CheDo.RUNG;
  boolean rung = cheDo == CheDo.RUNG;
  System.out.println(rung);
}
```

Kết quả (máy đã chạy thật):

```text
true
```

So hai hằng bằng phép so sánh trực tiếp, giờ ra true.

### Ý chính — ENUM LÀ GÌ — Vài nấc cố định

Hóa ra enum giống trạng thái đơn hàng: vài nấc cố định, Chờ, Đang giao, Đã giao. Chỗ gãy: đơn tự nhảy nấc, còn enum đứng yên chờ bạn gán. Tên hằng viết hoa, lấy ra bằng tên kiểu đứng trước. Mỗi hằng chỉ có một bản, nên so trực tiếp là an toàn.

- **enum** — vài giá trị cố định
- **Đứng yên** — chỉ đổi khi bạn gán
- **CheDo.RUNG** — hằng viết hoa
- **==** — mỗi hằng một bản

Ghi nhớ nhanh: enum kiểu cố định · == so an toàn · gõ sai bị chặn

### ĐỔI CHẾ ĐỘ — Chuỗi thành hằng enum

Giờ thử: máy đang đổ chuông. Vào lớp, gán sang im lặng, ô biến đổi nhãn. Lệnh tra tên đổi chuỗi thành hằng cùng tên — trỏ đúng hằng im lặng, cùng nhãn.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
enum CheDo { CHUONG, RUNG, IM_LANG }
void main() {
  var cheDo = CheDo.CHUONG;
  cheDo = CheDo.IM_LANG;
  var chon = CheDo.valueOf("IM_LANG");
  System.out.println(cheDo == chon);
  System.out.println(cheDo);
}
```

Kết quả (máy đã chạy thật):

```text
true
IM_LANG
```

Nên so ra true, còn lệnh in cho đúng tên hằng.

### LỖI HAY GẶP — Gõ chữ thường vào valueOf

Nhưng lệnh tra tên nhận chuỗi, bẫy hoa thường quay lại — gõ chữ thường thì sao?

File `Loi1.java` — chạy: `java Loi1.java`

```java
enum CheDo { CHUONG, RUNG, IM_LANG }
void main() {
  var nhap = "im_lang";
  var cheDo = CheDo.valueOf(nhap);
  System.out.println(cheDo);
}
```

**Đoán trước khi chạy — Gõ chữ thường — in ra gì?**

- A. `IM_LANG`
- B. `im_lang`
- C. `Lỗi khi chạy`

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
IllegalArgumentException: No enum constant
CheDo.im_lang (dòng 4)
```

Đáp án đúng: **C**.

Chương trình sập, báo không có hằng enum nào mang tên đó. Mẹo dân code: đổi chữ nhập sang chữ hoa ngay khi nhận, rồi mới tra.

## Tóm lại

Tóm lại: enum khóa giá trị vào vài hằng, gõ sai là bị chặn. Giờ thì bạn biết vì sao Rung lọt qua: chuỗi không có danh sách đối chiếu.

## Câu đố hôm nay

true hay false? Đoán trước, rồi chạy thử. Đáp án ở Ngày 61.

```java
void main() {
  enum Pin { DAY, YEU, CAN }
  var pin = Pin.YEU;
  System.out.println(pin.equals("YEU"));
}
```

## Bài tập

Viết switch in thông báo cho từng chế độ chuông, rung, im lặng.
