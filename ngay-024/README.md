# Ngày 24 · Ôn tập chặng Lặp lại

> Java 100 ngày · 3. Lặp lại · video 1 phút 44 giây

## Bạn học gì

Ôn tập chặng Lặp lại

## Đáp án câu đố Ngày 23

```java
void main() {
  int[] xu = {10, 20};
  for (int x : xu) { x = x * 2; }
  System.out.println(xu[0] + xu[1]);
}
```

In ra: `30`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 24 · ÔN TẬP CHẶNG LẶP LẠI

Đố hôm qua ra ba mươi: nhân đôi bản sao x, mảng không đổi. Một trăm máu, mỗi đòn mất ba mươi, lặp khi còn máu: in ra mấy?

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int mau = 100;
  while (mau > 0) mau -= 30;
  System.out.println(mau);
}
```

**Đoán trước khi chạy — Máu cuối cùng in ra mấy?**

- A. `0`
- B. `10`
- C. `-20`

Kết quả (máy đã chạy thật):

```text
-20
```

Đáp án đúng: **C**.

Máy in âm hai mươi, vì sao?

### WHILE — While chỉ hỏi ở đầu vòng

Đó là vì while chỉ hỏi đầu vòng: vòng một còn bảy mươi. Vòng hai còn bốn mươi. Vòng ba còn mười. Mười vẫn qua cửa, nên vòng bốn còn âm hai mươi.

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  int mau = 100;
  while (mau > 0) {
    mau = mau - 30;
  }
  System.out.println(mau);
}
```

Kết quả (máy đã chạy thật):

```text
-20
```

Hỏi lại mới dừng, nên máu âm được in.

### Ý chính — CHỌN ĐÚNG VÒNG — Mỗi lệnh một việc

Vậy while hợp lúc chưa biết số lần, như đánh tới hết máu. Biết trước bốn đòn thì dùng for. Còn break bỏ cả vòng. Mà continue chỉ bỏ một lượt.

- **while** — chưa biết số lần
- **for** — biết trước số lần
- **break** — bỏ cả vòng lặp
- **continue** — bỏ một lượt

Ghi nhớ nhanh: mảng đếm từ 0 · vòng lồng trong trước · tổng mốc từ 0

### GHÉP CẢ BỐN — Một trận đủ mọi lệnh

Giờ ghép vào một trận: bốn đòn, năm mươi máu. Đòn bằng không là né, continue bỏ qua. Hết máu thì break dừng trận.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  int[] cacDon = {20, 0, 35, 50};
  int mau = 50;
  for (int don : cacDon) {
    if (don == 0) continue;
    mau = mau - don;
    if (mau <= 0) break;
  }
  System.out.println(mau);
}
```

Kết quả (máy đã chạy thật):

```text
-5
```

Máu về âm năm, nên đòn cuối khỏi chạy.

### ĐỔI MỘT CHỮ — break thành continue

Thế còn đổi break thành bỏ lượt, in ra bao nhiêu?

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
void main() {
  int[] cacDon = {20, 0, 35, 50};
  int mau = 50;
  for (int don : cacDon) {
    if (don == 0) continue;
    mau = mau - don;
    if (mau <= 0) continue;
  }
  System.out.println(mau);
}
```

**Đoán trước khi chạy — Đổi xong in ra mấy?**

- A. `-5`
- B. `-55`
- C. `0`

Kết quả (máy đã chạy thật):

```text
-55
```

Đáp án đúng: **B**.

Âm năm mươi lăm, vì trận không dừng, đòn cuối vẫn đánh.

### VÒNG LỒNG — break thoát mấy tầng?

Nhưng break có bẫy: hai đợt quái, mỗi đợt ba con. Gặp con thứ hai là thoát, in những số nào?

File `Buoc5.java` — chạy: `java Buoc5.java`

```java
void main() {
  for (int dot = 1; dot <= 2; dot++) {
    for (int con = 1; con <= 3; con++) {
      if (con == 2) break;
      System.out.println(dot);
    }
  }
}
```

**Đoán trước khi chạy — In ra những số nào?**

- A. `1`
- B. `1 / 2`
- C. `1 / 1 / 2 / 2`

Kết quả (máy đã chạy thật):

```text
1
2
```

Đáp án đúng: **B**.

In một rồi hai, vì break chỉ thoát vòng trong.

### LỖI HAY GẶP — Dùng .length, đừng gõ số

Quay lại mảng: ba đòn chỉ tới ô hai, mà vòng đòi ô ba.

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  int[] cacDon = {20, 35, 50};
  int tong = 0;
  for (int i = 0; i <= 3; i++) {
    tong = tong + cacDon[i];
  }
  System.out.println(tong);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
ArrayIndexOutOfBoundsException: Index 3
out of bounds for length 3 (dòng 5)
```

Java dừng giữa chừng, báo chỉ số ba vượt mảng. Mẹo dân code: cho i nhỏ hơn độ dài length, đừng gõ số.

### TỔNG KẾT CHẶNG: LẶP LẠI

Vậy cả chặng gói trong năm thẻ này. Thoát vòng thì chỉ thoát một tầng. Cộng dồn lấy mốc không, tìm đòn mạnh nhất lấy đòn đầu. Lưu thẻ lại để ôn.

- Ngày 18 · while — Ví tụt vì while hỏi lại mỗi vòng.
- Ngày 19 · for — Biết trước số lần thì dùng for.
- Ngày 20 · break/continue — Playlist tắt vì break bỏ cả vòng.
- Ngày 21 · vòng lặp lồng — In cả rạp chỉ cần bọc thêm một vòng.
- Ngày 22 · Mảng — Tổng đi từ không, lớn nhất đi từ phần tử đầu.

## Tóm lại

Tóm lại: máu âm vì vòng lặp chỉ hỏi ở đầu.

## Câu đố hôm nay

Dừng ở số mấy? Đoán trước, rồi chạy thử. Đáp án ở Ngày 25.

```java
void main() {
  int mau = 7;
  while (mau < 20) mau = mau * 2;
  System.out.println(mau);
}
```

## Bài tập

Đếm số đòn trúng trong mảng 5 đòn, gặp đòn trên 100 thì dừng.
