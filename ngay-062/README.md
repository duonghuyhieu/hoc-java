# Ngày 62 · Exception (1/3)

> Java 100 ngày · 7. Bộ sưu tập & lỗi · video 1 phút 19 giây

## Bạn học gì

Exception (1/3): try/catch

## Đáp án câu đố Ngày 61

```java
void main() {
  var maHang = Arrays.asList("9", "10");
  Collections.sort(maHang);
  System.out.println(maHang);
}
```

In ra: `[10, 9]`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 62 · TRY/CATCH — Gõ 50k là ví sập?

Đáp án hôm qua: mười trước chín, chuỗi so từng ký tự.

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  String nhap = "50k";
  int tien = Integer.parseInt(nhap);
  System.out.println("Nạp " + tien);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
NumberFormatException: For input string:
"50k" (dòng 3)
```

Khách gõ năm mươi k vào ô nạp, ví sập ngay. Cứu kiểu gì mà vẫn cho khách gõ chữ?

### CỨU VÍ — Bọc trong try catch

Vậy bọc dòng nguy hiểm trong try, nghĩa là cứ thử chạy. Thêm catch đón đúng lỗi sai định dạng số.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  String nhap = "50k";
  try {
    int tien = Integer.parseInt(nhap);
    System.out.println("Nạp " + tien);
  } catch (NumberFormatException e) {
    System.out.println("Chỉ nhập số!");
  }
  System.out.println("Ví vẫn mở");
}
```

Kết quả (máy đã chạy thật):

```text
Chỉ nhập số!
Ví vẫn mở
```

Khách nhận câu nhắc, ví vẫn chạy tới dòng cuối.

### NHẢY CÓC — Nạp ba lần lỗi ở giữa

Nhưng khách nạp ba lần, lần giữa gõ năm k thì sao? Số dư in ra bao nhiêu?

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  int soDu = 0;
  try {
    soDu += Integer.parseInt("200");
    soDu += Integer.parseInt("5k");
    soDu += Integer.parseInt("300");
  } catch (NumberFormatException e) {
    System.out.println(soDu);
  }
}
```

**Đoán trước khi chạy — Số dư in ra bao nhiêu?**

- A. `500`
- B. `200`
- C. `0`

Kết quả (máy đã chạy thật):

```text
200
```

Đáp án đúng: **B**.

Lần đầu, số dư lên hai trăm. Đến năm k, lỗi nổ, Java nhảy thẳng xuống catch, bỏ luôn ba trăm. Nên in hai trăm: try không quay lui.

### Ý chính — BỐN LUẬT — Bốn luật của try catch

Vậy gom lại: try bọc đoạn dễ ném lỗi. Catch chỉ bắt kiểu trong ngoặc, khác kiểu vẫn sập. Lỗi nổ chỗ nào, phần sau của try bị bỏ. Xong catch chạy tiếp, như ô tiền báo đỏ thay vì tắt app. Nhưng câu báo đỏ do bạn tự viết.

- **try** — bọc đoạn có thể ném lỗi
- **catch (Kiểu e)** — chỉ bắt đúng kiểu trong ngoặc
- **Nhảy cóc** — lỗi nổ, phần sau của try bị bỏ
- **Chạy tiếp** — xong catch, đi tiếp bên dưới

Ghi nhớ nhanh: try thử chạy · catch đỡ lỗi · nhảy cóc bỏ phần sau

### LỖI HAY GẶP — Catch trống nuốt lỗi

Còn catch trống bắt mọi lỗi là bẫy đắt nhất.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  int soDu = 0;
  try {
    soDu += Integer.parseInt("5k");
  } catch (Exception e) {}
  System.out.println("Số dư: " + soDu);
}
```

Kết quả (máy đã chạy thật):

```text
Số dư: 0
```

Gõ năm k, ví in số dư không như nạp xong. Java im re, vì lỗi đã bị nuốt.

### SỬA LẠI — In lời nhắn của lỗi

Nên bắt đúng lỗi số, và in lời nhắn của lỗi.

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
void main() {
  int soDu = 0;
  try {
    soDu += Integer.parseInt("5k");
  } catch (NumberFormatException e) {
    System.out.println(e.getMessage());
  }
  System.out.println("Số dư: " + soDu);
}
```

Kết quả (máy đã chạy thật):

```text
For input string: "5k"
Số dư: 0
```

Mẹo dân code: lời nhắn chứa chữ gây lỗi, đọc là biết khách gõ gì.

## Tóm lại

Tóm lại: bọc chỗ dễ hỏng, đỡ đúng kiểu lỗi. Giờ thì năm mươi k chỉ ra một câu nhắc.

## Câu đố hôm nay

In ra gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 63.

```java
void main() {
  try { Integer.parseInt("+5"); }
  catch (Exception e) { return; }
  System.out.println("Hợp lệ");
}
```

## Bài tập

Chia hoá đơn cho 0 người: catch lỗi số có đỡ được không?
