# Ngày 11 · if/else

> Java 100 ngày · 2. Ra quyết định · video 1 phút 6 giây

## Bạn học gì

if/else

## Đáp án câu đố Ngày 10

```java
void main() {
  int soDu = 5000;
  System.out.println(soDu != 5000);
  System.out.println(soDu <= 5000);
}
```

In ra: `false` / `true`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 11 · IF/ELSE

Ví năm nghìn: dòng đầu sai, dòng hai đúng.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int vang = 30;
  if (vang >= 50); {
    System.out.println("Mua kiếm!");
  }
}
```

Kết quả (máy đã chạy thật):

```text
Mua kiếm!
```

Còn đây, ba mươi vàng vẫn mua được kiếm giá năm mươi. Một ký tự gây chuyện, bạn thấy nó chưa?

### BẢN CHUẨN — Nếu đúng thì… còn không thì…

Khoan đã, xem bản chuẩn trước: if nghĩa là nếu. Đúng thì chạy khối đầu, sai thì rẽ sang else, tức ngược lại. Ba mươi vàng vào đây, bạn đoán hiện gì?

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  int vang = 30;
  if (vang >= 50) {
    System.out.println("Mua kiếm!");
  } else {
    System.out.println("Cày thêm.");
  }
}
```

**Đoán trước khi chạy — Ba mươi vàng, in ra gì?**

- A. `Mua kiếm!`
- B. `Cày thêm.`
- C. `Mua kiếm! / Cày thêm.`

Kết quả (máy đã chạy thật):

```text
Cày thêm.
```

Đáp án đúng: **B**.

Ra cày thêm, nhánh mua bị bỏ qua.

### Ý chính — KHÁI NIỆM — if/else là ngã ba đường

Thế nên if là ngã ba đường: đủ vàng rẽ mua, thiếu rẽ cày. Nhưng Java chọn xong là đi thẳng, không quay đầu. Điều kiện phải ra đúng hoặc sai, còn else bỏ đi cũng được.

- **if (điều kiện)** — rẽ theo đúng hoặc sai
- **{ }** — khối lệnh của mỗi nhánh
- **Một nhánh** — chọn xong, đi thẳng
- **else** — ngược lại, có thể bỏ

Ghi nhớ nhanh: if nếu đúng · else ngược lại · điều kiện đúng hoặc sai

### LỖI HAY GẶP — Một dấu cắt rời if

Quay lại câu đố: dấu kết câu chấm dứt lệnh if, nên khối mua luôn chạy.

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  int vang = 30;
  if (vang >= 50); {
    System.out.println("Mua kiếm!");
  } else {
    System.out.println("Cày thêm.");
  }
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 5: 'else' without 'if'
```

Thêm else là lộ: Java báo nhánh này mồ côi. Mẹo dân code: giữa điều kiện và khối lệnh, thấy dấu lạ là xóa.

### XÓA MỘT DẤU — Đủ vàng mới mua

Vậy xóa dấu đó rồi nạp bảy mươi vàng, điều kiện thành đúng.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  int vang = 70;
  if (vang >= 50) {
    vang = vang - 50;
    System.out.println("Mua kiếm!");
  } else {
    System.out.println("Cày thêm.");
  }
}
```

Kết quả (máy đã chạy thật):

```text
Mua kiếm!
```

Nên nhánh mua trừ năm mươi, vàng còn hai mươi.

## Tóm lại

Tóm lại: ba mươi vàng mua được kiếm vì một dấu thừa.

## Câu đố hôm nay

In ra 40 hay 0? Đoán trước, rồi chạy thử. Đáp án ở Ngày 12.

```java
void main() {
  int vang = 40;
  if (vang > 50); { vang = 0; }
  System.out.println(vang);
}
```

## Bài tập

Tổng đơn từ 300.000 đồng in «Freeship», ngược lại in phí 15.000.
