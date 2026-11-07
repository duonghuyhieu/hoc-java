# Ngày 19 · for

> Java 100 ngày · 3. Lặp lại · video 1 phút 10 giây

## Bạn học gì

for

## Đáp án câu đố Ngày 18

```java
void main() {
  int soDu = 90000;
  while (soDu > 30000) soDu -= 30000;
  System.out.println(soDu);
}
```

In ra: `30000`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 19 · FOR

Đáp án hôm qua: ba mươi nghìn. Năm quả luân lưu, vòng lặp for này in ra gì?

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  for (int qua = 1; qua < 5; qua++)
    System.out.println(qua);
}
```

**Đoán trước khi chạy — Bạn đoán in ra gì?**

- A. `1 / 2 / 3 / 4 / 5`
- B. `1 / 2 / 3 / 4`
- C. `0 / 1 / 2 / 3 / 4`

Kết quả (máy đã chạy thật):

```text
1
2
3
4
```

Đáp án đúng: **B**.

Chỉ tới bốn, quả thứ năm biến đâu?

### THÊM MỘT DẤU — Thêm một dấu bằng

Đó là vì năm không nhỏ hơn năm, máy thoát sớm.

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  for (int qua = 1; qua <= 5; qua++)
    System.out.println(qua);
}
```

Kết quả (máy đã chạy thật):

```text
1
2
3
4
5
```

Thêm một dấu bằng, quả thứ năm trở lại.

### Ý chính — BA PHẦN CỦA FOR — Một dòng for ba phần

Vậy một dòng for gói ba phần. Phần đầu tạo biến đếm một lần. Phần giữa hỏi trước từng vòng, phần cuối tăng biến đếm. Giống phát số cho ba đơn: biết trước mấy lần thì chọn for. Nhưng người phát tự biết dừng, for chỉ tin điều kiện.

- **Khởi đầu** — int qua = 1, một lần
- **Điều kiện** — qua <= 5, trước vòng
- **Bước tăng** — qua++, sau thân vòng
- **Dùng khi** — biết trước số lần

Ghi nhớ nhanh: Khởi đầu một lần · Điều kiện mỗi vòng · qua++ tăng một

### SOI TỪNG VÒNG — Thưởng mỗi quả mười triệu

Giờ soi ba quả, mỗi quả thưởng mười triệu. Vòng một, thưởng lên mười. Vòng hai, hai mươi. Vòng ba, ba mươi.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  int thuong = 0;
  for (int qua = 1; qua <= 3; qua++) {
    thuong = thuong + 10;
  }
  System.out.println(thuong);
}
```

Kết quả (máy đã chạy thật):

```text
30
```

Đếm lên bốn, điều kiện sai, máy thoát.

### BẪY LỆCH MỘT — Đếm từ 0 thừa một vòng

Nhưng đếm từ số không, giữ dấu bằng, thưởng bao nhiêu?

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
void main() {
  int thuong = 0;
  for (int qua = 0; qua <= 3; qua++) {
    thuong = thuong + 10;
  }
  System.out.println(thuong);
}
```

**Đoán trước khi chạy — Thưởng ra bao nhiêu?**

- A. `30`
- B. `40`
- C. `Lỗi biên dịch`

Kết quả (máy đã chạy thật):

```text
40
```

Đáp án đúng: **B**.

Bốn mươi, vì quả số không cũng tính. Mẹo dân code: đếm từ số không thì dùng dấu nhỏ hơn.

## Tóm lại

Tóm lại: biết trước số lần thì dùng for.

## Câu đố hôm nay

Hiện mấy số? Đoán trước, rồi chạy thử. Đáp án ở Ngày 20.

```java
void main() {
  for (int qua = 1; qua < 6; qua += 2) {
    System.out.println(qua);
  }
}
```

## Bài tập

In bảng giá 1 đến 5 vé xem bóng đá, mỗi vé 80.000 đồng.
