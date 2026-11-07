# Ngày 12 · else if & thứ tự điều kiện

> Java 100 ngày · 2. Ra quyết định · video 1 phút 7 giây

## Bạn học gì

else if & thứ tự điều kiện

## Đáp án câu đố Ngày 11

```java
void main() {
  int vang = 40;
  if (vang > 50); { vang = 0; }
  System.out.println(vang);
}
```

In ra: `0`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 12 · ELSE IF & THỨ TỰ ĐIỀU KIỆN

Đố hôm qua ra số không, tại dấu thừa sau if. Giờ bài thi chín điểm, bạn đoán xếp loại gì?

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int diem = 9;
  String loai;
  if (diem >= 5) loai = "Đạt";
  else if (diem >= 8) loai = "Giỏi";
  else loai = "Trượt";
  System.out.println(loai);
}
```

**Đoán trước khi chạy — Chín điểm, in ra gì?**

- A. `Giỏi`
- B. `Đạt`
- C. `Trượt`

Kết quả (máy đã chạy thật):

```text
Đạt
```

Đáp án đúng: **B**.

Ra Đạt, vậy dòng Giỏi đã biến đi đâu?

### ĐẢO THỨ TỰ — Hẹp trước, rộng sau

Đó là vì Java hỏi từ trên xuống, gặp câu đúng là dừng. Giống xếp loại học lực: hỏi mức Giỏi trước, hỏi ngược thì ai cũng chỉ Đạt. Nhưng thầy cô hiểu ý, còn Java chỉ chạy đúng thứ tự viết.

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  int diem = 9;
  String loai;
  if (diem >= 8) loai = "Giỏi";
  else if (diem >= 5) loai = "Đạt";
  else loai = "Trượt";
  System.out.println(loai);
}
```

Kết quả (máy đã chạy thật):

```text
Giỏi
```

Nên đảo lại: hẹp trước, rộng sau, chín điểm ra Giỏi ngay.

### Ý chính — BA MẢNH — Một chuỗi ba mảnh

Vậy cả chuỗi có ba mảnh, mỗi lần chạy vào tối đa một nhánh. Else if nghĩa là nếu không thì hỏi tiếp, chỉ chạy khi câu trên sai. Còn else không có điều kiện, hứng mọi trường hợp còn lại.

- **if** — câu hỏi đầu tiên
- **else if** — câu trên sai mới hỏi tiếp
- **else** — hứng phần còn lại

Ghi nhớ nhanh: Hỏi từ trên xuống dưới · Hẹp trước rộng sau · Tối đa một nhánh

### BỎ CHỮ ELSE — Hai if rời ghi đè nhau

Nhưng lỡ xóa chữ else ở câu hai, chín điểm ra gì?

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  int diem = 9;
  String loai = "Trượt";
  if (diem >= 8) {
    loai = "Giỏi";
  } if (diem >= 5) {
    loai = "Đạt";
  }
  System.out.println(loai);
}
```

**Đoán trước khi chạy — Bỏ else, in ra gì?**

- A. `Giỏi`
- B. `Đạt`
- C. `Trượt`

Kết quả (máy đã chạy thật):

```text
Đạt
```

Đáp án đúng: **B**.

Ra Đạt, vì hai if giờ độc lập: dòng đầu gán Giỏi. Dòng sau vẫn được hỏi, nên ghi đè thành Đạt. Mẹo dân code: luôn thử số ngay mốc, lỗi hay trốn ở đó.

## Tóm lại

Tóm lại: điều kiện hẹp đứng trước thì chín điểm mới ra Giỏi.

## Câu đố hôm nay

In ra số mấy? Đoán trước, rồi chạy thử. Đáp án ở Ngày 13.

```java
void main() {
  int diem = 8; if (diem > 8) diem = 1;
  else if (diem > 5) diem = 2;
  System.out.println(diem);
}
```

## Bài tập

Xếp hạng thành viên Đồng/Bạc/Vàng theo số đơn.
