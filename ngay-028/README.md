# Ngày 28 · Phạm vi biến

> Java 100 ngày · 4. Chia nhỏ chương trình · video 1 phút 5 giây

## Bạn học gì

Phạm vi biến

## Đáp án câu đố Ngày 27

```java
void main() {
  int veRe = Math.min(90000, 120000);
  int veDat = Math.max(veRe, 100000);
  System.out.println(veDat - veRe);
}
```

In ra: `10000`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 28 · PHẠM VI BIẾN

Chênh lệch hai vé hôm qua là mười nghìn. Calo tính ngay trong vòng tập.

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  for (int lan = 1; lan <= 3; lan++) {
    int calo = lan * 40;
  }
  System.out.println(calo);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 5: cannot find symbol
```

Vậy mà dòng in bảo không biết calo là ai, biến đi đâu mất?

### ĐƯA RA NGOÀI — Khai trước vòng lặp

Đó là vì calo khai trong vòng, nên đưa nó lên trước vòng rồi cộng dồn. Vòng một, bốn mươi. Vòng hai, tám mươi.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int calo = 0;
  for (int lan = 1; lan <= 3; lan++) {
    calo = calo + 40;
  }
  System.out.println(calo);
}
```

Kết quả (máy đã chạy thật):

```text
120
```

Vòng ba, một trăm hai mươi, và dòng in đã thấy calo.

### Ý chính — PHẠM VI BIẾN — Phạm vi biến sống tới dấu }

Chính chỗ này là phạm vi biến: mỗi cặp ngoặc nhọn là một khối. Biến sống từ dòng khai báo tới dấu đóng khối. Như đồ để trong phòng thay đồ, chỉ dùng được trong phòng đó. Chỉ khác: ra khỏi phòng đồ vẫn còn, biến thì mất hẳn. Khối trong thấy biến khối ngoài, chiều ngược lại thì không.

- **Khối** — { } của for, if, phương thức
- **Phạm vi** — từ dòng khai tới } đóng khối
- **Phòng thay đồ** — đồ chỉ dùng trong phòng
- **Một chiều** — trong thấy ngoài, ngoài không thấy trong

Ghi nhớ nhanh: { } một khối · khai → } đời của biến · khối trong thấy ngoài

### THỬ ĐOÁN — Khai trong vòng in tại chỗ

Thế khai calo trong vòng rồi in tại chỗ? Bạn đoán ba dòng in ra gì?

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  for (int lan = 1; lan <= 3; lan++) {
    int calo = 0;
    calo = calo + 40;
    System.out.println(calo);
  }
}
```

**Đoán trước khi chạy — Ba dòng in ra gì?**

- A. `40 / 80 / 120`
- B. `40 / 40 / 40`
- C. `Lỗi biên dịch`

Kết quả (máy đã chạy thật):

```text
40
40
40
```

Đáp án đúng: **B**.

Bốn mươi cả ba, vì hết mỗi vòng calo bị xóa, vòng sau tạo lại. Biến đếm trên đầu for cũng chỉ sống trong vòng. Mẹo dân code: khai biến ở khối hẹp nhất còn đủ dùng.

## Tóm lại

Tóm lại: calo khai trong ngoặc nào thì hết ở ngoặc đó.

## Câu đố hôm nay

Tổng bước in ra là? Đoán trước, rồi chạy thử. Đáp án ở Ngày 29.

```java
void main() {
  int buoc = 6000;
  if (buoc > 5000) { int them = 500; }
  System.out.println(buoc);
}
```

## Bài tập

Sửa ví dụ đầu bài để in được lần cuối ra ngoài vòng.
