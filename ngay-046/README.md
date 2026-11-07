# Ngày 46 · Ôn tập chặng Lớp & đối tượng

> Java 100 ngày · 5. Lớp & đối tượng · video 1 phút 45 giây

## Bạn học gì

Ôn tập chặng Lớp & đối tượng

## Đáp án câu đố Ngày 45

```java
void main() {
  final int[] kien = {1, 2};
  kien[0] = 9;
  System.out.println(kien[0] + kien[1]);
}
```

In ra: `11`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 46 · ÔN TẬP LỚP & ĐỐI TƯỢNG

Mười một nhé, final chỉ khóa biến, ruột mảng vẫn đổi. Ôn chặng bằng cái ví: mã chưa có, đo ra mấy?

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  String maVi = null;
  System.out.println(maVi.length());
}
```

**Đoán trước khi chạy — Độ dài mã ví ra mấy?**

- A. `0`
- B. `null`
- C. `Lỗi khi chạy`

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
NullPointerException: Cannot invoke
"String.length()" because "maVi" is null
(dòng 3)
```

Đáp án đúng: **C**.

Máy sập, không ra số không, vì sao?

### NULL — Rỗng khác chưa có gì

Chính null là thủ phạm: biến chưa trỏ tới đâu, lấy gì mà đo.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  String maVi = "";
  System.out.println(maVi.length());
}
```

Kết quả (máy đã chạy thật):

```text
0
```

Chuỗi rỗng là chuỗi thật, độ dài bằng không.

### CLASS & NEW — Nạp trăm nghìn còn bao nhiêu?

Giờ nâng thành lớp Ví, class là cái khuôn. Còn new, tức tạo mới, đúc ra ví một trăm nghìn. Số dư in ra bao nhiêu?

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
class Vi {
  int soDu;
  Vi(int soDu) { soDu = soDu; }
}
void main() {
  Vi vi = new Vi(100000);
  System.out.println(vi.soDu);
}
```

**Đoán trước khi chạy — Số dư in ra bao nhiêu?**

- A. `100000`
- B. `0`
- C. `Lỗi biên dịch`

Kết quả (máy đã chạy thật):

```text
0
```

Đáp án đúng: **B**.

Không đồng, tiền bốc hơi trong hàm tạo mà Java chẳng báo.

### THIS — Một chữ cứu số dư

Thì ra tham số trùng tên tự gán cho chính nó.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
class Vi {
  int soDu;
  Vi(int soDu) { this.soDu = soDu; }
}
void main() {
  Vi vi = new Vi(100000);
  System.out.println(vi.soDu);
}
```

Kết quả (máy đã chạy thật):

```text
100000
```

Thêm this, tức chính ví này, tiền về đúng chỗ. Mẹo dân code: bấm Alt Insert, IntelliJ sinh sẵn hàm tạo.

### THAM CHIẾU — Ví phụ sửa tiền ví gốc ra sao?

Vậy gán ví sang biến phụ, rồi đặt ba mươi nghìn. Ví gốc giờ in ra bao nhiêu?

File `Buoc4.java` — chạy: `java Buoc4.java`

```java
class Vi {
  int soDu;
  Vi(int soDu) { this.soDu = soDu; }
}
void main() {
  Vi vi = new Vi(100000);
  Vi viPhu = vi;
  viPhu.soDu = 30000;
  System.out.println(vi.soDu);
}
```

**Đoán trước khi chạy — Ví gốc in ra bao nhiêu?**

- A. `100000`
- B. `30000`
- C. `Lỗi biên dịch`

Kết quả (máy đã chạy thật):

```text
30000
```

Đáp án đúng: **B**.

Cũng ba mươi nghìn, vì hai biến cùng nhãn một, chung một ví. Gán đối tượng chỉ chép tham chiếu.

### Ý chính — GIỮ VÍ — Bốn món của một ví

Chính vì thế số dư phải private, tức riêng tư, đổi qua hàm kiểm tra. Mã ví gắn final, gán một lần. Còn static thuộc cả lớp, mọi ví chung một bản. Và hàm tự giới thiệu giúp ví in ra dễ đọc.

- **private** — đổi qua hàm kiểm tra
- **final** — gán một lần
- **static** — cả lớp chung một bản
- **toString** — ví tự giới thiệu khi in

Ghi nhớ nhanh: private riêng tư · final gán một lần · static dùng chung

### LỖI HAY GẶP — Hàm static đọc số dư

Thế mà gắn static vào hàm in là hỏng.

File `Loi2.java` — chạy: `java Loi2.java`

```java
class Vi {
  int soDu = 100000;
  static void inSoDu() {
    System.out.println(soDu);
  }
}
void main() {
  Vi.inSoDu();
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
Dòng 4: non-static variable soDu cannot be
referenced from a static context
```

Java chặn ngay, vì hàm của lớp không biết số dư ví nào. Bỏ static đi, gọi hàm trên một ví cụ thể.

### TỔNG KẾT CHẶNG: LỚP & ĐỐI TƯỢNG

Vậy là cả chặng gọn trong tám thẻ. Nhớ nhất: tiền bốc hơi vì tự gán, ví phụ sửa ví gốc. Lưu thẻ lại để ôn.

- Ngày 36 · Class & object — Lệnh in kia đứng ngoài main, còn mỗi new một đối…
- Ngày 38 · Constructor & this — Thiếu this thì tham số tự gán cho chính nó.
- Ngày 39 · Phương thức của đối tượng… — Dãy mã lúc đầu chỉ vì kiện chưa biết tự giới thiệu.
- Ngày 40 · Tham chiếu — Mã giảm mất vì hàm chỉ trừ trên bản chép.
- Ngày 42 · null & NullPointerException — Chuỗi rỗng đo được, null thì không.
- Ngày 43 · Đóng gói — Private, tách file, mọi thay đổi qua quầy kiểm tra.
- Ngày 44 · static — Static thuộc lớp, nên số ba chẳng cần vé.
- Ngày 45 · final — Final khóa biển số, nên áo vẫn lên xe.

## Tóm lại

Tóm lại: biến chỉ cầm tham chiếu, nên null mới làm máy sập.

## Câu đố hôm nay

In ra true hay false? Đoán trước, rồi chạy thử. Đáp án ở Ngày 47.

```java
void main() {
  int[] viGoc = {50000};
  int[] viPhu = {50000};
  System.out.println(viGoc == viPhu);
}
```

## Bài tập

Viết lớp Vi có soDu private, hàm nạp chặn số âm, static đếm tổng số ví.
