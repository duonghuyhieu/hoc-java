# Ngày 15 · So sánh String

> Java 100 ngày · 2. Ra quyết định · video 1 phút 12 giây

## Bạn học gì

So sánh String: equals vs ==

## Đáp án câu đố Ngày 14

```java
void main() {
  int calo = 300 + switch (8) {
    case 7, 8 -> 200; default -> 0; };
  System.out.println(calo);
}
```

In ra: `500`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 15 · SO SÁNH STRING

Calo hôm qua ra năm trăm.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  String ma = new String("SALE");
  System.out.println(ma == "SALE");
}
```

Kết quả (máy đã chạy thật):

```text
false
```

Nhập đúng mã giảm giá, máy vẫn in false. Cùng bốn chữ, sao Java bảo khác?

### ĐỔI MỘT CHỖ — Cùng mã khác cách hỏi

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  String ma = new String("SALE");
  System.out.println(ma.equals("SALE"));
}
```

Kết quả (máy đã chạy thật):

```text
true
```

Nhưng đổi sang equals, mã qua ngay. Vì equals so từng chữ, hai dấu bằng thì không.

### Ý chính — HAI CÁCH SO — Cùng mệnh giá chưa chắc cùng tờ

Mấu chốt ở chữ new: tạo đối tượng mới. Như hai tờ năm chục: equals so mệnh giá, hai dấu bằng hỏi cùng một tờ. Nhưng chuỗi viết sẵn giống nhau, Java dùng chung một tờ.

- **new** — tạo đối tượng mới
- **equals** — so từng chữ
- **==** — so có cùng đối tượng
- **Chuỗi viết sẵn** — Java dùng chung

Ghi nhớ nhanh: equals so nội dung · == so đối tượng · 50k khác tờ

### BẪY TRÙNG HỢP — Ba mã cùng bốn chữ

Chính đây là bẫy: đoán xem in gì?

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  String ma = new String("SALE");
  String maShop = "SALE";
  String maApp = "SALE";
  System.out.println(ma == maShop);
  System.out.println(maShop == maApp);
}
```

**Đoán trước khi chạy — Bạn đoán hai dòng in gì?**

- A. `false / true`
- B. `false / false`
- C. `true / true`

Kết quả (máy đã chạy thật):

```text
false
true
```

Đáp án đúng: **A**.

Mã khách gõ có nhãn riêng, dòng đầu false. Hai mã viết sẵn chung nhãn, dòng sau true. Trùng hợp này giấu lỗi, nên cứ dùng equals.

### LỖI HAY GẶP — Chưa nhập mã đã so

Nhưng chưa nhập thì mã là null, không có chuỗi.

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  String ma = null;
  System.out.println(ma.equals("SALE"));
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
NullPointerException: Cannot invoke
"String.equals(Object)" because "ma" is
null (dòng 3)
```

Gọi equals là Java báo lỗi con trỏ rỗng.

### MẸO DÂN CODE — Chuỗi cố định đứng trước

Nên dân code viết chuỗi cố định trước.

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
void main() {
  String ma = null;
  System.out.println("SALE".equals(ma));
}
```

Kết quả (máy đã chạy thật):

```text
false
```

Mã rỗng chỉ ra false, không sập.

## Tóm lại

Tóm lại: mã bị chặn vì hai dấu bằng so đối tượng.

## Câu đố hôm nay

In ra gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 16.

```java
void main() {
  String ma = "sale";
  System.out.println(ma.equals("SALE"));
}
```

## Bài tập

Hỏi mật khẩu, so với "123" bằng equals, in đúng hoặc sai.
