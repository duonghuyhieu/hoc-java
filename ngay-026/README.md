# Ngày 26 · Phương thức (2/3)

> Java 100 ngày · 4. Chia nhỏ chương trình · video 1 phút 10 giây

## Bạn học gì

Phương thức (2/3): tham số & giá trị trả về

## Đáp án câu đố Ngày 25

```java
void main() {
  int km = Math.max(3, 7);
  int cuoc = km * 15000;
  System.out.println(cuoc);
}
```

In ra: `105000`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 26 · THAM SỐ & GIÁ TRỊ TRẢ VỀ

Cước hôm qua là một trăm lẻ năm nghìn. Pin ba mươi, gọi sạc thêm hai mươi, máy in mấy?

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
int sacPin(int pin) {
  return pin + 20;
}
void main() {
  int pin = 30;
  sacPin(pin);
  System.out.println(pin);
}
```

**Đoán trước khi chạy — Pin lên bao nhiêu?**

- A. `50`
- B. `30`
- C. `Lỗi biên dịch`

Kết quả (máy đã chạy thật):

```text
30
```

Đáp án đúng: **B**.

Vẫn ba mươi, vì sao?

### ĐỔI MỘT DÒNG — Có chỗ nhận pin lên 50

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
int sacPin(int pin) {
  return pin + 20;
}
void main() {
  int pin = 30;
  pin = sacPin(pin);
  System.out.println(pin);
}
```

Kết quả (máy đã chạy thật):

```text
50
```

Khoan đã, thêm phép gán trước lời gọi, ra năm mươi. Như gọi Grab: tài xế đưa tới nơi, không nhận thì như chưa đi. Có điều ở Java, bỏ kết quả chẳng ai nhắc.

### Ý chính — HAI CỬA CỦA PHƯƠNG THỨC — Vào bằng tham số ra bằng return

Vậy phương thức có hai cửa: tham số là cửa vào, nhận bản sao. Kiểu trước tên hứa cửa ra, ở đây số nguyên int. Lệnh trả về return gửi kết quả ra rồi thoát ngay. Còn void hôm qua là hứa không trả gì.

- **Tham số** — ô nhận bản sao giá trị
- **Kiểu trả về** — đứng trước tên phương thức
- **return** — gửi kết quả, thoát ngay
- **void** — không trả gì, khỏi return

Ghi nhớ nhanh: tham số cửa vào · return cửa ra · nơi gọi phải nhận

### HAI THAM SỐ — Thêm số phút nối kết quả

Giờ thêm số phút sạc, mỗi phút lên hai phần trăm. Mười phút, pin lên năm mươi. Thêm mười lăm phút, tám mươi.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
int sacPin(int pin, int phut) {
  return pin + phut * 2;
}
void main() {
  int pin = 30;
  pin = sacPin(pin, 10);
  pin = sacPin(pin, 15);
  System.out.println(sacPin(pin, 5));
}
```

Kết quả (máy đã chạy thật):

```text
90
```

Gọi trong lệnh in cũng là nhận: in chín mươi, pin vẫn tám mươi. Mẹo IntelliJ: bấm Control Alt V ở lời gọi, máy tự tạo biến hứng.

### LỖI HAY GẶP — Tính xong quên trả về

Thế quên dòng trả về thì sao?

File `Loi1.java` — chạy: `java Loi1.java`

```java
int sacPin(int pin, int phut) {
  int pinMoi = pin + phut * 2;
}
void main() {
  int pin = 30;
  pin = sacPin(pin, 10);
  System.out.println(pin);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 3: missing return statement
```

Java từ chối, chỉ vào cuối phương thức: hứa số nguyên mà chưa trả. Trả về biến đó là chạy.

## Tóm lại

Tóm lại: pin đứng yên vì kết quả không ai nhận.

## Câu đố hôm nay

In ra số mấy? Đoán trước, rồi chạy thử. Đáp án ở Ngày 27.

```java
void main() {
  int pin = 70;
  Math.min(pin, 20);
  System.out.println(Math.max(pin, 35));
}
```

## Bài tập

Hai biến pin cùng tên, sao không đụng nhau?
