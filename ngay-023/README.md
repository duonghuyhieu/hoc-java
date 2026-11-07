# Ngày 23 · Mảng (2/2)

> Java 100 ngày · 3. Lặp lại · video 1 phút 7 giây

## Bạn học gì

Mảng (2/2): duyệt, tổng, lớn nhất

## Đáp án câu đố Ngày 22

```java
void main() {
  int[] gia = {40000, 15000, 60000};
  gia[gia.length - 2] = 9000;
  System.out.println(gia[1] + gia[2]);
}
```

In ra: `69000`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 23 · DUYỆT MẢNG

Đáp án hôm qua: sáu mươi chín nghìn.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int[] xu = {25, -10, 30, 15};
  int tong = xu[0] + xu[1] + xu[2];
  System.out.println(tong);
}
```

Kết quả (máy đã chạy thật):

```text
45
```

Bốn màn được sáu mươi xu, máy in bốn mươi lăm. Mười lăm xu biến đâu?

### VÒNG DUYỆT — Không sót ô nào

Đó là vì sót ô cuối, vòng duyệt cho x nhận từng ô. Ô đầu, hai mươi lăm. Ô hai, còn mười lăm. Ô ba, bốn mươi lăm.

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  int[] xu = {25, -10, 30, 15};
  int tong = 0;
  for (int x : xu) {
    tong += x;
  }
  System.out.println(tong);
}
```

Kết quả (máy đã chạy thật):

```text
60
```

Ô cuối, đủ sáu mươi.

### Ý chính — CÁCH DUYỆT — Kiểm kê từng ngăn

Vậy duyệt là kiểm kê từng ngăn tủ, ghi tổng và ngăn nặng nhất. Nhưng x là bản chép, sửa nó ngăn thật không đổi. Mẹo: cần vị trí ô mới dùng vòng có i.

- **Duyệt** — x lần lượt là từng ô
- **tong += x** — cộng dồn thành tổng
- **Bản chép** — sửa x, mảng không đổi
- **for có i** — khi cần số thứ tự ô

Ghi nhớ nhanh: Ngăn tủ kiểm từng ô · Tổng cộng dồn · Lớn nhất ghi đè

### LỚN NHẤT — Ai giữ kỷ lục?

Còn tìm lớn nhất, đặt mốc bằng không. Số to hơn thì ghi đè: hai mươi lăm.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  int[] xu = {25, -10, 30, 15};
  int lonNhat = 0;
  for (int x : xu) {
    if (x > lonNhat) {
      lonNhat = x;
    }
  }
  System.out.println(lonNhat);
}
```

Kết quả (máy đã chạy thật):

```text
30
```

Rồi lên ba mươi.

### LỖI HAY GẶP — Mốc bằng không là cái bẫy

Nhưng ba màn toàn mất xu, máy in gì?

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
void main() {
  int[] xu = {-20, -5, -40};
  int lonNhat = 0;
  for (int x : xu) {
    if (x > lonNhat) {
      lonNhat = x;
    }
  }
  System.out.println(lonNhat);
}
```

**Đoán trước khi chạy — Ba màn toàn mất xu, máy in gì?**

- A. `-5`
- B. `0`
- C. `-40`

Kết quả (máy đã chạy thật):

```text
0
```

Đáp án đúng: **B**.

Ra số không, Java im re, vì số âm nào cũng thua mốc.

### ĐỔI MỘT CHỖ — Lấy ô đầu làm mốc

Thế nên lấy ô đầu làm mốc.

File `Buoc5.java` — chạy: `java Buoc5.java`

```java
void main() {
  int[] xu = {-20, -5, -40};
  int lonNhat = xu[0];
  for (int x : xu) {
    if (x > lonNhat) {
      lonNhat = x;
    }
  }
  System.out.println(lonNhat);
}
```

Kết quả (máy đã chạy thật):

```text
-5
```

Đổi một chỗ, ra âm năm.

## Tóm lại

Tóm lại: mười lăm xu về đủ nhờ vòng duyệt.

## Câu đố hôm nay

In ra 30 hay 60? Đoán trước, rồi chạy thử. Đáp án ở Ngày 24.

```java
void main() {
  int[] xu = {10, 20};
  for (int x : xu) { x = x * 2; }
  System.out.println(xu[0] + xu[1]);
}
```

## Bài tập

Tìm khoản chi nhỏ nhất trong tuần.
