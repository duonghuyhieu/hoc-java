# Ngày 64 · Exception (3/3)

> Java 100 ngày · 7. Bộ sưu tập & lỗi · video 1 phút 22 giây

## Bạn học gì

Exception (3/3): checked, throws, tự tạo

## Đáp án câu đố Ngày 63

```java
void main() {
  int soVe = 2;
  try { soVe += 3; } finally { soVe++; }
  System.out.println(soVe);
}
```

In ra: `6`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 64 · CHECKED, THROWS, TỰ TẠO

Đố hôm qua ra sáu: finally vẫn cộng một vé. Một trăm xu, tiêu ba mươi, rồi ném lỗi hết xu — chạy ra sao?

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  int xu = 100;
  xu = xu - 30;
  throw new Exception("Hết xu");
}
```

**Đoán trước khi chạy — Chạy ra gì?**

- A. `Hết xu`
- B. `Lỗi khi chạy`
- C. `Lỗi biên dịch`

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 4: unreported exception Exception;
must be caught or declared to be thrown
```

Đáp án đúng: **C**.

Java chặn ngay — sao ném lỗi lại bị cấm?

### ĐỔI MỘT CHỮ — Đổi một chữ Java cho qua

Khoan đã, đổi sang lỗi lúc chạy thì Java cho qua. Xu trừ còn bảy mươi.

File `Loi2.java` — chạy: `java Loi2.java`

```java
void main() {
  int xu = 100;
  xu = xu - 30;
  throw new RuntimeException("Hết xu");
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
RuntimeException: Hết xu (dòng 4)
```

Rồi dòng ném làm chương trình đổ lúc chạy. Đó là vì lỗi gốc thuộc loại checked, bị kiểm từ lúc biên dịch.

### Ý chính — HAI LOẠI LỖI — Lỗi bị kiểm trước khi chạy

Nghĩa là: như ngân hàng bắt ký giấy rủi ro trước khi rút, checked phải bắt hoặc khai. Nhưng khác ngân hàng, hàm được đẩy giấy cho nơi gọi, bằng throws. Còn lỗi lúc chạy là unchecked, không bị ép.

- **checked** — kiểu Exception: phải bắt hoặc khai
- **throws** — khai trên đầu hàm, đẩy lỗi ra ngoài
- **unchecked** — RuntimeException: không bị ép

Ghi nhớ nhanh: checked bắt hoặc khai · throws khai trên hàm · extends lỗi tự tạo

### TỰ TẠO LỖI — Lỗi hết xu do bạn tạo

Giờ tự tạo lỗi hết xu: mở rộng từ Exception. Throws báo trước: hàm có thể ném lỗi này. Giá quá một trăm thì throw, ném thật. Mua ba mươi, một trăm rưỡi, rồi mười xu — đoán in ra gì?

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
class HetXu extends Exception {}
void mua(int gia) throws HetXu {
  if (gia > 100) throw new HetXu();
  System.out.println("Mua " + gia);
}
void main() {
  try { mua(30); mua(150); mua(10); }
  catch (HetXu e) {
    System.out.println("Hết xu"); }
}
```

**Đoán trước khi chạy — Đoán xem in ra gì?**

- A. `Mua 30 / Hết xu`
- B. `Mua 30 / Hết xu / Mua 10`
- C. `Hết xu`

Kết quả (máy đã chạy thật):

```text
Mua 30
Hết xu
```

Đáp án đúng: **A**.

Chỉ hai dòng: lỗi nhảy xuống catch, bỏ luôn món mười xu.

### LỖI HAY GẶP — Quên throws ở đầu hàm

Giờ thử xóa throws, giữ nguyên dòng ném.

File `Loi3.java` — chạy: `java Loi3.java`

```java
class HetXu extends Exception {}
void mua(int gia) {
  if (gia > 100) throw new HetXu();
  System.out.println("Mua " + gia);
}
void main() {
  mua(150);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 3: unreported exception HetXu; must
be caught or declared to be thrown
```

Java báo ở dòng ném: lỗi chưa khai, phải bắt hoặc thêm throws. Mẹo dân code: bấm Alt Enter ở dòng gạch đỏ, IntelliJ gợi ý sẵn cách sửa.

## Tóm lại

Tóm lại: lỗi checked phải bắt, hoặc khai bằng throws.

## Câu đố hôm nay

In ra gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 65.

```java
void main() {
  int xu = 0; try { xu = 9 / xu; }
  catch (Exception e) { xu = 5; }
  System.out.println(xu);
}
```

## Bài tập

Tạo MaGiamGiaHetHan extends Exception, ném rồi bắt nó.
