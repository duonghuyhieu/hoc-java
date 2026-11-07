# Ngày 42 · null & NullPointerException

> Java 100 ngày · 5. Lớp & đối tượng · video 1 phút 17 giây

## Bạn học gì

null & NullPointerException

## Đáp án câu đố Ngày 41

```java
void main() {
  int[] tong = {200};
  int[] banSao = tong; banSao[0] = 0;
  System.out.println(tong[0]);
}
```

In ra: `0`

## Bài học

_Đi theo đúng thứ tự video. Lời giảng là lời đọc trong video; code và kết quả là bản máy đã chạy thật._

### NGÀY 42 · NULL & NULLPOINTEREXCEPTION

Câu đố trước ra số không: hai biến chung mảng.

File `Buoc1.java` — chạy: `java Buoc1.java`

```java
void main() {
  String maGiam = "";
  System.out.println(maGiam.length());
}
```

Kết quả (máy đã chạy thật):

```text
0
```

Mã giảm giá gói nhạc đang rỗng, đo ra số không. Đổi đúng một từ, chương trình sập, từ nào?

### ĐỔI MỘT TỪ — Rỗng đổi thành null

Đó là từ null, tức biến chưa trỏ đối tượng nào. Cùng lệnh đo, bạn đoán lần này ra gì?

File `Loi1.java` — chạy: `java Loi1.java`

```java
void main() {
  String maGiam = null;
  System.out.println(maGiam.length());
}
```

**Đoán trước khi chạy — Lần này ra gì?**

- A. `4`
- B. `Lỗi biên dịch`
- C. `Lỗi khi chạy`

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
NullPointerException: Cannot invoke
"String.length()" because "maGiam" is null
(dòng 3)
```

Đáp án đúng: **C**.

Biên dịch vẫn qua, vì nó chỉ soát kiểu. Lúc chạy mới sập: lỗi con trỏ rỗng.

### Ý chính — NULL LÀ GÌ — null là chưa có gì

Vậy là bạn đòi đo mã giảm giá chưa có. Đời thật báo chưa có, còn Java sập luôn. Chuỗi rỗng là đối tượng thật, còn null là không có gì. Chỉ biến tham chiếu mới nhận null, số nguyên int thì không.

- **null** — chưa trỏ đối tượng nào
- **NullPointerException** — gọi phương thức trên null
- **""** — chuỗi rỗng, đối tượng thật
- **Tham chiếu** — mới nhận null, int thì không

Ghi nhớ nhanh: Tham chiếu nhận null · Gọi trên null là sập · int không nhận null

### HỎI TRƯỚC KHI ĐO — Kiểm tra trước khi gọi

Nên trước khi đo, hỏi biến có khác null không.

File `Buoc2.java` — chạy: `java Buoc2.java`

```java
void main() {
  String maGiam = null;
  int doDai = 0;
  if (maGiam != null) {
    doDai = maGiam.length();
  }
  System.out.println(doDai);
}
```

Kết quả (máy đã chạy thật):

```text
0
```

Chưa có mã thì bỏ qua, độ dài giữ số không.

### CÓ MÃ THẬT — Một đoạn code hai trường hợp

Thế còn khi gắn mã thật? Độ dài đang là không. Qua dòng đo nó nhảy lên năm.

File `Buoc3.java` — chạy: `java Buoc3.java`

```java
void main() {
  String maGiam = "NHAC9";
  int doDai = 0;
  if (maGiam != null) {
    doDai = maGiam.length();
  }
  System.out.println(doDai);
}
```

Kết quả (máy đã chạy thật):

```text
5
```

Một đoạn, an toàn cả hai trường hợp.

### LỖI HAY GẶP — Trường chưa gán cũng là null

Nhưng null còn trốn kín hơn: trường chuỗi chưa gán mặc định là null.

File `Loi2.java` — chạy: `java Loi2.java`

```java
class GoiNhac {
  String maGiam;
}

void main() {
  GoiNhac goi = new GoiNhac();
  int doDai = goi.maGiam.length();
  System.out.println(doDai);
}
```

Lỗi máy báo (cố ý; rút gọn như trên video):

```text
NullPointerException: Cannot invoke
"String.length()" because "goi.maGiam" is
null (dòng 7)
```

Nên dòng này sập, dù trông bình thường. Mẹo dân code: đọc sau chữ because, từ bản mười bốn Java nêu đúng biến null. Ở đây là mã của gói, nên gán trước.

## Tóm lại

Tóm lại: chuỗi rỗng đo được, null thì không.

## Câu đố hôm nay

Sập hay in ra gì? Đoán trước, rồi chạy thử. Đáp án ở Ngày 43.

```java
void main() {
  String maGiam = null;
  System.out.println(maGiam + "!");
}
```

## Bài tập

Tên bài hát có thể null: kiểm tra null trước khi gọi length().
