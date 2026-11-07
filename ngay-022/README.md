# Ngày 22 · Mảng (1/2)

> Java 100 ngày · 3. Lặp lại · video 1 phút 3 giây

## Bạn học gì

Mảng (1/2): tạo, chỉ số, length, lỗi ngoài biên

## Đáp án câu đố Ngày 21

```java
void main() {
  for (int day = 1; day <= 3; day++)
    for (int ghe = 1; ghe <= day; ghe++)
      System.out.println(ghe);
}
```

In ra: `1` / `1` / `2` / `1` / `2` / `3`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 22 · MẢNG

Sáu dòng hôm qua: một, một hai, một hai ba.

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  int[] gia = {50000, 35000, 20000};
  System.out.println(gia[3]);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
ArrayIndexOutOfBoundsException: Index 3
out of bounds for length 3 (dòng 3)
```

Giỏ ba món, hỏi món số ba là sập. Món đó đi đâu?

### SỬA MỘT SỐ — Đổi 3 thành 2

Bởi mảng đếm từ không: ba món mang số không, một, hai. Lỗi vượt biên chỉ lộ lúc chạy.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  int[] gia = {50000, 35000, 20000};
  System.out.println(gia[2]);
}
```

Kết quả (máy đã chạy thật):

```text
20000
```

Đổi ba thành hai, món cuối hiện ra.

### Ý chính — MẢNG LÀ GÌ — Dãy ô đánh số từ 0

Vậy mảng như dãy tủ gửi đồ siêu thị: ba tủ hết ở số hai. Chỉ khác tạo xong là không thêm ô được. Mọi ô cùng kiểu, số trên cửa là chỉ số.

- **Từ số 0** — ô đầu là gia[0]
- **Cố định** — tạo xong không đổi số ô
- **int[]** — mọi ô cùng một kiểu
- **Chỉ số** — số thứ tự của ô

Ghi nhớ nhanh: int[] dãy số nguyên · gia[0] ô đầu tiên · length số ô

### TẠO VÀ ĐẾM Ô — new và length

Nhưng chưa có giá thì dùng new, nghĩa là tạo mới ba ô. Còn length là số ô. Hai dòng in gì, chọn đi.

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  int[] gia = {50000, 35000, 20000};
  int[] giaMoi = new int[3];
  System.out.println(gia.length);
  System.out.println(giaMoi[0]);
}
```

**Đoán trước khi chạy — Hai dòng in ra gì?**

- A. `2 / 0`
- B. `3 / 0`
- C. `Lỗi khi chạy`

Kết quả (máy đã chạy thật):

```text
3
0
```

Đáp án đúng: **B**.

Ra ba rồi không: ô số nguyên mới tạo bằng không.

### Ô CUỐI — Gán ô và tìm ô cuối

Giờ món giữa giảm: gán ô số một thành ba mươi nghìn. Mẹo dân code: ô cuối luôn là length trừ một, giỏ dài mấy cũng đúng.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  int[] gia = {50000, 35000, 20000};
  gia[1] = 30000;
  int cuoi = gia.length - 1;
  System.out.println(gia[cuoi]);
}
```

Kết quả (máy đã chạy thật):

```text
20000
```

Ở đây bằng hai, in hai mươi nghìn.

## Tóm lại

Tóm lại: giờ bạn biết vì sao ba ô không có số ba.

## Câu đố hôm nay

Hai ô cuối cộng lại? Đoán trước, rồi chạy thử. Đáp án ở Ngày 23.

```java
void main() {
  int[] gia = {40000, 15000, 60000};
  gia[gia.length - 2] = 9000;
  System.out.println(gia[1] + gia[2]);
}
```

## Bài tập

Mảng trăm món, chẳng lẽ gõ trăm dòng in?
