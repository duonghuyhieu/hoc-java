# Ngày 5 · int/double, chia nguyên, %

> Java 100 ngày · 1. Dòng code đầu tiên · video 1 phút 9 giây

## Bạn học gì

int/double, chia nguyên, %

## Đáp án câu đố Ngày 4

```java
void main() {
  int soDu = 50000;
  soDu = soDu + soDu;
  System.out.println(soDu + soDu);
}
```

In ra: `200000`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 5 · INT/DOUBLE, CHIA NGUYÊN, %

Hai trăm nghìn là đáp án hôm qua. Bảy viên ngọc chia hai đội, bạn đoán mỗi đội mấy viên?

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int ngoc = 7;
  System.out.println(ngoc / 2);
}
```

**Đoán trước khi chạy — Bạn đoán máy in ra gì?**

- A. `3.5`
- B. `3`
- C. `Lỗi biên dịch`

Kết quả (máy đã chạy thật):

```text
3
```

Đáp án đúng: **B**.

Ra ba, cộng lại mới sáu: một viên biến đi đâu?

### ĐỔI MỘT CHỮ — Đổi đúng một chữ

Khoan đã, chỉ đổi kiểu ngọc thành double, số thập phân.

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  double ngoc = 7;
  System.out.println(ngoc / 2);
}
```

Kết quả (máy đã chạy thật):

```text
3.5
```

Cùng phép chia mà giờ ra ba phẩy năm.

### Ý chính — HAI KIỂU SỐ — Số nguyên khác thập phân

Hóa ra double có chỗ chứa phần lẻ. Còn kiểu số nguyên int thì không. Nên hai số int chia nhau, máy cắt phần lẻ, không làm tròn. Như chia bảy cái bánh cho hai người: mỗi người ba, dư một, chẳng ai cắt bánh. Chỉ khác, máy vứt luôn cái dư, muốn lấy phải dùng dấu phần trăm.

- **double** — số thập phân
- **int** — số nguyên
- **/** — hai int: cắt phần lẻ
- **%** — lấy phần dư

Ghi nhớ nhanh: int số nguyên · double thập phân · % phần dư

### PHÉP LẤY DƯ — % trả về phần dư

Quay lại viên ngọc mất tích: mỗi đội ba viên. Còn phép lấy dư trả về đúng viên đó. Nhặt thêm một viên, ngọc lên tám.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  int ngoc = 7;
  int moiDoi = ngoc / 2;
  int conDu = ngoc % 2;
  System.out.println(moiDoi);
  System.out.println(conDu);
  ngoc = ngoc + 1;
  conDu = ngoc % 2;
  System.out.println(conDu);
}
```

Kết quả (máy đã chạy thật):

```text
3
1
0
```

Nên số dư về không. Mẹo dân code: chia hai dư không là số chẵn.

### LỖI HAY GẶP — Thập phân cất vào int

Thế còn chia cho hai chấm không?

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  int ngoc = 7;
  int moiDoi = ngoc / 2.0;
  System.out.println(moiDoi);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 3: incompatible types: possible lossy
conversion from double to int
```

Java từ chối, vì kết quả thập phân không cất vừa biến int. Đổi bên trái sang double là xong.

## Tóm lại

Tóm lại: giờ bạn biết viên ngọc mất nằm ở phép lấy dư.

## Câu đố hôm nay

Có về lại 9 không? Đoán trước, rồi chạy thử. Đáp án ở Ngày 6.

```java
void main() {
  int ngoc = 9;
  System.out.println(ngoc / 2 * 2);
  System.out.println(ngoc % 2);
}
```

## Bài tập

Có 125 phút, in ra «2 giờ 5 phút» bằng / và %.
