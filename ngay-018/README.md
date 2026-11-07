# Ngày 18 · while

> Java 100 ngày · 3. Lặp lại · video 1 phút 5 giây

## Bạn học gì

while

## Đáp án câu đố Ngày 17

```java
void main() {
  int phi = 39000;
  if (phi > 39000) { phi = 0; }
  System.out.println(phi + 20000);
}
```

In ra: `59000`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 18 · WHILE

Hôm qua in năm mươi chín nghìn.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int soDu = 100000;
  if (soDu >= 30000) soDu -= 30000;
  System.out.println(soDu);
}
```

Kết quả (máy đã chạy thật):

```text
70000
```

Ví một trăm nghìn, ly trà sữa ba mươi nghìn. Đổi một chữ, máy mua đến thiếu tiền, chữ nào?

### ĐỔI MỘT CHỮ — Đổi if thành while

Chính là if, chỉ hỏi một lần. Thay bằng while, còn đúng còn làm. Giờ ví còn bao nhiêu?

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  int soDu = 100000;
  while (soDu >= 30000) soDu -= 30000;
  System.out.println(soDu);
}
```

**Đoán trước khi chạy — Ví còn bao nhiêu?**

- A. `70000`
- B. `40000`
- C. `10000`

Kết quả (máy đã chạy thật):

```text
10000
```

Đáp án đúng: **C**.

Mười nghìn, máy trừ ba lần.

### SOI TỪNG VÒNG — Hỏi lại mỗi vòng

Thế ba lần đó, thêm biến đếm ly. Vòng một còn bảy mươi nghìn, một ly. Vòng hai còn bốn mươi nghìn. Vòng ba còn mười nghìn, ba ly.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  int soDu = 100000;
  int ly = 0;
  while (soDu >= 30000) {
    soDu -= 30000;
    ly++;
  }
  System.out.println(ly + " ly");
}
```

Kết quả (máy đã chạy thật):

```text
3 ly
```

Lần hỏi thứ tư sai, nên thoát.

### Ý chính — LUẬT CỦA WHILE — Còn đúng còn lặp

Vậy luật là: hỏi trước mỗi vòng, đúng chạy, sai thoát. Giống rót trà sữa đến hết tiền, chưa biết mấy ly. Khác ở chỗ máy chỉ hỏi đầu vòng.

- **while** — hỏi trước mỗi vòng
- **Đúng** — chạy thân { }
- **Sai** — thoát; sai từ đầu: 0 vòng
- **Khi nào dùng** — chưa biết trước số vòng

Ghi nhớ nhanh: Đúng lặp tiếp · Sai thoát ra · Thân lặp đổi biến

### LỖI HAY GẶP — Quên trừ tiền lặp không dừng

Nhưng quên trừ tiền, điều kiện đúng mãi.

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  int soDu = 100000;
  int ly = 3;
  while (soDu >= 30000) {
    System.out.println(soDu / ly);
    ly--;
  }
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
33333
50000
100000
ArithmeticException: / by zero (dòng 5)
```

Ly về không, Java báo chia cho không, thường thì máy treo. Sửa: thêm dòng trừ tiền. Mẹo: chỉ ngay dòng đẩy điều kiện về sai.

## Tóm lại

Tóm lại: ví tụt vì while hỏi lại mỗi vòng.

## Câu đố hôm nay

Máy dừng ở số nào? Đoán trước, rồi chạy thử. Đáp án ở Ngày 19.

```java
void main() {
  int soDu = 90000;
  while (soDu > 30000) soDu -= 30000;
  System.out.println(soDu);
}
```

## Bài tập

Gửi tiết kiệm 1 triệu, lãi 5%/năm — bao nhiêu năm thì vượt 2 triệu?
