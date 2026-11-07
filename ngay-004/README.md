# Ngày 4 · Biến (2/2)

> Java 100 ngày · 1. Dòng code đầu tiên · video 1 phút 2 giây

## Bạn học gì

Biến (2/2): gán lại, = không phải «bằng»

## Đáp án câu đố Ngày 3

```java
void main() {
  int xu = 20;
  int thuong = xu * 3;
  System.out.println(xu + thuong);
}
```

In ra: `80`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 4 · GÁN LẠI BIẾN

Hôm qua in tám mươi: hai mươi cộng sáu mươi.

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  int soDu = 100000;
  100000 - 35000 = soDu;
  System.out.println(soDu);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 3: unexpected type
```

Trả ba mươi lăm nghìn, viết đúng như vở toán mà máy không chịu chạy. Sai ở đâu?

### SỬA MỘT DÒNG — Đưa tên biến sang trái

Vậy đưa số dư sang trái, phép trừ sang phải. Trông vô lý: số dư bằng chính nó trừ ba mươi lăm nghìn. Bạn đoán máy in ra gì?

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int soDu = 100000;
  soDu = soDu - 35000;
  System.out.println(soDu);
}
```

**Đoán trước khi chạy — Bạn đoán in ra gì?**

- A. `65000`
- B. `100000`
- C. `Lỗi biên dịch`

Kết quả (máy đã chạy thật):

```text
65000
```

Đáp án đúng: **A**.

Sáu mươi lăm nghìn: dấu bằng là lệnh gán.

### Ý chính — LỆNH GÁN — Dấu = là lệnh gán

Đó là vì máy tính vế phải trước, rồi gán kết quả cho tên bên trái. Phép trừ đứng bên trái thì máy không biết gán vào đâu. Mẹo dân code: đọc dấu bằng thành chữ nhận.

- **Vế phải** — tính trước
- **Vế trái** — tên biến nhận kết quả
- **Đọc =** — là «nhận», không phải «bằng»

Ghi nhớ nhanh: Phải tính trước · Trái tên biến · = là nhận

### GÁN LẠI — Ví chỉ nhớ số mới nhất

Thế còn một trăm nghìn cũ? Nhãn số dư đã bóc khỏi nó, dán sang sáu mươi lăm nghìn.

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  int soDu = 100000;
  soDu = soDu - 35000;
  soDu = soDu + 20000;
  System.out.println(soDu);
}
```

Kết quả (máy đã chạy thật):

```text
85000
```

Hoàn hai mươi nghìn, nhãn sang tám mươi lăm nghìn. Chỉ khác: đồ thật bóc nhãn vẫn còn, số cũ thì mất hẳn. Hai dòng gán không có int, thêm vào là máy báo trùng tên.

## Tóm lại

Tóm lại: Java từ chối vì dấu bằng là lệnh gán, không phải toán.

## Câu đố hôm nay

Màn hình hiện số nào? Đoán trước, rồi chạy thử. Đáp án ở Ngày 5.

```java
void main() {
  int soDu = 50000;
  soDu = soDu + soDu;
  System.out.println(soDu + soDu);
}
```

## Bài tập

Ví có 200000đ, mua 2 món 45000đ, rồi được hoàn 10000đ — in số dư sau mỗi bước.
