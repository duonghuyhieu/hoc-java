# Ngày 39 · Phương thức của đối tượng, toString

> Java 100 ngày · 5. Lớp & đối tượng · video 1 phút 20 giây

## Bạn học gì

Phương thức của đối tượng, toString

## Đáp án câu đố Ngày 38

```java
void main() {
  class Phim { int sao = 3;
    Phim(int sao) { sao = 5; } }
  System.out.println(new Phim(9).sao);
}
```

In ra: `3`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 39 · PHƯƠNG THỨC, TOSTRING

Đố hôm qua ra ba, vì trường chưa hề đổi.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
class Kien { String ten = "Tai nghe"; }
void main() {
  System.out.println(new Kien());
}
```

Kết quả (máy đã chạy thật):

```text
Kien@1dbd16a6
```

Số sau `@` khác mỗi lần chạy; chạy file này bạn sẽ thấy tên lớp kèm tên file, vd `Buoc1$Kien@…`.

Giờ in kiện tai nghe, màn hình toàn mã loằng ngoằng. Chữ tai nghe trốn đâu, và thêm dòng nào để nó hiện?

### THÊM TOSTRING — Kiện hàng tự khai tên

Vậy thêm hàm tự giới thiệu, tên nó nghĩa là đổi thành chuỗi. Thân nó chỉ trả về một chuỗi, không in gì. Dòng in không đổi, chẳng ai gọi tên nó, lần này ra gì?

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
class Kien {
  String ten = "Tai nghe";
  public String toString() {
    return "Kiện: " + ten;
  }
}
void main() {
  System.out.println(new Kien());
}
```

**Đoán trước khi chạy — Không gọi tên nó, in ra gì?**

- A. `Kiện: Tai nghe`
- B. `Dãy mã như cũ`
- C. `Lỗi biên dịch`

Kết quả (máy đã chạy thật):

```text
Kiện: Tai nghe
```

Đáp án đúng: **A**.

Ra đúng tên hàng, vì lệnh in tự tìm hàm này. Thiếu nó, Java dùng bản mặc định: tên lớp kèm dãy mã.

### LỖI HAY GẶP — Bỏ public là hỏng

Có điều hàm này kén hơn: bỏ chữ public là Java từ chối.

File `Loi1.java` — chạy: `java Loi1.java`

```java
class Kien {
  String ten = "Tai nghe";
  String toString() {
    return "Kiện: " + ten;
  }
}
void main() {
  System.out.println(new Kien());
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 3: toString() in Kien cannot override
toString() in Object
```

Java báo bạn đang thu hẹp quyền của bản có sẵn. Thêm lại public ở đầu dòng là hết. Mẹo của dân code: trong IntelliJ, Alt Insert sinh hộ cả hàm này.

### Ý chính — PHƯƠNG THỨC — Món tự giới thiệu mình

Vậy hàm ấy là một phương thức, tức hàm nằm trong lớp. Giống món tự giới thiệu mình khi được gọi tên. Nhưng nó không tự nghĩ được, bạn viết câu nào nó đọc câu ấy. Phép cộng với chuỗi cũng tự gọi nó, y như lệnh in.

- **Phương thức** — hàm nằm trong lớp
- **toString** — tự giới thiệu đối tượng
- **Lệnh in** — tự gọi toString
- **Cộng chuỗi** — cũng tự gọi

Ghi nhớ nhanh: Phương thức hàm của đối tượng · toString tự giới thiệu · Tự gọi khi in, cộng chuỗi

### HÀM CỦA ĐỐI TƯỢNG — Mỗi kiện một số riêng

Nhưng phương thức đâu chỉ khai tên: hàm này tính phí theo số cân của chính kiện. Kiện hai cân, gọi qua dấu chấm, trả về ba mươi nghìn.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
class Kien {
  int kg;
  Kien(int k) { kg = k; }
  int phiShip() { return kg * 15000; }
}
void main() {
  int tong = new Kien(2).phiShip();
  tong = tong + new Kien(5).phiShip();
  System.out.println(tong);
}
```

Kết quả (máy đã chạy thật):

```text
105000
```

Thêm kiện năm cân, tổng nhảy lên một trăm lẻ năm nghìn. Cùng một hàm, hai kết quả, vì mỗi đối tượng giữ số cân riêng.

## Tóm lại

Tóm lại: dãy mã lúc đầu chỉ vì kiện chưa biết tự giới thiệu.

## Câu đố hôm nay

Có in ra số 5 không? Đoán trước, rồi chạy thử. Đáp án ở Ngày 40.

```java
void main() {
  class Kien { int phi() { return 5; } }
  System.out.println(new Kien());
}
```

## Bài tập

Thêm toString cho lớp DonHang.
