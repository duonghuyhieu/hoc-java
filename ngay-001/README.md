# Ngày 1 · Chương trình đầu tiên (void main, System.out.println), chạy java Hello.java

> Java 100 ngày · 1. Dòng code đầu tiên · video 1 phút 4 giây

## Bạn học gì

Chương trình đầu tiên (void main, System.out.println), chạy java Hello.java

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 1 · CHƯƠNG TRÌNH ĐẦU TIÊN

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  System.out.Println("Pin yếu!");
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 2: cannot find symbol
```

Ba dòng trông đúng, vậy mà Java từ chối. Thủ phạm chỉ một chữ cái, tìm ra trong ba giây không?

### SỬA MỘT CHỮ — Trong IntelliJ: sout + Tab

Hóa ra là P hoa, vì Java phân biệt hoa thường.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  System.out.println("Pin yếu!");
}
```

Kết quả (máy đã chạy thật):

```text
Pin yếu!
```

Đổi sang p thường là chạy. Mẹo dân code: gõ sout rồi nhấn Tab, khỏi sai chữ.

### Ý chính — BA DÒNG GỒM GÌ — Tờ giấy nhắn cho máy

Đó là vì code như giấy nhắn dán tủ lạnh: máy làm đúng từng chữ. Người nhà tự đoán được, máy thì dừng. Máy đọc từ void main trở xuống. Lệnh in ra một dòng, chữ nằm trong nháy kép. Lưu file Hello, gõ java kèm tên file là chạy.

- **void main** — chỗ máy bắt đầu
- **System.out.println** — in một dòng
- **Nháy kép** — bọc chữ muốn in
- **java Hello.java** — chạy file

Ghi nhớ nhanh: Từ trên xuống · Hoa khác thường · Đúng từng chữ

### LỖI HAY GẶP — Quên nháy kép

Giờ thêm dòng nhắc cắm sạc mà quên nháy kép. Dòng đầu đúng, màn hình hiện gì?

File `Loi2.java` — chạy: `java Loi2.java`

```java
void main() {
  System.out.println("Pin yếu!");
  System.out.println(Cắm sạc đi);
}
```

**Đoán trước khi chạy — Bạn đoán màn hình hiện gì?**

- A. `Pin yếu!`
- B. `Pin yếu! / Cắm sạc đi`
- C. `Lỗi biên dịch`

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 3: ')' or ',' expected
```

Đáp án đúng: **C**.

Chỉ có lỗi: Java soát hết rồi mới chạy. Thêm nháy là xong.

### TỪ TRÊN XUỐNG — Cùng một lệnh, hai kết quả

Thế còn từ trên xuống? Pin hai mươi, in hai mươi.

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  int pin = 20;
  System.out.println(pin);
  pin = pin - 5;
  System.out.println(pin);
}
```

Kết quả (máy đã chạy thật):

```text
20
15
```

Trừ năm, cùng lệnh đó ra mười lăm. Ô pin là biến, học sau.

## Tóm lại

Tóm lại: máy làm đúng từng chữ. Giờ thì bạn biết vì sao Java từ chối.

## Câu đố hôm nay

Mỗi dòng in gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 2.

```java
void main() {
  System.out.println(20 + 5);
  System.out.println("20 + 5");
}
```

## Bài tập

Sửa chương trình để in tên bạn và tên điện thoại bạn đang dùng trên 2 dòng.
