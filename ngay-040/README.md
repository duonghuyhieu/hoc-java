# Ngày 40 · Tham chiếu (1/2)

> Java 100 ngày · 5. Lớp & đối tượng · video 1 phút 19 giây

## Bạn học gì

Tham chiếu (1/2): hai biến một đối tượng

## Đáp án câu đố Ngày 39

```java
void main() {
  class Kien { int phi() { return 5; } }
  System.out.println(new Kien());
}
```

In ra: `Main$1Kien@1dbd16a6`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 40 · THAM CHIẾU

Đáp án hôm qua: tên lớp kèm một dãy mã. Giờ Bình nạp năm trăm nghìn vào ví Bình.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
class Vi { int soDu; }
void main() {
  var viAn = new Vi();
  var viBinh = viAn;
  viBinh.soDu = 500000;
  System.out.println(viAn.soDu);
}
```

Kết quả (máy đã chạy thật):

```text
500000
```

Thế mà ví An cũng in đúng số đó, tiền từ đâu ra?

### ĐỔI MỘT CHỖ — Bình có ví riêng

Khoan đã, đổi một chỗ: Bình tạo ví riêng bằng new. Vậy ví An in ra bao nhiêu?

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
class Vi { int soDu; }
void main() {
  var viAn = new Vi();
  var viBinh = new Vi();
  viBinh.soDu = 500000;
  System.out.println(viAn.soDu);
}
```

**Đoán trước khi chạy — Ví An in ra bao nhiêu?**

- A. `500000`
- B. `0`
- C. `Lỗi biên dịch`

Kết quả (máy đã chạy thật):

```text
0
```

Đáp án đúng: **B**.

Ra số không, vì tiền nằm ở ví khác.

### Ý chính — VÌ SAO LẠI VẬY — Biến chỉ giữ tham chiếu

Đó là vì chỉ new mới tạo ra ví thật, còn biến chỉ giữ tham chiếu, tức địa chỉ của ví. Nên phép gán đầu bài chép địa chỉ, không chép tiền. Giống hai người đăng nhập một tài khoản ví: người này nạp, người kia thấy ngay. Chỉ khác là không có mật khẩu: biến nào giữ tham chiếu cũng sửa được.

- **new** — tạo ra đối tượng thật
- **Tham chiếu** — địa chỉ của đối tượng
- **Phép gán** — chép địa chỉ, không chép ví
- **Hai biến** — có thể chung một đối tượng

Ghi nhớ nhanh: new tạo ví thật · Tham chiếu trỏ tới ví · Hai biến một ví

### SOI NHÃN — Ba biến, mấy cái ví?

Giờ nhìn ô biến: An và Bình cùng nhãn một. Chi có new riêng nên mang nhãn hai.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
class Vi { int soDu; }
void main() {
  var viAn = new Vi();
  var viBinh = viAn;
  var viChi = new Vi();
  System.out.println(viAn == viChi);
  viChi = viAn;
  System.out.println(viAn == viChi);
}
```

Kết quả (máy đã chạy thật):

```text
false
true
```

Phép so này hỏi có cùng một ví không, nên An với Chi ra false. Gán Chi sang ví An, nhãn thành một, cùng phép so ra true.

### LỖI HAY GẶP — Tưởng gán là sao lưu

Hóa ra bẫy nằm ở đây: dòng gán này không sao lưu ví. An tiêu về không, nên số dư của Bình cũng bằng không.

File `Loi1.java` — chạy: `java Loi1.java`

```java
class Vi { int soDu; }
void main() {
  var viAn = new Vi();
  viAn.soDu = 500000;
  var viBinh = viAn;
  viAn.soDu = 0;
  int soLan = 1000000 / viBinh.soDu;
  System.out.println(soLan);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
ArithmeticException: / by zero (dòng 7)
```

Java dừng ở dòng chia và báo lỗi chia cho không. Muốn sao lưu thật, phải new ví mới rồi chép số dư sang. Mẹo dân code: đừng đếm biến, hãy đếm số lần new chạy, đó là số đối tượng.

## Tóm lại

Tóm lại: ví An có tiền vì phép gán chỉ chép tham chiếu.

## Câu đố hôm nay

In ra mã nào? Đoán trước, rồi chạy thử. Đáp án ở Ngày 41.

```java
void main() {
  String maVi = "AN01";
  String maBan = maVi; maBan = "BI02";
  System.out.println(maVi);
}
```

## Bài tập

Truyền ví vào một hàm rồi nạp tiền, ví ngoài có đổi không?
