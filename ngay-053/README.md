# Ngày 53 · interface (2/2)

> Java 100 ngày · 6. Kế thừa & đa hình · video 1 phút 20 giây

## Bạn học gì

interface (2/2): quên public, nhiều interface, default method

## Đáp án câu đố Ngày 52

```java
void main() {
  CharSequence diaChi = "Quận 1";
  System.out.println(diaChi.length());
}
```

In ra: `6`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 53 · INTERFACE (PHẦN 2) — Một máy hai hợp đồng

Hôm qua ra sáu: dấu cách cũng là ký tự. Lớp chỉ có một cha, mà máy này ký hai hợp đồng — chạy không?

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
interface Goi { String goi(); }
interface Chup { String chup(); }
class May implements Goi, Chup {
  public String goi() { return "Alo"; }
  public String chup() { return "Ảnh"; }
}
void main() {
  System.out.println(new May().chup());
}
```

**Đoán trước khi chạy — Ký hai hợp đồng: chạy hay chặn?**

- A. `Ảnh`
- B. `Alo`
- C. `Lỗi biên dịch`

Kết quả (máy đã chạy thật):

```text
Ảnh
```

Đáp án đúng: **A**.

Chạy, ra Ảnh — một cha mà ký được hai, nhờ đâu?

### CÙNG MỘT LỚP — Một lớp máy làm hai việc

Khoan, cho máy làm lần lượt: việc đầu tiên ra Alo. Gán lại, việc giờ thành Ảnh, vẫn lớp máy ấy làm nốt hợp đồng chụp.

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
interface Goi { String goi(); }
interface Chup { String chup(); }
class May implements Goi, Chup {
  public String goi() { return "Alo"; }
  public String chup() { return "Ảnh"; }
}
void main() {
  String viec = new May().goi();
  viec = new May().chup();
}
```

Đoạn này không in ra gì — trên video, ô BIẾN cho thấy giá trị đổi qua từng dòng.

Lớp vẫn chỉ một cha, hai hợp đồng chẳng chiếm chỗ của cha.

### Ý chính — BA ĐIỀU CỦA INTERFACE — Ký nhiều hợp đồng

Đó là vì interface chỉ ghi việc phải làm, nên ký mấy cũng được. Giống hợp đồng giao hàng: tài xế hay drone, ký rồi thì phải giao. Gãy ở chỗ: hợp đồng Java tự làm sẵn việc được, nhờ default, tức mặc định. Việc bỏ trống thì lớp tự viết, và phải để public.

- **implements Goi, Chup** — một lớp ký nhiều interface
- **default** — hàm có sẵn ruột trong hợp đồng
- **public** — bắt buộc khi lớp tự viết hàm

Ghi nhớ nhanh: implements nhiều hợp đồng · default ruột viết sẵn · public không được bớt

### DEFAULT — Hợp đồng viết sẵn ruột

Vậy cho hợp đồng Gọi viết sẵn ruột bằng default. Máy xóa hẳn hàm gọi của mình — Java chịu hay báo thiếu?

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
interface Goi {
  default String goi() { return "Alo"; }
}
interface Chup { String chup(); }
class May implements Goi, Chup {
  public String chup() { return "Ảnh"; }
}
void main() {
  System.out.println(new May().goi());
}
```

**Đoán trước khi chạy — Máy bỏ hàm gọi — in ra gì?**

- A. `Alo`
- B. `Lỗi biên dịch`
- C. `Ảnh`

Kết quả (máy đã chạy thật):

```text
Alo
```

Đáp án đúng: **A**.

Ra Alo: máy không viết thì dùng bản mặc định, muốn khác thì viết đè.

### LỖI HAY GẶP — Quên public

Nhưng bỏ public trước hàm chụp là không biên dịch nổi.

File `Loi1.java` — chạy: `java Loi1.java`

```java
interface Goi {
  default String goi() { return "Alo"; }
}
interface Chup { String chup(); }
class May implements Goi, Chup {
  String chup() { return "Ảnh"; }
}
void main() {
  System.out.println(new May().goi());
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 6: chup() in May cannot implement
chup() in Chup
```

Java báo bạn hạ quyền truy cập, vì hàm hợp đồng vốn công khai. Thêm public lại là chạy. Mẹo dân code: IntelliJ bấm Alt Enter ở tên lớp, nó sinh sẵn hàm kèm public.

## Tóm lại

Tóm lại: một cha, nhưng ký nhiều hợp đồng được, miễn giữ public.

## Câu đố hôm nay

Chạy được không, in gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 54.

```java
void main() {
  CharSequence matKhau = "";
  System.out.println(matKhau.isEmpty());
}
```

## Bài tập

Thêm lớp Drone implements Chup, chụp ra «Ảnh trên cao».
